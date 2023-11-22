package phonebook2;

import java.util.List;

public class Handler {

	private PhonebookDAO dao = new PhonebookDAO();
	
	public List<PhonebookDTO> selectList() {
		List<PhonebookDTO> list = dao.selectList();
		return list;
	}
	
	public int insertPhonebook(PhonebookDTO ob) {
		int row = dao.insertPhonebook(ob);
		return row;
	}
	
	public int updatePnum(String name, String pnum) {
		PhonebookDTO dto = new PhonebookDTO();
		dto.setName(name);
		dto.setPnum(pnum);
		int row = dao.updatePnum(dto);
		return row;
	}
	
	public int updateFavorite(String name) {
		int row = dao.updateFavorite(name);
		return row;
	}
	
	public int delete(String name) {
		int row = dao.delete(name);
		return row;
	}
	
	
	
}
