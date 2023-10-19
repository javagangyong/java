package loop;

import java.util.Random;
import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {	// 가능하다면 순서도를 먼저 그리고 시작하기
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int answer = ran.nextInt(100) + 1;
		int user;		// 입력받을 값이라서 초기값 지정하지 않았음
		int count = 0;	// 입력없이 1씩 증가시켜야 하기 때문에 초기값을 지정했음
		
		// 반복을 수행하면서
		while(true) {	// 횟수를 알수 없기때문에 무한반복으로 설정하고 내부에서 break로 중단하기
			
		//		사용자에게 값을 입력받고
			System.out.print("정수 입력 : ");
			user = sc.nextInt();
			
		//		만약 정답이 입력값보다 작으면 DOWN
			if(answer < user) 		System.out.println("DOWN");
			
		//		    정답이 입력값보다 크면 UP
			else if(answer > user)	System.out.println("UP");
			
		//			일치하면 반복을 중단
			else /* if(answer == user)*/ break;
			
		//		반복할때마다 횟수를 증가시키기
			count++;

		}
		// 반복이 끝나면 정답과 횟수를 출력하고 종료
		System.out.printf("%d : 정답입니다. %d회 만에 정답을 맞췄습니다\n", answer, count);
		sc.close();
	}
}
