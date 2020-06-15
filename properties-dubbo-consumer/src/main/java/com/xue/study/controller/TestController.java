package com.xue.study.controller;

import com.xue.study.dubbo.TestServiceImporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: mf015
 * Date: 2020/6/15 0015
 */
@RestController
public class TestController {

    @Autowired
    private TestServiceImporter serviceImporter;

    @GetMapping(value = "book")
    public String getBook(){
        return serviceImporter.getJGbOOK();
    }
}
