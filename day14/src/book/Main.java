package book;

import java.util.Scanner;

// 사용자와 상호작용(입출력)
// 입력값에 따라서 handler의 함수를 호출

public class Main {
	public static void main(String[] args) {
		Handler handler = new Handler();
		Scanner sc = new Scanner(System.in);
		int bookNumber;
		String bookName;
		
		LOOP : while(true) {
			System.out.println();
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("0. 프로그램 종료");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1 :
				System.out.print("책 이름 : ");
				bookName = sc.nextLine();
				System.out.print("책 넘버 : ");
				bookNumber = Integer.parseInt(sc.nextLine());
				
				int row = handler.add(bookName, bookNumber);
				if(row == 1) {
					System.out.println("입력 완료 !");
				}
				else {
					System.out.println("입력 공간이 없습니다 !");
				}
				break;
				
			case 2 :
				handler.sortByName();
				handler.showList();
				break;
				
			case 0 :
				break LOOP;
			}
		}
		
		sc.close();
		
	}

}
