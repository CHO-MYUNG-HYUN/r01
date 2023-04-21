package service;

import java.sql.SQLException;

import dao.DeptDao;
import domain.Dept;
import utill.ConnectionProvider;

public class DeptInsertService {

	DeptDao dao;

	public DeptInsertService() {
		this.dao = new DeptDao();
	}

	public int insertDept(Dept dept) throws SQLException {

//		RequestDept => dname, loc //시퀀스 사용시
//		데이터 가공
//		트랜잭션

		return dao.insertDept(ConnectionProvider.getConnection(), dept);
	}

}
