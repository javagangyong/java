package schedule;

import java.sql.Date;
import java.util.List;

public class Handler {

	private ScheduleDAO dao = new ScheduleDAO();
	
	public List<ScheduleDTO> selectAll() {
		return dao.selectAll();
	}
	
	public String version() {
		String banner = dao.version();
		return banner;
	}
	
	public Date getSysdate() {
		return dao.getSysdate();
	}
	
	public int insertInput(ScheduleDTO dto) {
		int row = dao.insertInput(dto);
		return row;
	}
	
	public int remove(Date d6) {
		int row = dao.remove(d6);
		return row;
	}
	

	

}
