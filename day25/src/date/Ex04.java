package date;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex04 {
	public static void main(String[] args) throws Exception {
		String sql = "select sysdate from dual";
		String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url, "c##itbank", "it");
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		String sysdate1 = null;
		Date sysdate2 = null;
		
		while(rs.next()) {							// 같은 컬럼의 값을
			sysdate1 = rs.getString("sysdate");		// 문자열로 꺼내고 싶으면 getString()
			sysdate2 = rs.getDate("sysdate");		// Date로 꺼내고 싶으면 getDate()
		}
		System.out.println("sysdate1 : " + sysdate1); // db안에는 시간정보까지 있지만 Date type으로 바꾸면서 시간정보가 출력되진 않는다
		System.out.println("sysdate2 : " + sysdate2); // 자바 toString은 날짜만 출력하도록 되어있다
		rs.close();
		pstmt.close();
		conn.close();
	}

}
