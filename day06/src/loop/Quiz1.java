package loop;

public class Quiz1 {
	public static void main(String[] args) {
		
		
		
		
		// 1) 자신의 이름을 5회 반복하여 출력하세요
		int num;
		num = 0;
		
		while(num < 5) {
			System.out.println("이경용");
			num++;
		}
		
		// 2) 0부터 5까지 한줄에 출력하세요
		num = 0;
		
		while(num < 6) {
			System.out.print(num + " ");
			num++;
		}
		System.out.println();
		
		// 3) 5부터 0까지 한줄에 출력하세요
		num = 5;
		while(num > -1) {
			System.out.print(num + " ");
			num--;
		}
		System.out.println();
		
		// 4) 1부터 100까지의 합계를 구하여 출력하세요
		num = 0;
		int result = 0;				// 항등원 개념이다, 곱셈이었으면 1
		while(num <= 100) {
			result = result + num ;	// 누적더하기
			num = num + 1;
		}
		System.out.printf("1부터 100까지의 합은 %d입니다.", result);
		System.out.println();
		
		// 5) 1부터 100사이의 정수 중, 7의 배수만 한줄에 출력하세요
		num = 0;
		
		while(num <= 100) {			// 숫자를 반복하여 증가시킬 조건
			num++;
			
			if(num % 7 == 0) {		// 변화하는 숫자의 값이 7로 나누어떨어지면 출력
				System.out.print(num + " ");
			}
		}
		System.out.println();
		
		// 5) if문을 사용하지 않고 출력하기
		num = 7;				// 초기값 변경
		while(num < 101) {		// 조건은 그대로
			System.out.print(num + " ");
			num += 7;			// 7씩 증가하기 때문에 if를 쓰지 않아도 된다
		}
		System.out.println();
		
		
		
		
		
		
	}

}
