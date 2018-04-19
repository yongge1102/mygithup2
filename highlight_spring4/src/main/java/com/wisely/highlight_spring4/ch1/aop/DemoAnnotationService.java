package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * 被拦截类：注解方式
 * @author Administrator
 *
 */
@Service
public class DemoAnnotationService {
	@Action(name="注解式拦截的add操作====")
    public void add(){} 
   
}
