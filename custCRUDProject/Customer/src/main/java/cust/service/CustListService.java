package cust.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import cust.dao.CustDAO;
import cust.dto.CustDTO;
import cust.utill.ConnectionProvider;

public class CustListService {

	CustDAO dao;
	
	private CustListService() {
		this.dao = CustDAO.getInstance();
	}
	
	private static CustListService service = new CustListService();
	
	public static CustListService getInstance() {
		return service;
	}
	
	
	public List<CustDTO> getList() {
		System.out.println("Service...getList()...");
		
		List<CustDTO> list = null;
		
		Connection conn = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			list = dao.selectByAll(conn);
			
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
		
		return list;
		
	}
	
	
}
