package cust.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cust.dto.CustDTO;
import cust.service.CustDetailSerivce;

@WebServlet("/cust/detail")
public class CustDetailController extends HttpServlet {

	CustDetailSerivce detailService;
	
    public CustDetailController() {
    	this.detailService = CustDetailSerivce.getInstance();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("CustDetailController...doGet()...");
		
		String custidStr = request.getParameter("custid");
		int custid = Integer.parseInt(custidStr);
		
		CustDTO dto = detailService.getCust(custid);
		
		request.setAttribute("cust", dto);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/cust/detail.jsp");
		dispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
