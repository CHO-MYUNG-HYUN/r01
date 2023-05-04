package cust.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cust.dto.CustDTO;
import cust.service.CustInsertService;

@WebServlet("/cust/insert")
public class CustInsertController extends HttpServlet {

	CustInsertService insertService;
	
	public CustInsertController() {
		this.insertService = CustInsertService.getInstance();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("CustInsertController...doGet()...");
		
		RequestDispatcher distDispatcher = request.getRequestDispatcher("/WEB-INF/views/cust/insert.jsp");
		distDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("CustInsertController...doPost()...");
		
		int custid = Integer.parseInt(request.getParameter("custid"));
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		
		CustDTO dto = new CustDTO(custid, name, address, phone);
		
		int result = insertService.doInsert(dto);
		
		if (result > 0 ) {
			System.out.println("삽입 성공");
		} else {
			System.out.println("삽입 실패");
		}
		
		response.sendRedirect("list");
	}

}
