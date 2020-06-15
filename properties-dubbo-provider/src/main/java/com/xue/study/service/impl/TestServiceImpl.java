package com.xue.study.service.impl;

import com.xue.study.model.Book;
import com.xue.study.service.TestService;
import net.sf.json.JSONObject;
import org.apache.dubbo.config.annotation.Service;

/**
 * Author: mf015
 * Date: 2020/6/15 0015
 */
@Service
public class TestServiceImpl implements TestService {
//    @Override
//    public JSONObject getJGBook(JSONObject params) {
//        String bookName = params.containsKey("book") ? params.getString("book") : "";
//        System.out.println("bookName----"+bookName);
//
//        JSONObject jgBookObj = new JSONObject();
//        jgBookObj.put("bookName", "《少林金刚掌》");
//        jgBookObj.put("author", "达摩老祖");
//        return jgBookObj;
//    }

    @Override
    public Book getJGBook(JSONObject params) {
        String bookName = params.containsKey("book") ? params.getString("book") : "";
        System.out.println("bookName----"+bookName);

        Book jgBook = new Book();
        jgBook.setBook("《少林金刚掌》");
        jgBook.setAuthor("达摩老祖");
        return jgBook;
    }
}
