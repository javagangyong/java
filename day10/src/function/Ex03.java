package function;

import java.util.Arrays;

public class Ex03 {
	
	// 함수의 중복정의 method overloading
	// 하나의 함수이름으로 여러함수를 만드는것.
	// 매개변수의 개수가 다르거나 매개변수의 자료형이 다르다면
	
	// 두 정수 중에서 가장 큰 수 반환하기
	static int getMaxNum(int n1, int n2) {
		int max = 0;
		max = n1 > n2 ? n1 : n2;
		return max;
	}
	
	// 세 정수 중에서 가장 큰 수 반환하기
	static int getMaxNum(int n1, int n2, int n3) {
		int max = 0;
		
		if(n1 > max) max = n1;
		if(n2 > max) max = n2;
		if(n3 > max) max = n3;
		
		return max;
	}
	
	// n개의 정수 중에서 가장 큰 값을 반환하기
	static int getMaxNum(int... arr) {	// 같은 자료형의 여러 매개변수 개수가 일정하지 않을때
										// 가변인자 : 인자의 개수가 일정하지 않다
		int result = 0;
//		for(int i = 0; i < arr.length; i++) {	// 매개변수들을 순서대로 조회하면서
//			int num = arr[i];					// 각 숫자를 num이라고 할 때
//			if(result < num)					// 기존 최대값 보다 더 큰 값이 있으면
//				result = num;					// 그 값을 최대값에 담는다
//		}
		for(int num : arr) {
			if(result < num)
				result = num;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int num1 = getMaxNum(10, 20);
		int num2 = getMaxNum(100, 200, 300);
		int num3 = getMaxNum(100, 200, 300, 3, -2, 68, -8, 700);
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		
		
		
	}

}
