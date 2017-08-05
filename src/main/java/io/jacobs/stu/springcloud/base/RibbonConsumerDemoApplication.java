package io.jacobs.stu.springcloud.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RibbonConsumerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonConsumerDemoApplication.class, args);
	}
}
