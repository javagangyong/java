package loop;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) throws Exception {
		// 입력받은 숫자를 이용하여 진행상황 출력하기
		Scanner sc = new Scanner(System.in);
		int maxSize = 100;	// 전체 진행율을 %로 표현하고 싶어서
		int currentSize;	// 100칸은 보여주기에 너무 양이 많아서 그 절반으로 진행한다
		
		System.out.println("현재 진행률 입력 : ");
		currentSize = sc.nextInt();
		
		System.out.print("[");
		for(int i = 0; i < maxSize; i++) {		// 총 칸의 크기는 50칸
			if(i == 50) {				// 50칸의 절반위치에 진행률 숫자를 출
				System.out.printf(" %3d %% ", currentSize);
			}
			else if(i < currentSize) {	// 입력 퍼센트의 절반보다 작으면
				System.out.print("#");		// #을 이용하여 현재진행된 영역을 표시
			}
			else {							// 입력 퍼센트의 절반보다 같거나 크면
				System.out.print("_");		// 공백 혹은 언더바를 이용하여 아직 진행되지 않음을 표시
			}
			Thread.sleep(50);
		}
		System.out.println("]");
		sc.close();
	}
}
