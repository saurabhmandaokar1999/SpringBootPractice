package com.saurabh.beans;
import org.springframeWork.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathApplicationContext(spring-beans.xml);
		RestaurentService rs = ctx.getBean(RestaurentService.class);
		rs.processPayment(1000.00);
	}
}
