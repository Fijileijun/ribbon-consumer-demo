package io.jacobs.stu.springcloud.base.controller;

import io.jacobs.stu.springcloud.base.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Jacobs on 2017/8/5.
 */
@RestController
public class HelloServiceConsumerController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/consumeHello")
    public String sayHi(){
        return helloService.sayHi();

    }
}
