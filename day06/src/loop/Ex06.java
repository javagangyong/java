package loop;

public class Ex06 {
	public static void main(String[] args) {
		// 30일동안 은행에 돈을 입금한다
		// 첫날에 10원, 그다음날에 20원, 그다음날에 40원
		// 이런식으로 전날의 두배를 준비하여 입금한다
		// 30일째 입금이 끝난 후
		// 은행에 누적된 총 금액은 얼마인지 계산하여 출력하세요
		// (금액에 천단위 구분기호 콤마를 적용하여 출력하세요)
		
		long money = 10;
		int day = 1;
		long totalMoney = 0;
	
		while(day <= 30) {
			totalMoney = totalMoney + money;
			System.out.printf("%d일째 금액 : %,d원\n", day, totalMoney);
			day++;
			money = money * 2;
			
		}
		
		System.out.printf("%d일째 금액 : %,d원\n", day, totalMoney);
		
		
		
		
		
		
	}

}
