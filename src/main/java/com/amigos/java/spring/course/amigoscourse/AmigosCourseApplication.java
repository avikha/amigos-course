package com.amigos.java.spring.course.amigoscourse;

import com.amigos.java.spring.course.amigoscourse.customer.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AmigosCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmigosCourseApplication.class, args);
	}

}
