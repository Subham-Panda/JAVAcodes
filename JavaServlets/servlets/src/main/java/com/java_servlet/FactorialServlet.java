package com.java_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FactorialServlet")
public class FactorialServlet extends HttpServlet {
	
	public FactorialServlet() {
		super();
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String method = req.getMethod();
		if(method=="GET") {
			doGet(req, resp);
		} else if(method=="POST") {
			doPost(req, resp);
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			resp.setContentType("text/html");
			PrintWriter pout = resp.getWriter();
			int number = Integer.parseInt(req.getParameter("factnumber"));
			long fact = 1;
			for (int i = 1; i <= number; i++) {
				fact = fact * i;
			}
			pout.print(fact);
			pout.flush();
			pout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
