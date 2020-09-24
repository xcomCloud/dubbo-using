package com.xue.study;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Author: mf015
 * Date: 2020/6/15 0015
 */
@SpringBootApplication
@EnableDubbo
public class PropertiesProvider {
    private static final Logger LOGGER = LoggerFactory.getLogger(PropertiesProvider.class);

    public static void main(String[] args) {
        SpringApplication.run(PropertiesProvider.class, args);
        LOGGER.info("#### properties-dubbo-provider ####");
    }
}
