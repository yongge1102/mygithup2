package com.wisely.highlight_spring4.ch3.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConifg {
	@Bean
	/**
	 * @Conditional(WindowsCondition.class) :符合WindowsCondition条件则实例化windowsListService
	 * @return
	 */
    @Conditional(WindowsCondition.class) //1
    public ListService windowsListService() {
        return new WindowsListService();
    }

    @Bean
    /**
	 * @Conditional(LinuxCondition.class) :符合LinuxCondition条件则实例化linuxListService
	 * @return
	 */
    @Conditional(LinuxCondition.class) //2
    public ListService linuxListService() {
        return new LinuxListService();
    }

}
