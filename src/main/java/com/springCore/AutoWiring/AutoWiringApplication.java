package com.springCore.AutoWiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springCore.Human;

import org.springframework.context.ApplicationContext;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutoWiringApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Human human = context.getBean("human", Human.class);
		
	}

}
