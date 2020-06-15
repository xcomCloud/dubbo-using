package com.xue.study;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Author: mf015
 * Date: 2020/6/15 0015
 */
@SpringBootApplication
public class DubboStarter {
    private static final Logger LOGGER = LoggerFactory.getLogger(DubboStarter.class);

    public static void main(String[] args) {
        SpringApplication.run(DubboStarter.class, args);
        LOGGER.info("#### dubbo-using ####");
    }
}
