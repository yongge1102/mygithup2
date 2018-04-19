package com.wisely.highlight_spring4.ch1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration：代表这个类是一个配置类。
   @ComponentScan：用来扫描指定包下面的注解类。
 * @author Administrator
 *
 */
@Configuration //1
@ComponentScan("com.wisely.highlight_spring4.ch1.di") //2
public class DiConfig {

}
