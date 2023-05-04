package member.service;

import java.sql.Connection;
import java.sql.SQLException;

import cust.utill.ConnectionProvider;
import member.dao.LoginDAO;

public class LoginService {

	LoginDAO dao;
	
	private LoginService() {
		this.dao = LoginDAO.getInstance();
	}
	
	private static LoginService service = new LoginService();
	
	public static LoginService getInstance() {
		return service;
	}
	
	public int checkLogin(int custid, String name) {
		int result = 0;
		
		Connection conn = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			
			result = dao.selectByCustidName(conn, custid, name);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return result;
	}
}
