package com.wisely.highlight_spring4.ch3.taskexecutor;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;


@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch3.taskexecutor")
/**
 * @EnableAsync:开启异步任务
 * @author Administrator
 *
 */
@EnableAsync //1 
/**
 * AsyncConfigurer:异步任务配置类
 * @author Administrator
 *
 */
public class TaskExecutorConfig implements AsyncConfigurer{//2

	@Override
	public Executor getAsyncExecutor() {//2
		 ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
		    /**
		     * setCorePoolSize:设置线程池初始化大小5
		     */
	        taskExecutor.setCorePoolSize(1);
	        /**
		     * setMaxPoolSize:设置线程池最大值10
		     */
	        taskExecutor.setMaxPoolSize(1);
	        /**
		     * setQueueCapacity:设置线程池队列大小25
		     */
	        taskExecutor.setQueueCapacity(25);
	        /**
		     * initialize:初始化线程池
		     */
	        taskExecutor.initialize();
	        return taskExecutor;
	}

	@Override
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		return null;
	}

}
