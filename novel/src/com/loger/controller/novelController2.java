package com.loger.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.loger.entity.User;
@Controller
public class novelController2 {

	@RequestMapping("/handleRequest")
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//调用service查找数据库，
		List<User> list=new ArrayList<User>();
		
		User user=new User();
		user.setId("5");
		user.setJob("老师");
		user.setName("尚云龙");
		list.add(user);
		ModelAndView model=new ModelAndView();
		//相当于request的setAttribut
		model.addObject("list",list);
		
		//指定视图
		model.setViewName("");
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
