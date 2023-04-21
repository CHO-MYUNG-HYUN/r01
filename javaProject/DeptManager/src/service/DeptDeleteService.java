package service;

import java.sql.Connection;
import java.sql.SQLException;

import dao.DeptDao;
import utill.ConnectionProvider;

public class DeptDeleteService {

	DeptDao dao;

	private DeptDeleteService() {
		this.dao = DeptDao.getInstance();
	}
	
	private static DeptDeleteService service = new DeptDeleteService();
	
	public static DeptDeleteService getInstance() {
		return service;
	}

	public int deleteDeptno(int deptno) {

		Connection conn = null;
		int result = 0;

		try {
			conn = ConnectionProvider.getConnection();

			result = dao.deleteDeptByDeptno(conn, deptno);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
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
