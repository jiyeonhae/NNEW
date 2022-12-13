package com.study.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test1
 */
@WebServlet("/test/1")
public class Test1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public Test1() {
        // TODO Auto-generated constructor stub
    }
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
	
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("phone"));
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter(); //getWriter라는 메소드가 printwriter라는 객체안에 들어있음
		out.print("<html><head><title>TEST!</title></head><body>");
		out.print("<h1> TEst1 Servlet </h1>");
		out.print("</body></html>");
	}
}
