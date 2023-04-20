package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args) {

		try {


			// 2. Connection 객체를 생성 : 연결 정보
			// Oracle
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dbUrl, "hr", "tiger");

			// 3. Statement / PreparedStatment => sql 실행 요청
			Statement stmt = conn.createStatement();

			//sql
			String sql = "select * from dept order by deptno";
			
			// 4. select의 결과 데이터는 ResultSet 객체로 받는다.
			// select 실행 메소스 : executeQuery(String sql)
			ResultSet rs = stmt.executeQuery(sql);

			// 5. ResultSet 객체에서 데이터 추출
			while(rs.next()) {
				int deptno = rs.getInt(1);
				String dname = rs.getString (2);
				String loc = rs.getString (3);
				
				System.out.println(deptno + "\t" + dname + "\t" + loc);
			}
			
			rs.close();
			stmt.close();
			conn.close();

		} catch (SQLException e) {
			System.out.println("연결 실패.");
			e.printStackTrace();
		}

	}

}
