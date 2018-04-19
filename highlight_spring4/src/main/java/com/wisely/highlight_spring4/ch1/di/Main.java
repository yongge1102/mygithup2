package com.wisely.highlight_spring4.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		/**
		 * AnnotationConfigApplicationContext：spring容器
		 */
		 AnnotationConfigApplicationContext context =
	                new AnnotationConfigApplicationContext(DiConfig.class); //1
		 
		 /**
		  * context.getBean(UseFunctionService.class)：通过注解生成对象
		  */
		 UseFunctionService useFunctionService = 
				 context.getBean(UseFunctionService.class); //2
		 
		 System.out.println(useFunctionService.SayHello("world1111"));
		 
		 context.close();
	}
}
