package com.wisely.highlight_spring4.ch3.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConditionConifg.class);
		
		/**
		 * 获取ListService对象，可能是WindowsListService，也有可能是LinuxListService
		 */
		ListService listService = context.getBean(ListService.class);

		System.out.println(context.getEnvironment().getProperty("os.name") 
				+ "系统下的列表命令为: " 
				+ listService.showListCmd());
		
		context.close();
	}
}
