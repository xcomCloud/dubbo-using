package com.xue.study.controller;

import com.xue.study.service.impl.ProTestServiceImpl;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: mf015
 * Date: 2020/6/16 0016
 */
@RestController
public class TestController {

    @Autowired
    private ProTestServiceImpl proTestServiceImpl;

    @GetMapping(value = "/test/svc1")
    public JSONObject testGettingSVC() {
        return proTestServiceImpl.getJGbOOK();
    }
}
