package phonebook3;

import java.util.List;

public class Handler {
	
	private PhonebookDAO dao = new PhonebookDAO();
	
	public List<PhonebookDTO> selectList() throws Exception {
		List<PhonebookDTO> list = dao.selectList();		// DataBase Access Object의 selectList 메서드를 호출해
		return list;									// 넘겨준다
	}
	
	public int insertPhonebook(PhonebookDTO ob) throws Exception {
		int row = dao.insertPhonebook(ob);
		return row;
	}
	
	public int updatePnum(String name, String Pnum) throws Exception {
		PhonebookDTO dto = new PhonebookDTO();
		dto.setName(name);
		dto.setPnum(Pnum);
		int row = dao.updatePnum(dto);
		return row;
	}
	
	public int updateFavorite(String name) throws Exception {
		int row = dao.updateFavorite(name);
		return row;
	}

}
