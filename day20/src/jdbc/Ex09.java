package jdbc;

import java.util.List;


public class Ex09 {
	public static void main(String[] args) throws Exception {
		
		DAO dao = new DAO();	// DB에 접속해서
		
		List<DTO> list = dao.getQueryFromEmployees();	// 원하는 데이터를 리스트 형태로 가져와서
		
		// 모두 출력한다 (끝)
		list.forEach(ob -> System.out.printf("%s : $%,d\n", ob.getFirstName(), ob.getSalary()));
	}

}
