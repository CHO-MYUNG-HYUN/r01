package cust.service;

import java.sql.Connection;
import java.sql.SQLException;

import cust.dao.CustDAO;
import cust.dto.CustDTO;
import cust.utill.ConnectionProvider;

public class CustDetailSerivce {

	CustDAO dao;
	
	private CustDetailSerivce() {
		this.dao = CustDAO.getInstance();
	}
	
	private static CustDetailSerivce service = new CustDetailSerivce();
	
	public static CustDetailSerivce getInstance() {
		return service;
	}
	
	public CustDTO getCust(int custid) {
		System.out.println("CustDetailService...getCust()...");
		
		CustDTO dto = null;
		
		Connection conn =null;
		
		try {
			conn=ConnectionProvider.getConnection();
			dto = dao.selectByCustid(conn, custid);
			
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
		
		return dto;
	}
}
