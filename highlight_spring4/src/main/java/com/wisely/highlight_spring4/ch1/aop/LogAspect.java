package com.wisely.highlight_spring4.ch1.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;


//声明注解一个切面
@Aspect //1
//让切面成为Spring管理容器的Bean
@Component //2
public class LogAspect {
	
	/**
	 * 声明切点
	 */
	@Pointcut("@annotation(com.wisely.highlight_spring4.ch1.aop.Action)") //3
	public void annotationPointCut(){};
	
	/**
	 * 注解声明一个建言，并使用@Pointcut定义的确定
	 * @param joinPoint
	 */
	  @After("annotationPointCut()") //4
	    public void after(JoinPoint joinPoint) {
	        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
	        Method method = signature.getMethod();
	        Action action = method.getAnnotation(Action.class); 
	        System.out.println("注解方式拦截:" + action.name()); //5
	    }
	  
	   @Before("execution(* com.wisely.highlight_spring4.ch1.aop.DemoMethodService.*(..))") //6
	    public void before(JoinPoint joinPoint){
	        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
	        Method method = signature.getMethod();
	        System.out.println("方法规则方式拦截:"+method.getName());

	    }
	   
	  
	
}
