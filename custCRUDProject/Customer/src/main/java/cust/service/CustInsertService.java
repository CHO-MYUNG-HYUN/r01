package cust.service;

import java.sql.Connection;
import java.sql.SQLException;

import cust.dao.CustDAO;
import cust.dto.CustDTO;
import cust.utill.ConnectionProvider;

public class CustInsertService {

	CustDAO dao;
	
	private CustInsertService() {
		this.dao = CustDAO.getInstance();
	}
	
	private static CustInsertService service = new CustInsertService();
	
	public static CustInsertService getInstance() {
		return service;
	}
	
	public int doInsert(CustDTO dto) {
		int result = 0;
		Connection conn = null; 
		
		try {
			conn = ConnectionProvider.getConnection();
			result = dao.insertCust(conn, dto);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
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
