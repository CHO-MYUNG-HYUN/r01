package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cust.dto.CustDTO;
import cust.utill.ConnectionProvider;

public class LoginDAO {

	private LoginDAO() {
		
	}
	
	private static LoginDAO dao = new LoginDAO();
	
	public static LoginDAO getInstance() {
		return dao;
	}
	
	public int selectByCustidName(Connection conn,int custid, String name) {
		System.out.println("selectBCN");

		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;
		
		String sql ="select custid from customer where custid=? and name=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, custid);
			pstmt.setString(2, name);
			
			rs = pstmt.executeQuery();
			if (rs.next()) {
				result=rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) {
					rs.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public static void main(String[] args) throws SQLException {
		LoginDAO dao = LoginDAO.getInstance();
		Connection conn = ConnectionProvider.getConnection();
		
		int result = dao.selectByCustidName(conn, 1, "박지성");
		System.out.println(result);
		 
	}
}
