package com.study.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/req/1")
public class RequestParams1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println(req.getContentType());
		System.out.println(req.getLocalAddr());
		System.out.println(req.getLocalPort()); //port num
		System.out.println(req.getMethod());
		System.out.println(req.getRequestURI()); //resource path
		System.out.println(req.getQueryString()); //?뒤에 parameter
		
		String test = req.getParameter("test");
		String name = req.getParameter("name");
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain; charset=utf8"); //response할때의 언어, 한국어는 설정 따로 해줘야
		resp.getWriter().print("test : " + test);
		resp.getWriter().print("name : " + name);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
