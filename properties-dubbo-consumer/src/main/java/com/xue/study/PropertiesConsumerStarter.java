package com.xue.study;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Author: mf015
 * Date: 2020/6/15 0015
 * <p>
 * ############################# 跑出来的结论 ##########################################
 * 1. 交互的数据格式 -可以是序列化的java obj,也可以是JSONObject
 * 2. provider和consumer是基于同一个service，所以service必须相同 —— 一般会抽一个公共service接口出来
 * 3. zookeeper只是个注册中心
 */

@SpringBootApplication
@EnableDubbo
public class PropertiesConsumerStarter {
    private static final Logger LOGGER = LoggerFactory.getLogger(PropertiesConsumerStarter.class);

    public static void main(String[] args) {
        SpringApplication.run(PropertiesConsumerStarter.class, args);
        LOGGER.info("#### properties-consumer-starter ####");


    }
}
