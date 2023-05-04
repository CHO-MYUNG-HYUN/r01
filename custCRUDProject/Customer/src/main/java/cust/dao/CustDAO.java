package cust.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cust.dto.CustDTO;
import cust.utill.ConnectionProvider;

public class CustDAO {

	private CustDAO() {
		
	}
	
	private static CustDAO dao = new CustDAO();
	
	public static CustDAO getInstance() {
		return dao;
	}
	
//	select all
	public List<CustDTO> selectByAll(Connection conn){
		System.out.println("DAO...selectByAll()... ");
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<CustDTO> result = null;
		
		String sql = "select * from customer";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			result = new ArrayList<CustDTO>();
			
			while(rs.next()) {
				result.add(new CustDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if (pstmt!=null) {
					pstmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
//	select one
	public CustDTO selectByCustid(Connection conn, int custid) {
		System.out.println("DAO...selectByCi()...");
		
		CustDTO dto = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from customer where custid = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, custid);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dto = new CustDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return dto;
	}
	
//	insert cust
	public int insertCust(Connection conn, CustDTO dto) {
		System.out.println("dao...insertCust()...");
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String sql = "insert into customer values(?,?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getCustid());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getAddress());
			pstmt.setString(4, dto.getPhone());
			
			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return result;
	}
	
//	update cust
	public int updateByCustid(Connection conn, CustDTO dto) {
		System.out.println("DAO...updateCust()...");
		
		int result = 0;
		PreparedStatement pstmt = null;
		
		String sql = "update customer set name=?, address=?, phone=? where custid=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddress());
			pstmt.setString(3, dto.getPhone());
			pstmt.setInt(4, dto.getCustid());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return result;
	}
	
//	delete cust
	public int deleteByCustid(Connection conn, int custid) {
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = "delete from customer where custid=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, custid);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return result;
	}
	
	
	public static void main(String[] args) throws SQLException {
		
		CustDAO dao = new CustDAO();
		Connection conn = ConnectionProvider.getConnection();
		CustDTO dto = new CustDTO(10, "CtName", "CtAddress", "rotlqkf");
		
//		select
//		List<CustDTO> list =  dao.selectByAll(conn);
//		System.out.println(list);

//		insert
//		int rs = dao.insertCust(conn, dto);
//		System.out.println(rs);
		
//		select custid
//		CustDTO dto2 = dao.selectByCi(conn, 10);
//		System.out.println(dto2);

//		update cust
//		int result = dao.updateCust(conn, dto);
//		System.out.println(result);
		
//		delete cust
//		int result = dao.deleteByCustid(conn, 10);
//		System.out.println(result);
	}
}
