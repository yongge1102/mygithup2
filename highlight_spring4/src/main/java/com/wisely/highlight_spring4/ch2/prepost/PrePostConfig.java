package com.wisely.highlight_spring4.ch2.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch2.prepost")
public class PrePostConfig {
	
	/**
	 * Java配置方式
	 * @return
	 */
	@Bean(initMethod="init",destroyMethod="destroy") //1
	BeanWayService beanWayService(){
		return new BeanWayService();
	}
	
	/**
	 * 注解方式
	 * @return
	 */
	@Bean
	JSR250WayService jsr250WayService(){
		return new JSR250WayService();
	}

}
