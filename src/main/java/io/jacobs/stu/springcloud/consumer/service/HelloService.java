package io.jacobs.stu.springcloud.consumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Jacobs on 2017/8/7.
 */

@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "sayHiMyself")
    @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "1000")
    public String sayHi(){
        long  start = System.currentTimeMillis();
        String helloWord =  restTemplate.getForEntity("http://HELLO-DEV-PROVIDER/hi",String.class)
                .getBody();
        long end = System.currentTimeMillis();
        Logger.getLogger(HelloService.class)
                .info("Speed time is: " +  (end -start) );
        return helloWord;
    }


    public String sayHiMyself(){
        return "Hi the caller,Hello Service is broken. This is myself";
    }
}
