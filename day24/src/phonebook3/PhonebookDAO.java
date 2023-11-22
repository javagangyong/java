package phonebook3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhonebookDAO {
	private Connection conn;
	private PreparedStatement pstmt; // 연결상태 확인? sql문을 탑재해서 준비하는 틀 ?
	private ResultSet rs;
	
	private String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private String user = "c##itbank";
	private String password = "it";
	
	private Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
	
	public PhonebookDAO() {
		
	}
	
	public List<PhonebookDTO> selectList() throws Exception {
		ArrayList<PhonebookDTO> list = new ArrayList<>();
		String sql = "select * from phonebook order by idx asc";
		conn = getConnection();
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			// RowMapper에 작성했던 규칙을 여기에 작성
			PhonebookDTO dto = new PhonebookDTO();
			dto.setAge(rs.getInt("age"));
			dto.setFavorite(rs.getString("favorite"));
			dto.setIdx(rs.getInt("idx"));
			dto.setName(rs.getString("name"));
			dto.setPnum(rs.getString("pnum"));
			list.add(dto);
		}
		rs.close();
		pstmt.close();
		conn.close();
		return list;
	}
	
	public int insertPhonebook(PhonebookDTO ob) throws Exception {
		conn = getConnection();
		int row = 0;
		String sql = "insert into phonebook (name, pnum, age, favorite)"
						+ "values (?, ?, ?, ?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, ob.getName());
		pstmt.setString(2, ob.getPnum());
		pstmt.setInt(3, ob.getAge());
		pstmt.setString(4, ob.getFavorite());
		row = pstmt.executeUpdate();
		return row;
	}
	
	public int updatePnum(PhonebookDTO dto) throws Exception {
		conn = getConnection();
		int row = 0;
		String sql = "update phonebook set pnum = ? where name = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, dto.getPnum());
		pstmt.setString(2, dto.getName());
		row = pstmt.executeUpdate();
		return row;
	}
	
	public int updateFavorite(String name) throws Exception {
		conn = getConnection();
		String sql = "update phonebook " +
				"set favorite = decode(favorite, 'Y', 'N', 'N', 'Y') " + 
				"where name = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, name);
		int row = pstmt.executeUpdate();
		return row;
	}
	
	
	
	
	

}
