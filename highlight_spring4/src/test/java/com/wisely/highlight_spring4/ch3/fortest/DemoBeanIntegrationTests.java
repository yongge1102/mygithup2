package com.wisely.highlight_spring4.ch3.fortest;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/***
 * 
 * @RunWith(SpringJUnit4ClassRunner.class) :提供spring TestContext Framework支持
 *
 */
@RunWith(SpringJUnit4ClassRunner.class) //1
/**
 * 指定配置类
 * @author Administrator
 *
 */
@ContextConfiguration(classes = {TestConfig.class}) //2
/**
 * @ActiveProfiles("prod"):指定 public TestBean devTestBean()
 * @author Administrator
 *
 */
@ActiveProfiles("prod") //3
public class DemoBeanIntegrationTests {
	/**
	 * @Autowired:注入bean
	 */
	@Autowired //4
	private TestBean testBean;

	@Test //5
	public void prodBeanShouldInject(){
		String expected = "from production profile1";
		String actual = testBean.getContent();
		Assert.assertEquals(expected, actual);
	}

	
}
