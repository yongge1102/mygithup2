package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Configuration：代表这个类是一个配置类。
   @ComponentScan：用来扫描指定包下面的注解类。
 * @EnableAspectJAutoProxy：开启spring对AspectJ代理的支持
 *
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch1.aop")
@EnableAspectJAutoProxy //1
public class AopConfig {

}
