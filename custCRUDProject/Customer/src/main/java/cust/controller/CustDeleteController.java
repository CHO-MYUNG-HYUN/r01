package cust.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cust.service.CustDeleteService;

@WebServlet("/cust/delete")
public class CustDeleteController extends HttpServlet {

	CustDeleteService deleteService;

    public CustDeleteController() {
    	this.deleteService = CustDeleteService.getInstance();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("CustDeleteController...doPost()...");
		
		int custid = Integer.parseInt(request.getParameter("custid"));
		
		int result = deleteService.deleteCust(custid);
		
		if(result >0) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}
		
		response.sendRedirect("list");
	}

}
