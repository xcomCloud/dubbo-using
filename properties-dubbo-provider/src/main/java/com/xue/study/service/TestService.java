package com.xue.study.service;

import com.xue.study.model.Book;
import net.sf.json.JSONObject;

/**
 * Author: mf015
 * Date: 2020/6/15 0015
 */

public interface TestService {

//    //获取少林寺的金刚掌
//    JSONObject getJGBook(JSONObject params);

    //获取少林寺的金刚掌
    Book getJGBook(JSONObject params);
}
