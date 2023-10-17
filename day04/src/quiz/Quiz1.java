package quiz;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 두 정수를 입력받아서 더 큰수를 화면에 출력하세요
		
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.printf("정수를 입력하세요 : ");
		num1 = sc.nextInt();
		System.out.printf("정수를 입력하세요 : ");
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.printf("입력한 정수 중 더 큰값은 %d 입니다.", num1);
		}
		else {
			System.out.printf("입력한 정수 중 더 큰값은 %d 입니다.", num2);
		}
		
		sc.close();
		
		
		
	}

}
