package control;

public class Ex03 {
	public static void main(String[] args) {
		// else : 조건이 참이 아니면 실행할 내용을 작성한다
		// else는 단독으로 사용할 수 없고, 이전에 if가 나타나있어야하고 연속되어있어야 한다

		int age = 19;
		if (age < 20) {
			System.out.println("미성년자입니다");
		}
//		System.out.println("다른 코드를 작성하면 연속성이 무너지므로, else를 실행할 수 없다");
		else { // 아니면 (이전에 등장한 조건이 참이 아니면)
				// else는 별도의 조건을 가지지 않는다
			System.out.println("성인입니다");
		}

		// if문을 비롯한 분기문, 반복문은 {} 안에 다른 제어문으로 중첩이 가능하다
		int gender = 3;
		if (age >= 20) {
			if (gender % 2 != 0) {
				System.out.println("퀘스트에 당첨되셨습니다");
			}
		} else {
			System.out.println("아쉽게도 면제되셨습니다");
		}

		// if와 else를 중첩한 형식

		int num = 3;
		// ctrl + shifrt + f
		// 중첩된 제어문을 사용할 때는 들여쓰기 시작지점을 맞춰야 한다

		if (num == 1) {
			System.out.println("one");
		} else {
			if (num == 2) {
				System.out.println("two");
			} else {
				if (num == 3) {
					System.out.println("three");
				} else {
					System.out.println("wrong");
				}
			}
		}
		// 위 코드에서 else안에 있는 if를 합친 경우
		if (num == 1) {					// 만약 num의 값이 1이면
			System.out.println("one");
		} 
		else if (num == 2) {	// (num이 1이 아닐때) 만약 num의 값이 2이면
			System.out.println("two");
		} 
		else if (num == 3) {	// (num이 1과 2가 아닐때) 만약 num의 값이 3이면
			System.out.println("three");
		}
		else {	// (num이 1도 아니고, 2도 아니고, 3도 아니면)
			System.out.println("wrong");
		}
		// if ~ else if ~ else
		// 여러 선택지 중 반드시 하나를 골라서 실행해야 할 경우
		
		
		
		
		
		
		
		
	}
			
}


