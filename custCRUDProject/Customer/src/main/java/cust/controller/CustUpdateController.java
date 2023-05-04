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
import cust.service.CustUpdateService;

@WebServlet("/cust/update")
public class CustUpdateController extends HttpServlet {

	CustUpdateService updateService;
	CustDetailSerivce detailService;
	
    public CustUpdateController() {
    	this.updateService = CustUpdateService.getInstance();
    	this.detailService = CustDetailSerivce.getInstance();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("CustUpdateController...doGet()...");

		int custid = Integer.parseInt(request.getParameter("custid"));
		
		CustDTO dto = detailService.getCust(custid);
		
		request.setAttribute("cust", dto);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/cust/update.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("CustUpdateController...doPost()...");
		
		int custid = Integer.parseInt(request.getParameter("custid"));
		String name =request.getParameter("name");
		String address =request.getParameter("address");
		String phone =request.getParameter("phone");
		
		CustDTO dto = new CustDTO(custid, name, address, phone);
		
		int result = updateService.updateCust(dto);
		
		if(result >0) {
			System.out.println("업데이트 성공");
		}else {
			System.out.println("업데이트 실패");
		}
		
		response.sendRedirect("list");
		
	}

}
