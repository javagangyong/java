package loop;

import java.util.Random;
import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int answer = ran.nextInt(100) + 1;
		int user;
		int num = 0;
		System.out.println("업다운 게임 시작");
		System.out.print("값을 입력하세요 : ");
		user = sc.nextInt();
		
		// 반복을 수행하면서
		// 사용자에게 값을 입력받고
		// 만약 정답이 입력값보다 작으면 DOWN
		// 정답이 입력값보다 크면 UP
		// 일치하면 반복을 중단
		// 반복할때마다 횟수를 증가시키기 
		//
		// 반복이 끝나면 정답과 횟수를 출력하고 종료
		
		while(answer != user) {
			if(user > answer) System.out.println("down");
			else if(user < answer) System.out.println("up");
			user = sc.nextInt();
			num++;
		}
		System.out.printf("%d 정답입니다! 횟수는 %d회 입니다.", answer, num);
		sc.close();
		
		
		
	}

}
