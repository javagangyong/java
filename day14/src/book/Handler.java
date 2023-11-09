package book;

// 1) 단일데이터의 배열
// 2) 데이터를 제어하기 위한 함수들

public class Handler {
	private Book[] arr = new Book[10];

	public Handler() {
	}

	public int add(String bookName, int bookNumber) {
		int row = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = new Book();
				arr[i].setBookName(bookName);
				arr[i].setBookNumber(bookNumber);
				row = 1;
				break;
			}
		}
		return row;
	}

	public void sortByName() {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] != null) {
						int result = arr[i].getBookName().compareTo(arr[j].getBookName());
						if (result > 0) {
							String tmp = arr[i].getBookName();
							arr[i].setBookName(arr[j].getBookName());
							arr[j].setBookName(tmp);
						}
					}
				}
			}
		}

	}

	public void showList() {
		for (int k = 0; k < arr.length; k++) {
			if (arr[k] != null) {
				System.out.printf("책이름 : %-10s /책넘버 : %d\n", arr[k].getBookName(), arr[k].getBookNumber());
			}
		}
	}

}
