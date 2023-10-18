package control;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		int num1;
		int num2;
		int year, month, date;
		String gender;
		
		System.out.println("주민등록번호 13자리 입력 (xxxxxx-yyyyyyy)");
		System.out.print("입력 : ");
		input = sc.next();
		
		num1 = Integer.parseInt(input.split("-")[0]);
		num2 = Integer.parseInt(input.split("-")[1]);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println();
		
		// 4자리의 출생연도, 2자리의 출생월, 2자리의 출생일
		// 그리고 성별은 문자열로 준비하여 모두 출력하세요
		date = num1 % 100;
		num1 = num1 / 100;
		year = num1 / 100;
		month = num1 % 100;
		
		
		switch(num2 / 1000000) {
		case 1:			year = year + 1900;	
						gender = "남성";			break;
		case 2:			year = year + 1900;		
						gender = "여성";			break;
		case 3:			year = year + 2000;		
						gender = "남성";			break;
		default:		year = year + 2000;
						gender = "여성";
		}
		
		System.out.printf("%d년 %d월 %d일\n", year, month, date);
		System.out.printf("%s입니다.", gender);
		
		
		
		
	}

}
