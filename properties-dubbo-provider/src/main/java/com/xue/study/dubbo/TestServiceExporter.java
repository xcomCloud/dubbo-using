package com.xue.study.dubbo;

import com.xue.study.model.Book;
import com.xue.study.service.TestService;
import net.sf.json.JSONObject;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Author: mf015
 * Date: 2020/6/15 0015
 */
@Service
public class TestServiceExporter {
    @Autowired
    private TestService testService;

    public Book exportJGBook(JSONObject params){
     return testService.getJGBook(params);
    }

}
