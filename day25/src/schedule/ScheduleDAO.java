package schedule;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ScheduleDAO {

	private String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private String user = "c##itbank";
	private String password = "it";

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println("연결 문제 발생 : " + e);
		}

		return conn;
	}

	private void close() { // 자주 사용되고 내용이 똑같거나, 일정구간만 다르다면 함수로 묶어서 처리하기
		try {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {
		}
	}

	public List<ScheduleDTO> selectAll() {
		ArrayList<ScheduleDTO> list = new ArrayList<>();
		String sql = "select * from schedule order by start_date asc";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				ScheduleDTO dto = new ScheduleDTO();
				dto.setTitle(rs.getString("title"));
				dto.setStart_date(rs.getDate("start_date"));
				dto.setEnd_date(rs.getDate("end_date"));
				list.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}

	public String version() {
		String banner = null; // 첫줄에 반환형의 변수를 만들어두고 (초기화 필요함)
		String sql = "select banner from v$version"; // DB에 접속해서 실행할 쿼리문

		try {
			conn = getConnection(); // 연결(conn)해서 sql을 실행(qstmt.executeQuery())하고 결과(rs)를 받아와야 한다
			pstmt = conn.prepareStatement(sql); // try catch 단축키
			rs = pstmt.executeQuery(); // 해야할부분 블럭처리 후 Alt + Shift + Z
			while (rs.next()) {
				banner = rs.getString("banner");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return banner; // 마지막줄에 해당 변수의 값을 반환한다
	}

	public Date getSysdate() {
		Date now = null;
		String sql = "select sysdate from dual";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				now = rs.getDate("sysdate");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return now;
	}

	public int insertInput(ScheduleDTO dto) {
		int row = 0;
		String sql = "insert into schedule (title, start_date, end_date)"
				+ "values (?, ?, ?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getTitle());
			pstmt.setDate(2, (Date) dto.getStart_date());
			pstmt.setDate(3, (Date) dto.getEnd_date());
			row = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return row;
	}
	
	public int remove(Date d6) {
		int row = 0;
		String sql = "delete from schedule where start_date = ?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setDate(1, d6);
			row = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return row;
	}
	
	
	
	
	
	
	
	
}
