package accessModifier;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// Human 타입의 객체를 저장할 수 있는 배열을 준비
		// while, switch ~ case를 이용하여 메뉴를 선택하는 형식
		// 메뉴 선택에 따라 입력 및 출력을 수행하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		Human[] arr = new Human[5];
		int menu;
		String name;
		int age;
		boolean hasNull = false;		// 빈칸이 하나라도 있으면 true로 바꿀거다
		
		while(true) {
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			// nextInt를 쓰면 버퍼에 엔터값이 남는다
			// nextLine과 parseInt는 세트
			// next와 nextInt는 세트
			
			switch(menu) {
				case 1:			// 빈칸을 찾아서 빈칸에 데이터를 입력하고 반복탈출
								// 만약 모든 칸이 채워져서 빈칸이 없으면 메시지 출력
					// 0) 빈칸이 하나라도 있는지 없는지 체크해야 한다
					hasNull = false;
					
					// 1) 여러 칸 중에 빈칸인 곳을 하나 찾아서
					for(int i = 0; i < 5; i++) {
						if(arr[i] == null) {
							hasNull = true;
							// 2) 객체를 구성할 값을 사용자로부터 입력받고
							System.out.print("이름 : ");
							name = sc.nextLine();
							System.out.print("나이 : ");
							age = Integer.parseInt(sc.nextLine());
							// 3) 빈칸에 객체를 생성한 다음 값을 넣어준다(setter)
							arr[i] = new Human();
							arr[i].setName(name);
							arr[i].setAge(age);
							// 4) 빈칸을 찾아서 데이터를 입력했으니 입력을 중단한다
							break;	// 다음 칸이 빈칸인지 확인할 필요가 없다(이미 입력했으니까)
							// break는 if가 대상이 아니다
						}
					}
					if(hasNull == false) {
						System.out.println("=== 빈칸이 없습니다 ===\n");
					}
					break;
					
				case 2:			// 빈칸을 제외한 모든 데이터를 화면에 출력
								// 모든 칸이 비어있으면 아무것도 출력하지 않는다
					for(int i = 0; i < arr.length; i++) {
						if(arr[i] != null) {
							System.out.printf("%s : %d살 \n", arr[i].getName(), arr[i].getAge());
						}
					}
					break;
					
				case 0:
					sc.close();
					return;		// main함수를 즉시 종료한다
					
				default:
					System.out.println("잘못 선택하셨습니다");
			}
			System.out.println();
		}	// end of while
		
	}	// end of main()
}	// end of class
