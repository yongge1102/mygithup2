package com.wisely.highlight_spring4.ch3.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch3.taskscheduler")
/**
 * @EnableScheduling：激活任务计划，会自动加载 @ComponentScan下的所有 @Scheduled任务
 * @author Administrator
 *
 */
@EnableScheduling
public class TaskSchedulerConfig {

}
