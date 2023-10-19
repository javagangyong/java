package variable;

public class Quiz2 {
	public static void main(String[] args) {
		// 자신의 이름을 문자열 변수에 저장하세요(문자열은 primitive가 없습니다. String)
		String name = "원종래";
		
		// 자신의 나이를 정수형 변수에 저장하세요
		int age = 20;
		Integer age2 = 20;
		
		// 새로운 실수형 변수에 0을 대입하세요
		double db = 0;	// 우변의 0은 자료형이 명시되지 않은 리터럴이지만, 리터럴 정수의 기본자료형은 int이다
//		Double db2 = 0.0;	// Type mismatch: cannot convert from int to Double
//		Double db2 = (double)0;
		Double db2 = Double.valueOf(0);
		
		// 방금 만든 실수형 변수에 3.14를 대입하세요
		db = 3.14;
		db2 = 3.14;	// 실수의 대표자료형은 double이므로, 리터럴 값도 double타입을 가지게 된다
		
		// 지금까지 만든 3개 변수에 담긴 값을 각각 한줄씩 화면에 출력하세요
		// (primitive를 이용해서 한번, WrapperClass를 이용해서 한번 코드를 실행하세요)
		System.out.println(name);
		System.out.println(age);
		System.out.println(db);
		System.out.println();
		
		System.out.println(name);
		System.out.println(age2);
		System.out.println(db2);
		System.out.println();
		
	}
}
