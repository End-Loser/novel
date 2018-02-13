package com.loger.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.loger.entity.User;

public class novelController1 implements HttpRequestHandler {

	@Override
	public void handleRequest(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		
		
}

//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request,
//			HttpServletResponse response) throws Exception {
//		//调用service查找数据库，
//		List<User> list=new ArrayList<User>();
//		ModelAndView model=new ModelAndView();
//		//相当于request的setAttribut
//		model.addObject("list",list);
//		
//		//指定视图
//		model.setViewName("");
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//	

}
