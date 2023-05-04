package cust.service;

import java.sql.Connection;
import java.sql.SQLException;

import cust.dao.CustDAO;
import cust.dto.CustDTO;
import cust.utill.ConnectionProvider;

public class CustUpdateService {
	
	CustDAO dao;
	
	private CustUpdateService() {
		this.dao = CustDAO.getInstance();
	}
	
	private static CustUpdateService service = new CustUpdateService();
	
	public static CustUpdateService getInstance() {
		return service;
	}
	
	public int updateCust(CustDTO dto) {
		System.out.println("CustUpdateService...updateCust()...");
		
		int result = 0;
		Connection conn = null;
		
		try {
			conn= ConnectionProvider.getConnection();
			
			result = dao.updateByCustid(conn, dto);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn!=null) {
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
