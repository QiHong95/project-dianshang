package com.qh.app.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.ds.dao.UserDao;
import com.ds.domain.User;
import com.ds.service.UserInfoService;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration("file:src/main/webapp/WEB-INF/springmvc-servlet.xml") 
public class MyTest {

	@Autowired
	UserDao userDao;
	/**
	 * 测试UserDaoBean
	 */
	@Test
	public void test(){
		System.out.println(userDao.selectAll());
	}
	
	@Autowired
	UserInfoService userInfoService;
	/**
	 * 测试UserServiceBean
	 */
	@Test
	public void test2(){
		User user=userInfoService.getUserByUserId(1);
//		User user=userDao.selectById(1);
		System.out.println(user);
	}
	@Test
	public void test3(){
		try{
			
			Assert.isNull("123", "不是null");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	
}
