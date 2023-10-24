package function;

public class Quiz1 {
	// 여기에 함수를 정의하세요
	// 1) 정수를 하나 전달받아서, 양수, 음수, 0을 문자열로 반환하는 함수 getSign
	static String getSign(int num) {
		String str;
		if(num > 0) str = "양수입니다.";
		else if(num == 0) str = "0입니다.";
		else str = "음수입니다.";
		return str;
	}
	
	// 2) 정수를 하나 전달받아서 정수의 배치를 거꾸로 뒤집어 반환하는 함수 getReverseNum
	static int getReverseNum(int num) {	// 나눗셈을 활용한 자릿수 구분
		int result = 0;			// num 		result	|	num		result	|	num		result
		while(num != 0) {		// 1234	 	0		|	123		4		|	12		43
			result *= 10;		// 1234 	0		|	123		40		|	12		430
			result += num % 10;	// 1234		4		|	123		40		|	12		432	
			num /= 10;			// 123		4		|	12		43		|	1		432
		}
		return result;
	}
	
	// 3) 두 정수를 전달받아서 n1의 n2제곱수를 반환하는 함수 pow
	static int pow(int n1, int n2) {	// (2, 10)
		int answer = 1;
		for(int i = 0; i < n2; i++) {	// 10번 반복하여
			answer *= n1;				// 2를 곱한다
		}
		return answer;
	}
	
	// 4) 두 정수를 전달받아서 n1을 n2로 나누었을때의 나머지를 반환하는 함수 remainder
	static int remainder(int n1, int n2) {
		int answer = 0;
		answer = n1 % n2;
		return answer;
	}
	
	// 5) 문자열을 하나 전달받아서, 문자열을 거꾸로 배치한 값을 반환하는 함수 getReverseStr
	static String getReverseStr(String str) {
		String result = "";
		for(int i = str.length()-1; i >= 0; i--) {
			char ch = str.charAt(i);
			result += ch;
		}
		return result;
	}
	
	public static void main(String[] args) {
		
	// 1) 정수를 하나 전달받아서, 양수, 음수, 0을 문자열로 반환하는 함수 getSign
		String f = getSign(0);
		System.out.println("f는 " + f);
		
	// 2) 정수를 하나 전달받아서 정수의 배치를 거꾸로 뒤집어 반환하는 함수 getReverseNum
		int q2 = getReverseNum(1234);	// 4321
		System.out.println("q2 : " + q2);
		int t2 = getReverseNum(13579);
		System.out.println("t2 : " + t2 + " \n");
		
	
	// 3) 두 정수를 전달받아서 n1의 n2제곱수를 반환하는 함수 pow
		int q3 = pow(2, 10);
		System.out.println("q3 : " + q3);
	
	// 4) 두 정수를 전달받아서 n1을 n2로 나누었을때의 나머지를 반환하는 함수 remainder
		int q4 = remainder(100, 6);
		System.out.println("q4 : " + q4);
	
	// 5) 문자열을 하나 전달받아서, 문자열을 거꾸로 배치한 값을 반환하는 함수 getReverseStr
		String q5 = getReverseStr("문자열");
		System.out.println("q5 : " + q5);
		
		
		// 함수 호출 코드에 마우스를 올려보세요
		// 함수 호출 코드에 마우스를 올린 상태로 컨트롤 클릭하면 
//		int test = Integer.parseInt("1234");
	}

}
