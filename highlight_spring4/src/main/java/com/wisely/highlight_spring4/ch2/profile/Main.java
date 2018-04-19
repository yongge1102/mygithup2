package com.wisely.highlight_spring4.ch2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		  AnnotationConfigApplicationContext context =  
				  new AnnotationConfigApplicationContext();
		  
		  /**
		   * 设置Profiles的环境标识为 dev
		   */
		  context.getEnvironment().setActiveProfiles("dev"); //1
		  /**
		   * 注册Bean类
		   */
		  context.register(ProfileConfig.class);//2
		  /**
		   * 刷新容器
		   */
		  context.refresh(); //3
		  
		  /**
		   * 根据环境标识获取Bean对象，其实调用的是 devDemoBean
		   */
	      DemoBean demoBean = context.getBean(DemoBean.class);
	      
	      System.out.println(demoBean.getContent());
	      
	      context.close();
	}
}
