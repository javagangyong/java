package book5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

// 데이터 저장소(배열 -> 리스트 -> 파일 -> DB)를 직접 참조하거나, 연결할 수 있음
// 프로그램의 주요 기능(목록/추가/삭제 등)을 모아둔 클래스

public class Handler {

	// 배열에서 리스트로 전환 (배열의 자료형은 리스트의 제네릭 타입이 된다)
	private ArrayList<Book> list = new ArrayList<>();

	/* 파일 저장 및 불러오기 함수 */
	private File f = new File("bookList.csv");

	public Handler() {
		if (f.exists() == false) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				System.out.println("\t파일을 생성하는데에 문제가 발생했습니다 : " + e);
				e.printStackTrace();
			}
		}
	}

	// 저장
	public void save() {
		try {
			// 프로그램의 데이터를 파일로 내보내는 스트림(데이터의 이동 통로)
			FileOutputStream fos = new FileOutputStream(f);

			// 스트림으로 문자열 형식 데이터를 전달하는 기능이 추가된 클래스
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");

//			osw.write("/ufeff");

			for (Book ob : list) {	// 리스트 내부의 객체를 대상으로 반복
									// 문자열로 저장할 것인가? 객체 그대로 직렬화해서 바이너리로 저장할 것인가?
									// 문자열로 저장하기 (메모장에서 열면 알아볼 수 있음)
				String name = ob.getName();
				String author = ob.getAuthor();
				String publisher = ob.getPublisher();
				String price = String.valueOf(ob.getPrice());

				// 아래 서식은 띄어쓰기 없이 콤마로만 구분하기
				// pirntf() 와 동일하지만 printf는 모니터에 출력하는 역할
				// String.format()은 서식의 문자열을 만들어서 반환하는 역할
				String data = String.format("%s,%s,%s,%s", name, author, publisher, price);
				osw.write(data);	// 반복하여 객체의 정보를 문자열로 기록한다
				osw.write('\n');	// 한 줄당 하나의 객체정보를 저장하기 위해 개행문자를 추가한다
			}
			osw.flush();	// 버퍼에 남아있고, 아직 파일로 넘어가지 않은 데이터를 넘긴ㄷ마
			osw.close();	// 열려있는 데이터 이동 통로를 닫아준다 (메모리 누수 방지, 필요없는 데이터에 의해 자원이 낭비되는 형태)

		} catch (IOException e) {
			e.printStackTrace();
		}

	} // end of save()

	public void load() {
		try {
			Scanner sc = new Scanner(f);	// Reader 역할을 수행하는 Scanner
											// (Reader와 Writer는 문자열을 대상으로 데이터 입출력을 수행)
			String data = "";
			while(sc.hasNextLine()) {	// 한 줄단위(저장할때 한줄에 하나의 객체)로 읽어낸다
				data = sc.nextLine();	// 처리하지 않은 다음 줄을 가져와서 data에 저장
				if(data.length() != 0) {// 마지막에 그냥 엔터만 입력하면 한줄은 있으나 내용이 없을 수 있다
					String[] arr = data.split(",");	// 콤마로 구분해서 기록했으니 불러올때도 콤마로 분리한다
					Book b = new Book();	// 비어있는 객체를 생성하고
					b.setName(arr[0]);		// 각 순번대로 값을 피륻에 대입한다 (setter)
					b.setAuthor(arr[1]);
					b.setPublisher(arr[2]);
					b.setPrice(Integer.parseInt(arr[3]));	// 정수형은 WrapperClass를 활용한다
					list.add(b);			// 값이 준비된 객체를 리스트에 추가한다
				}
			}
			sc.close();	// 메모리 누수 방지를 위한 close()
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}	// end of load()

	// 배열을 전달받아서, 배열 내부의 각 객체를 서식에 맞게 출력하는 함수 (case 1)
	public void showList() {
		list.forEach(ob -> System.out.println(ob));

	}

	// 도서 추가
	public int insertBook(Book ob) {
		int row = 0;
		boolean flag = list.add(ob); // 추가 성공하면 true가 반환된다
		row = flag ? 1 : 0; // true이면 row가 1, 아니면 row가 0
		return row;
	}

	// 도서 이름을 전달받아서, 배열 안에서 일치하는 객체를 찾아서 삭제하는 함수
	public int deleteBook(String name) {
		int row = 0;

		// 조건에 맞는 요소를 삭제하는 리스트의 함수(반환값은 boolean 타입)
		boolean flag = list.removeIf(ob -> ob.getName().equals(name));
		row = flag ? 1 : 0;
		return row;
	}

}
