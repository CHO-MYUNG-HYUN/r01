package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cust.dto.CustDTO;
import cust.service.CustDetailSerivce;
import member.service.LoginService;

@WebServlet("/cust/login")
public class LoginController extends HttpServlet {

	LoginService loginService;
	CustDetailSerivce detailSerivce;
	
    public LoginController() {
    	this.loginService = LoginService.getInstance();
    	this.detailSerivce = CustDetailSerivce.getInstance();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/member/loginform.jsp");
		
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int result = 0;
		String name = request.getParameter("name");
		int custid = Integer.parseInt(request.getParameter("pw"));
		CustDTO dto =null;
		
		HttpSession session = request.getSession();
		
		result = loginService.checkLogin(custid, name);
		dto = detailSerivce.getCust(result);
		
		if(result != 0) {
			System.out.println("로그인 성공");
			request.setAttribute("cust", dto);
			session.setAttribute("loginInfo", dto);
			request.getRequestDispatcher("/WEB-INF/views/cust/detail.jsp").forward(request, response);
//			response.sendRedirect("detail");
		}else {
			System.out.println("로그인 실패");
			response.sendRedirect("login");
		}
	}

}
