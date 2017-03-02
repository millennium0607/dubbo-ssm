package com.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.provider.DemoService;

public class Consumer {
	public static void main(String[] args) {
		// ClassPathXmlApplicationContext context = new
		// ClassPathXmlApplicationContext(
		// "file:E:/web����/znn-service-consumer/WebRoot/WEB-INF/dubbo-consumer.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "dubbo-consumer.xml" });
		context.start();
		DemoService demoService = (DemoService) context.getBean("demoService"); // ��ȡԶ�̷������
		String random = demoService.getRandom(); // ִ��Զ�̷���
		System.out.println(random);
	}
}
