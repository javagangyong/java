package phonebook3;

import java.util.List;
import java.util.Scanner;

public class Main {
	static PhonebookDTO getDTOFromUserInput(Scanner sc) {
		PhonebookDTO dto = new PhonebookDTO();
		
		System.out.print("이름 입력 : ");
		dto.setName(sc.nextLine());
		System.out.print("번호 입력 : ");
		dto.setPnum(sc.nextLine());
		System.out.print("나이 입력 : ");
		dto.setAge(Integer.parseInt(sc.nextLine()));
		System.out.print("즐겨찾기 여부(Y/N) : ");
		dto.setFavorite(sc.nextLine());
		
		return dto;
	}
	
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Handler handler = new Handler();
		PhonebookDTO ob = null;				// 추가할때 받을 객체
		List<PhonebookDTO> list = null;
		int menu = -1;
		int idx, row;
		String name, pnum;
		
		while(menu != 0) {
			System.out.println("메뉴 출력");
			System.out.println("1) 전체 목록");
			System.out.println("2) 추가");
			System.out.println("3) 전화번호 수정");
			System.out.println("4) 즐겨찾기 수정");
			System.out.println("5) 삭제");
			System.out.println("0) 프로그램 종료");
			System.out.print("입력 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1:
				list = handler.selectList();
				list.forEach(System.out::println);
				break;
				
			case 2:
				ob = getDTOFromUserInput(sc);
				row = handler.insertPhonebook(ob);
				System.out.println(row != 0 ? "추가 완료!" : "추가 실패");
				break;
				
			case 3:
				System.out.print("수정할 이름 입력 : ");
				name = sc.nextLine();
				System.out.print("수정할 번호 입력 : ");
				pnum = sc.nextLine();
				row = handler.updatePnum(name, pnum);
				System.out.println(row != 0 ? "수정 완료!" : "수정 실패ㅜ");
				break;
				
			case 4:
				System.out.print("수정할 이름 입력 : ");
				name = sc.nextLine();
				row = handler.updateFavorite(name);
				System.out.println(row != 0 ? "수정 완료" : "수정 실패");
				break;
				
			case 5:
				
				break;
				
			case 0:
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println();
		}
		
		sc.close();
	}

}
