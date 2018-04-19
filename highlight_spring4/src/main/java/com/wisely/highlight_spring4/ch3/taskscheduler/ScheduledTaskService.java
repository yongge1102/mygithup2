package com.wisely.highlight_spring4.ch3.taskscheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTaskService {
	
	  private static final SimpleDateFormat dateFormat = 
			  new SimpleDateFormat("HH:mm:ss");

	  /**
	   * 固定5秒执行一次
	   */
	  @Scheduled(fixedRate = 5000) //1
	  public void reportCurrentTime() {
	       System.out.println("每隔五秒执行一次 " + dateFormat.format(new Date()));
	   }
	  
	  /**
	   * 固定5秒执行一次
	   */
	  @Scheduled(fixedRate = 3000) //1
	  public void reportCurrentTime2() {
	       System.out.println("我的测试：每隔3秒执行一次 " + dateFormat.format(new Date()));
	   }

	  /**
	   * 固定每天的 15点29分执行
	   */
	  @Scheduled(cron = "0 29 15 ? * *"  ) //2
	  public void fixTimeExecution(){
	      System.out.println("在指定时间 " + dateFormat.format(new Date())+"执行");
	  }

}
