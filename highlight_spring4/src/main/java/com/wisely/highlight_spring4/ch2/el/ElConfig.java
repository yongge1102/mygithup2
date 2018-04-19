package com.wisely.highlight_spring4.ch2.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch2.el")
@PropertySource("classpath:com/wisely/highlight_spring4/ch2/el/test.properties")//7
public class ElConfig {
	
	//注入普通字符串
	@Value("I Love You!") //1
    private String normal;

	//注入操作系统属性
	@Value("#{systemProperties['os.name']}") //2
	private String osName;
	
	//注入表达式结果
	@Value("#{ T(java.lang.Math).random() * 100.0 }") //3
    private double randomNumber;

	//注入其它Bean属性
	@Value("#{demoService.another}") //4
	private String fromAnother;

	//注入文件资源
	@Value("classpath:com/wisely/highlight_spring4/ch2/el/test.txt") //5
	private Resource testFile;

	//注入网址资源
	@Value("http://www.baidu.com") //6 
	private Resource testUrl;

	//注入配置文件
	@Value("${book.name}") //7 
	private String bookName;

	@Autowired
	private Environment environment; //7
	
	@Bean //7
	public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	


	public void outputResource() {
		try {
			System.out.println(normal);
			System.out.println(osName);
			System.out.println(randomNumber);
			System.out.println(fromAnother);
			
			System.out.println(IOUtils.toString(testFile.getInputStream()));
			System.out.println(IOUtils.toString(testUrl.getInputStream()));
			System.out.println(bookName);
			System.out.println(environment.getProperty("book.author"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
}
