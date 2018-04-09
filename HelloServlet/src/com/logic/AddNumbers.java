package com.logic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddNumbers")
public class AddNumbers extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AddNumbers() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String as=request.getParameter("a");
		int a=Integer.parseInt(as);
		
		String bs=request.getParameter("b");
		int b=Integer.parseInt(bs);
		
		Addition myobj=new Addition();
		int result=myobj.add(a, b);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>Addition Result</h1>");
		out.print("The result is : <b>"+result+"</b>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
