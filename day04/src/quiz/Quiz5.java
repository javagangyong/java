package quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int eleA, eleB, eleC;		
		int current;				// 현재위치 (입력)
		int distA, distB, distC;	// 각각의 거리
		int min;					// 최소값
		
		
		eleA = ran.nextInt(15) + 1; // 1 ~ 15
		eleB = ran.nextInt(15) + 1; // 1 ~ 15
		eleC = ran.nextInt(15) + 1; // 1 ~ 15
		
		System.out.printf("%d층, %d층, %d층\n", eleA, eleB, eleC);
		
		// 현재 자신의 위치를 1 ~ 15 사이로 입력한 다음
		// 가장 가까운 엘리베이터가 몇번째인지 출력하는 코드를 작성하세요
		// (가장 가깝다 = 거리값이 최소이다 = 차이의 절대값이 최소값이다)
		
		// 1) 현재 자신의 위치를 1 ~ 15 사이로 입력한다음
		System.out.print("현재 층수를 입력하세요 : ");
		current = sc.nextInt();
		
		// 2) 현재 위치 - 각 엘리베이터, 차이 구하기
		distA = current - eleA;
		distB = current - eleB;
		distC = current - eleC;
		
		// 3) 차이에 절대값 처리하기 => 거리
		if(distA < 0) distA = -distA;
		if(distB < 0) distB = -distB;
		if(distC < 0) distC = -distC;
		
		// 4) 거리중에서 최소값 찾기
		if(true)			min = distA;
		if(min > distB) 	min = distB;
		if(min > distC) 	min = distC;
		
		// 5) 최소값과 일치하는 엘리베이터에 대한 문장 출력하기
		if(min == distA)  			System.out.print("A엘리베이터가 이동합니다."); 
		else if(min == distB) 		System.out.print("B엘리베이터가 이동합니다.");
		else /*if (min == distC)*/	System.out.print("C엘리베이터가 이동합니다."); 
		
		// 6) 마무리
		sc.close();
		
		
	}

}
