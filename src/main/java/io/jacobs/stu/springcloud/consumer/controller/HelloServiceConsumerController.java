package io.jacobs.stu.springcloud.consumer.controller;

import io.jacobs.stu.springcloud.consumer.model.User;
import io.jacobs.stu.springcloud.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(path = "/user/add",method = RequestMethod.POST)
    public User createUser(@RequestBody User user) {
        return  user;
    }

    @RequestMapping("/user/{userName}")
    public User get(@PathVariable("userName") String userName){
        return new User();
    }

    @RequestMapping("/user/get")
    public User getByUserName(@RequestParam("userName") String userName){
        return new User();
    }

}
