package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		/**
		 * AnnotationConfigApplicationContext：spring容器
		 */

		 AnnotationConfigApplicationContext context =
	                new AnnotationConfigApplicationContext(AopConfig.class); //1
		 
		 /**
		  * 被拦截类：注解方式
		  */
		 DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
		 /**
		  * 被拦截类：方法规则方式
		  * @author Administrator
		  *
		  */
		 DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
		 
		 demoAnnotationService.add();
		 demoMethodService.add();
		 
		 context.close();
	}

}
