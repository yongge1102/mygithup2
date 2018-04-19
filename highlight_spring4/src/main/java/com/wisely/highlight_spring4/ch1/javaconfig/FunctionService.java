package com.wisely.highlight_spring4.ch1.javaconfig;

/**
 * 无使用注解声明Bean对象
 * @author Administrator
 *
 */
//1
public class FunctionService {
	
	public String sayHello(String word){
		return "Hello " + word +" !"; 
	}


}
