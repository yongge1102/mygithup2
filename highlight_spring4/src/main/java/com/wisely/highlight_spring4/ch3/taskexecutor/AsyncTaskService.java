package com.wisely.highlight_spring4.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
@Service
public class AsyncTaskService {
	
	/**
	 * @Async:标注为异步任务
	 * @param i
	 */
	@Async //1
    public void executeAsyncTask(Integer i){
        System.out.println("执行异步任务: "+i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务+1: "+(i+1));
    }

}
