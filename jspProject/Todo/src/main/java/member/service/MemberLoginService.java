package member.service;

import java.sql.Connection;
import java.sql.SQLException;

import member.dao.MemberDAO;
import member.domain.MemberDTO;
import todo.utill.ConnectionProvider;

public class MemberLoginService {

	MemberDAO dao;
	
	public MemberLoginService() {
		this.dao = new MemberDAO();
	}
	
//	id와 pw를 전달 받아서 dao로 select 요청 => MemberDTO
	public MemberDTO login(String uid, String pw) {
		
		MemberDTO member = null;
		Connection conn = null;
		
		try {
//			conn
			conn = ConnectionProvider.getConnection();
			
//			dao.selectByUidPw
			member = dao.selectByUidPw(conn, uid, pw);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return member;
	}
	
}
