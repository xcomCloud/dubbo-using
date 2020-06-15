package com.xue.study;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.io.IOException;

/**
 * Author: mf015
 * Date: 2020/6/15 0015
 */
@SpringBootApplication
public class PropertiesProvider {
    private static final Logger LOGGER = LoggerFactory.getLogger(PropertiesProvider.class);

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConf.class);
        context.start();
        System.out.println("--dubbo provider started---------");
        System.in.read();


        SpringApplication.run(PropertiesProvider.class, args);
        LOGGER.info("#### properties-dubbo-provider ####");
    }

    @Configuration
    @EnableDubbo(scanBasePackages = "com.xue.study.dubbo.TestServiceExporter")
    @PropertySource("classpath:/dubbo-provider.properties")
    static class ProviderConf{

    }
}
