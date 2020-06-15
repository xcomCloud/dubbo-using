package com.xue.study;

import com.xue.study.dubbo.TestServiceImporter;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Author: mf015
 * Date: 2020/6/15 0015
 */
@SpringBootApplication
public class PropertiesConsumerStarter {
    public static final Logger LOGGER = LoggerFactory.getLogger(PropertiesConsumerStarter.class);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConf.class);
        context.start();
        TestServiceImporter testServiceImporter = context.getBean(TestServiceImporter.class);
        String jGbOOK = testServiceImporter.getJGbOOK();
        System.out.println("----------------");
        System.out.println("+++++"+jGbOOK);

        SpringApplication.run(PropertiesConsumerStarter.class, args);
        LOGGER.info("#### properties-consumer-starter ####");

    }

    @Configuration
    @EnableDubbo(scanBasePackages = "com.xue.study.dubbo.TestServiceImporter")
    @PropertySource("classpath:/dubbo-consumer.properties")
    @ComponentScan(value = {"com.xue.study.dubbo"})
    static class ConsumerConf{

    }
}
