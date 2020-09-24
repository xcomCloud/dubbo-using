package com.xue.study.service.impl;

import com.xue.study.service.ProTestService;
import net.sf.json.JSONObject;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * Author: mf015
 * Date: 2020/6/15 0015
 */
@Component("annotatedConsumer1")
public class ProTestServiceImpl {

    @Reference
    private ProTestService proTestService;

    public JSONObject getJGbOOK(){
        JSONObject request = new JSONObject();
        request.put("book", "少林金刚经");
        System.out.println("----"+proTestService.toString());
        JSONObject jgBook = proTestService.getJGBook(request);
        System.out.println("-------------------------");
        System.out.println("rpc getJGBook = "+jgBook);
        return jgBook;
    }

    //    public Book getJGbOOK(){
//        JSONObject request = new JSONObject();
//        request.put("book", "少林金刚经");
//
//        Book jgBook = testService.getJGBook(request);
//        System.out.println("-------------------------");
//        System.out.println("rpc getJGBook = "+jgBook);
//        return jgBook;
//    }
}
