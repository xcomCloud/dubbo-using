package com.xue.study.dubbo;


import com.xue.study.model.Book;
import com.xue.study.service.TestService;
import net.sf.json.JSONObject;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * Author: mf015
 * Date: 2020/6/15 0015
 */
@Component("annotatedConsumer")
public class TestServiceImporter {

    @Reference
    private TestService testService;

    public String getJGbOOK(){
        JSONObject request = new JSONObject();
        request.put("book", "少林金刚经");

        Book jgBook = testService.getJGBook(request);
        System.out.println("-------------------------");
        System.out.println("rpc getJGBook = "+jgBook);
        return jgBook.toString();
    }
}
