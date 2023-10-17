package quiz;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		// 지하철 1구간당 평균 소요 시간이 4분이라고 가정한다
		// 이동한 구간수를 입력받아서 걸리는 시간을 출력하세요
		// 단, 이동한 시간이 60분 이하이면 분으로만 출력하고
		// 이동한 시간이 60분을 초과하면 시간과 분으로 나누어서 출력하세요
		
		Scanner sc = new Scanner(System.in);	//	입력받기 위한 객체
		int perStation = 4; 					// 구간당 4분
		int distance;							// 이동한 구간 수
		int minutes, hour;						// 조건에 따라 사용할 변수(계산해야 함)
												
		
		System.out.print("이동한 구간수 : ");		// 입력 안내 메시지
		distance = sc.nextInt();				// 입력받기
		
		minutes = distance * perStation;	// 입력값으로 분 구하기
		
		
		if(minutes <= 60) {										// 분이 60이하이면
			System.out.printf("총 이동한 시간 : %d분", minutes);		// 그냥 출력
		}
		else {						// 아니면 (분이 60을 초과하면)
			hour = minutes / 60;	// 시간은 전체 시간에서 60을 나눈 몫
			minutes %= 60;			// 분은 전체 시간에서 60을 나눈 나머지
			System.out.printf("총 이동한 시간 : %d시간 %d분", hour, minutes);	// 각각 출력
		}
		
		sc.close();

		
		
		
		
}
}
