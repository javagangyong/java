package phonebook2;

import java.util.List;

public class PhonebookDAO {
	
	private JdbcTemplate template = new JdbcTemplate();
	
	public List<PhonebookDTO> selectList() {
		String sql = "select * from phonebook order by favorite desc, name";
		
		RowMapper<PhonebookDTO> mapper = (rs) -> {
			PhonebookDTO dto = new PhonebookDTO();
			dto.setAge(rs.getInt("age"));
			dto.setFavorite(rs.getString("favorite"));
			dto.setName(rs.getString("name"));
			dto.setPnum(rs.getString("pnum"));
			return dto;
		};
		
		List<PhonebookDTO> list = template.queryForList(sql, mapper);
		return list;
	}

	public int insertPhonebook(PhonebookDTO ob) {
		String sql = "insert into phonebook values (?, ?, ?, ?)";
		Object[] args = {ob.getName(), ob.getPnum(), ob.getAge(), ob.getFavorite()};
		int row = template.update(sql, args);
		return row;
	}
	
	public int updatePnum(PhonebookDTO ob) {
		String sql = "update phonebook set pnum = ? where name = ?";
		Object[] args = { ob.getPnum(), ob.getName() };
		int row = template.update(sql, args);
		return row;
	}
	
	public int updateFavorite(String name) {
		String sql = "update phonebook "
				+ "		set favorite = decode(favorite, 'Y', 'N', 'N', 'Y') "
				+ "		where name = ?";
		int row = template.update(sql, name);
		return row;
	}
	
	public int delete(String name) {
		String sql = "delete from phonebook where name = ?";
		int row = template.update(sql, name);
		return row;
	}
	
	
}
