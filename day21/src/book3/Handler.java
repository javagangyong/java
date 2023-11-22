package book3;

// 데이터 저장소(배열 -> 리스트 -> 파일 -> DB)를 직접 참조하거나, 연결할 수 있음
// 프로그램의 주요 기능(목록/추가/삭제 등)을 모아둔 클래스

public class Handler {

	private Book[] arr = new Book[10]; // 여러 Book 객체를 저장하기 위한 배열
	// 배열은 자료형에 맞는 0값으로 초기화된다
	// 참조형 변수(클래스 타입 변수)의 초기값은 null

	// 배열을 전달받아서, 배열 내부의 각 객체를 서식에 맞게 출력하는 함수 (case 1)
	public void showList() {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) { // 배열의 각 초기값 null을 처리(회피)하기 위한 if
				System.out.printf("%s (%s, %s) %,d원\n", arr[i].getName(), // 객체 내부 값을 가져오기 위한 getter
						arr[i].getAuthor(), arr[i].getPublisher(), arr[i].getPrice());
			}
		}
	}

	// 도서 추가
	public int insertBook(Book ob) {
		int row = 0;
		for (int j = 0; j < arr.length; j++) { // 배열의 처음부터 끝까지 순회하면서
			if (arr[j] == null) { // 빈칸을 찾았다면
				arr[j] = ob; // 값이 준비된 객체를 넣으면 끝
				row = 1;
				break; // break for "for" 다음칸에 또 값을 넣으면 안되니까 break (반복 중단)
			}
		}
		return row;
	}

	// 도서 이름을 전달받아서, 배열 안에서 일치하는 객체를 찾아서 삭제하는 함수
	public int deleteBook(String name) {
		int row = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && arr[i].getName().equals(name)) {
				arr[i] = null; // 참조변수가 객체를 참조하지 않도록 한다
								// 모두에게서 잊혀진 참조변수는 소멸한다
				row = 1; // 삭제했다는 결과를 반환하기 위해 row값을 1로 설정한다
				break; // 하나 지웠으면 중단한다
			}
		}
		return row;
	}

}
