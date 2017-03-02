package com.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.provider.DemoService;

public class Consumer {
	public static void main(String[] args) {
		// ClassPathXmlApplicationContext context = new
		// ClassPathXmlApplicationContext(
		// "file:E:/web工程/znn-service-consumer/WebRoot/WEB-INF/dubbo-consumer.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "dubbo-consumer.xml" });
		context.start();
		DemoService demoService = (DemoService) context.getBean("demoService"); // 获取远程服务代理
		String random = demoService.getRandom(); // 执行远程方法
		System.out.println(random);
	}
}
