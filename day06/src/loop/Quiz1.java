package loop;

public class Quiz1 {
	public static void main(String[] args) {
		
		// 1) 자신의 이름을 5회 반복하여 출력하세요
		String name = "이경용";
		int i = 0;
		while(i < 5) {
			System.out.println(name);
			i++;
		}
		System.out.println();
		
		// 2) 0부터 5까지 한줄에 출력하세요
		i = 0;
		while(i <= 5) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		
		// 3) 5부터 0까지 한줄에 출력하세요
		i = 5;
		while(i != -1) {
			System.out.print(i + " ");
			i--;
		}
		System.out.println();
		
		
		// 4) 1부터 100까지의 합계를 구하여 출력하세요
		int sum = 0;
		i = 1;
		while(i < 101) {
			sum += i;
			i++;
		}
		System.out.println("1부터 100까지의 합계 : " + sum + "\n");
		
		// 5) 1부터 100사이의 정수 중, 7의 배수만 한줄에 출력하세요
		i = 1;
		while(i < 101) {		// 숫자를 반복하여 증가시킬 조건
			if(i % 7 == 0) {	// 변화하는 숫자의 값이 7로 나누어떨어지면 출력
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();
		
		i = 7;				// 초기값 변경
		while(i < 101) {	// 조건은 그대로
			System.out.print(i + " ");
			i += 7;			// 7씩 증가하기 때문에 if를 쓰지 않아도 된다
		}
		System.out.println();
		
	}
}








