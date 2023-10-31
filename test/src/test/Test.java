package test;

import java.util.Random;

public class Test {
	
	static int[] overlap(int[] arr) {
		Random ran = new Random();
		for(int s = 0; s < arr.length; s++) {
			arr[s] = ran.nextInt(45) + 1;		// 배열 하나 값 받기
			for(int e = 0; e < s; e++) {		// arr[s]값과 앞의 값들 비교
				if(arr[s] == arr[e]) {			// arr[s]와 arr[e]의 값이 같다면
					s--;						// s값을 -해서
					break;						// break
				}
			}
		}
		
		return arr;
	}
	
	static int[] selectionSort(int[] arr) {
		for(int j = 0; j < arr.length; j++) {
			for(int k = j + 1; k < arr.length; k++) {	// arr[j]와 다음값들을 비교
				if(arr[j] > arr[k]) {					// arr[j]가 다음값보다 크다면
					int tmp = arr[j];					// tmp변수에 arr[j]값을 저장
					arr[j] = arr[k];					// arr[k]를 arr[j]값에 담아서 작은값이 더 앞으로 오게끔
					arr[k] = tmp;						// 저장해두었던 더 큰값 tmp를 arr[k]에 담는다
				}
			}
		}
		
		return arr;
	}
	
	
	static void show(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length - 1) {
				System.out.printf("%2d", arr[i]);		// 마지막 인덱스 번호이면 ,없이 출력
			}
			else {
				System.out.printf("%2d, ", arr[i]);		// 마지막 인덱스를 제외하고 ,를 삽입
			}
		}
			System.out.println();
	}
	
	
	public static void main(String[] args) {
		// 선택정렬 함수를 만들어야 합니다
		// 중복없는 랜덤 정수 6개로 구성된 배열을 반환하는 함수를 만들어야 합니다
		// (1~45) 사이의 랜덤정수
		// 한 줄당 6개, 총 5줄의 정수를 출력하는 프로그램을 작성하세요
		// 리스트 및 컬렉션 사용 금지
		// 하나의 배열 당 중복된 정수가 사용되면 안됩니다
		System.out.println("응시자 : 이경용 \n");
		
		for(int q = 0; q < 5; q++) {
		int[] arr = new int[6];
		overlap(arr);
		selectionSort(arr);
		show(arr);
		}
	}
	
	
}
