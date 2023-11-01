package book;

// 단일데이터를 필드와 getter/setter로 구성

public class Book {
	
	private String bookName;
	private int bookNumber;
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	
	

}
