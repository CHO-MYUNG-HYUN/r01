package cust.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cust.dto.CustDTO;
import cust.service.CustListService;

@WebServlet("/cust/list")
public class CustListController extends HttpServlet {

	CustListService listService;
	
	public CustListController() {
		this.listService = CustListService.getInstance();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("CustListController...doGet()...");
		
		List<CustDTO> list = listService.getList();
		
		request.setAttribute("custList", list);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/cust/list.jsp");
		dispatcher.forward(request, response);
	}

}
