package string;

public class Ex01 {
	public static void main(String[] args) {
		// 문자열끼리 덧셈 연산자를 이용하여 연결할 수 있다
		String str = "Hello," + " world !!";	// 리터럴을 참조하는 str 변수
		System.out.println(str);
		
		// 7번 글자부터 마지막글자까지 잘라낸다
		// 정수를 하나만 전달하면 beginIndex라고 인식되어서
		// 지정한 위치부터 마지막까지 글자를 잘라낸다
		System.out.println(str.substring(7));	// substring, 문자열에 대한 뺄셈
		
		// 0번부터 5번까지 (마지막 범위는 포함되지 않음) 잘라낸다
		// 정수를 두개 전달하면 beginIndex부터 endIndex까지 잘라낸다
		// 이때, endIndex의 범위는 포함하지 않는다
		// for(int i = beginIndex; i < endIndex; i ++) { ... }
		// 즉 0번부터 4번까지
		System.out.println(str.substring(0, 5));
		
		// 글자의 내용이 일치하는지 확인한다
		// 내용 일치 여부 확인
		String str2 = new String("Hello, world !!");	// '새로운 공간'에 만들어낸 str2
		System.out.println(str.equals(str2));
		
		// 같은 내용의 글자라도, 비교연산자로는 true가 나오지 않는다
		// 참조 주소 일치 확인(메모리 위치)
		System.out.println(str == str2);
	}

}
