package function;

public class Ex02 {
	
	// 1) 두 정수의 덧셈을 반환하는 함수 add를 작성하세요
	static int add(int n1, int n2) {
		int result = 0;
		result = n1 + n2;
		return result;
	}
	
	//2) 세 정수를 전달받아서 가장 작은 수를 반환하는 함수 getMinNumber를 작성하세요.
	static int getMinNumber(int n1, int n2, int n3) {
		int result = 999999999;
		if(n1 < result) {
			result = n1;
		}
		if (n2 < result) {
			result = n2;
		}
		if (n3 < result) {
			result = n3;
		}
		return result;
	}
	
	//3) 문자열 하나를 전달받아서, 첫글자를 대문자로 변환하는 함수 upperCase를 작성하세요
	static String upperCase(String str) {
		String answer = "";
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(i == 0 && 'a' <= ch && ch <= 'z') {
				ch -= 32;	// 첫글자가 소문자이면 대문자로 바꿔라
			}
			answer += ch;	// i번째 글자(ch)를 answer에 순서대로 더한다
		}
		// 97 ~ 122
		return answer;
	}
	
	// 4) 문자열 하나와 정수 두개를 전달받아서
	// 문자열의 from번째 글자부터 to글자 이전까지의 글자를 잘라낸
	// 새로운 문자열을 반환하는 함수 substring을 작성하세요
	static String substring(String str, int n1, int n2) {
		String answer = "";
		for(int i = n1; i < n2; i++) {
			char ch = str.charAt(i);
			answer += ch;
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		
		// 1) 두 정수의 덧셈을 반환하는 함수 add를 작성하세요
		int q1 = add(10, 20);
		System.out.println("q1 : " + q1);
		
		// 2) 세 정수를 전달받아서 가장 작은 수를 반환하는 함수 getMinNumber를 작성하세요.
		int q2 = getMinNumber(17, 15, 13);
		System.out.println("q2 : " + q2);
		
		// 3) 문자열 하나를 전달받아서, 첫글자를 대문자로 변환하는 함수 upperCase를 작성하세요
		String q3 = upperCase("hello");
		System.out.println("q3 : " + q3);	// Hello
		
		String t3 = upperCase("3 years later");
		System.out.println("t3 : " + t3);	// 3 years later
		
		// 4) 문자열 하나와 정수 두개를 전달받아서
		// 문자열의 from번째 글자부터 to글자 이전까지의 글자를 잘라낸
		// 새로운 문자열을 반환하는 함수 substring을 작성하세요
		String q4 = substring("Hello, world !!", 0, 5);
		System.out.println("q4 : " + q4);	// Hello
		
		String t4 = substring("Hello, world !!", 7, 12);
		System.out.println("t4 : " + t4);	// world
		
		
	}

}
