package quiz;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		
		// 이름과 나이를 입력받고
		// 나이를 이용하여 성인 여부를 문자열로 준비한다음
		// 이름, 나이, 성인여부를 한 문장에 출력하는 코드를 작성하세요
		// (단, 성인은 20세 이상입니다)
		
		// 1) 변수 선언 및 초기화
		// 문제에서 사용해야할 값(결과를 결정하는데 요인이 되는 값 = 변수)
		// 요인이 되는 값이 어떤것이 있는지 파악하고, 자료형에 맞춰서 변수를 선언
		String name;	// 문자열 형식의 이름(입력받아야 함)
		int age;		// 정수 형식의 나이(입력받아야 함)
		boolean isAdult;// 논리 형식의 성인여부(계산해서 값을 만들어야 함)
		Scanner sc;		// 키보드 표준 입력을 위한 Scanner
		sc = new Scanner(System.in);	// 객체 생성으로 값 지정
		
		// 2) 입력
		// 입력받아야 하는 값을 순서대로 입력받는다
		// 자료형에 따라 실행(호출)하는 함수가 서로 다르다(함수의 종류를 알아둬야 한다)
		System.out.print("이름 입력 : ");
		name = sc.next();
		
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		// 3) 연산
		// 빈 값이 있는가? isAdult의 값이 아직 준비되지 않았다
		// age의 값을 이용하여 isAdult의 값을 계산한다
		isAdult = age >= 20;
		
		// 4) 출력
		// 모든값이 준비되었다면 서식을 준비하고 값을 출력한다
		System.out.printf("%s님은 %d살이고, %s입니다\n",
				name, age, isAdult ? "성인" : "미성년자");
		
		// 5) 마무리
		sc.close();
	}
}
