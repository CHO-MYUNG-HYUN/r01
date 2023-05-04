package cust.service;

import java.sql.Connection;
import java.sql.SQLException;

import cust.dao.CustDAO;
import cust.utill.ConnectionProvider;

public class CustDeleteService {

	CustDAO dao;
	
	private CustDeleteService() {
		this.dao= CustDAO.getInstance();
	}
	
	private static CustDeleteService service = new CustDeleteService();
	
	public static CustDeleteService getInstance() {
		return service;
	}
	
	public int deleteCust(int custid) {
		int result = 0;
		Connection conn = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			result = dao.deleteByCustid(conn, custid);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn!= null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}
}
