package com.loger.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.loger.entity.User;

public class novelController implements Controller {

	@Override
	@RequestMapping("/time_show")
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//调用service查找数据库，
		List<User> list=new ArrayList<User>();
		ModelAndView model=new ModelAndView();
		//相当于request的setAttribut
		model.addObject("list",list);
		
		//指定视图
		model.setViewName("/novel/WebContent/WEB-INF/views/time_show.jsp");
		// TODO Auto-generated method stub
		return model;
	}
	
	

}
