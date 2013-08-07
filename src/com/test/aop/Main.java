package com.test.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.App.Circle;
import com.test.App.Triangle;

public class Main {

	
	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Circle c=context.getBean("circle", Circle.class);
		System.out.println(c.getName());
		Triangle t=context.getBean("triangle", Triangle.class);
		System.out.println(t.getName());
	}

}
