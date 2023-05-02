package todo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.service.TodoDeleteService;

@WebServlet("/todo/delete")
public class TodoDeleteController extends HttpServlet {
	
	TodoDeleteService deleteService;
	
	public TodoDeleteController() {
		this.deleteService = deleteService.getInstance();
	}

	protected void doPost(
			HttpServletRequest request,
			HttpServletResponse response) 
					throws ServletException, IOException {
		
		System.out.println("TodoDeleteController...doPost()...");
		
//		사용자로 부터 no 받기
		String noStr = request.getParameter("no");
		int no = Integer.parseInt(noStr);
		
//		서비스로 no 전달 -> 삭제처리
		int result = deleteService.delete(no);
//		결과
		if(result > 0) {
			System.out.println(no + "번 할일이 삭제...");
		}else {
			System.out.println("삭제 실패...");
		}
		
		System.out.println(no + "번 할일이 삭제 되었습니다.");
		
//		결과
		
//		redirect (list)
		response.sendRedirect("list");
		
	}

}
