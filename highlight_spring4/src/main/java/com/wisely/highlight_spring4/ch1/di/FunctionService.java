package com.wisely.highlight_spring4.ch1.di;

import org.springframework.stereotype.Service;

/**
 * @Service 声明FunctionService类为Spring管理的一个Bean,使用以下几个注解声明Bean的注解
 * 
	1. @Component：没有明确的角色
	2. @Repository：在数据访问层（dao层）使用
	3. @Controller在展现层（MVC）使用
 * @author Administrator
 *
 */
@Service //1
public class FunctionService {
	public String sayHello(String word){
		return "Hello " + word +" !"; 
	}

}
