package control;

import java.util.Scanner;

// 이클립스 디버깅하기
// 1) 중단점을 설정한다 (Ctrl + shift + b) or 줄번호 왼쪽 클릭
// 2) F11을 눌러서 디버깅을 시작한다 (화면 구성을 바꿀건지 물어보면 yes)
// 3) F6번을 누를때 마다 한줄씩 실행되고, 우측에서 변수의 값을 확인할 수 있다

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		int num1;
		int num2;
		
		System.out.println("주민등록번호 13자리 (xxxxxx-yyyyyyy)");
//		System.out.print("입력 : ");
//		input = sc.next();
		input = "930516-2345678";
		
		num1 = Integer.parseInt(input.split("-")[0]);
		num2 = Integer.parseInt(input.split("-")[1]);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println();
		
		// 4자리의 출생연도, 2자리의 출생월, 2자리의 출생일
		// 그리고 성별은 문자열로 준비하여 모두 출력하세요
		int year, month, date, genderNumber;
		String gender;

		// 0의 개수만큼 오른쪽 숫자를 가져온다	// num1		year	month	date
										// 930516
		date = num1 % 100;				// 930516	?		?		16
		
		num1 /= 100;					// 9305		?		?		16					 
		
		month = num1 % 100;				// 9305		?		5		16
		
		year = num1 / 100;				// 9305		93		5		16
		
		genderNumber = num2 / 1000000;
		
		System.out.println("num1 : " + num1);
		
		switch(genderNumber) {
		case 1: case 2:
			year += 1900;
			break;
		case 3: case 4:
			year += 2000;
			break;
		}
		
		switch (genderNumber) {
		case 1: case 3:
			gender = "남성";
			break;
		case 2: case 4:
			gender = "여성";
			break;
		default:
			gender = "";
		}
		
		System.out.printf("%4d-%02d-%02d (%s)\n", year, month, date, gender);
		
		sc.close();
		
	}
}










