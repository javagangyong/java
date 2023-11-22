package book6;

import java.util.List;

// 데이터 저장소(배열 -> 리스트 -> 파일 -> DB)를 직접 참조하거나, 연결할 수 있음
// 프로그램의 주요 기능(목록/추가/삭제 등)을 모아둔 클래스

public class Handler {

	// 배열에서 리스트로 전환 (배열의 자료형은 리스트의 제네릭 타입이 된다)
	// 리스트에서 파일을 거쳐서 DB로 저장소를 변경한다
//	private ArrayList<BookDTO> list = new ArrayList<>();

	/* 파일 저장 및 불러오기 함수 */
//	private File f = new File("bookList.csv");



	// 전체 목록 출력
	public void showList() {
		BookDAO dao = new BookDAO();			// Connection이 연결된 상태
		List<BookDTO> list = dao.selectList();	// DB에 저장된 데이터를 불러온다
		list.forEach(ob -> System.out.println(ob));

	}

	// 도서 추가
	public int insertBook(BookDTO ob) {
		int row = 0;
		BookDAO dao = new BookDAO();
		row = dao.insertBook(ob);	// 메인이 넘겨준 객체를 dao로 전달하여 추가한다
		return row;					// 추가 결과 정수를 다시 메인으로 반환한다
	}

	// 도서 이름을 전달받아서, 배열 안에서 일치하는 객체를 찾아서 삭제하는 함수
	public int deleteBook(String name) {
		int row = 0;
		BookDAO dao = new BookDAO();
		row = dao.deleteBook(name);
		return row;
	}

}
