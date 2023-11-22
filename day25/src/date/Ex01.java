package date;

public class Ex01 {
	public static void main(String[] args) {
		
		// 클래스 import 선언을 하지 않고 패키지+클래스 이름으로 전체 이름을 다 지정하여 사용할 수 있다
		// Date 클래스의 기본생성자 객체는 객체가 생성된 시점의 날짜 및 시간을 저장하고 있다
		java.util.Date d1 = new java.util.Date();
		
		System.out.println("d1 : " + d1);
		
		long ln1 = d1.getTime();	// 날짜 객체의 내부 64비트 정수를 추출한다
		
		System.out.println("ln1 : " + ln1);
		
		// 생성자 호출 시 long값을 전달하여 임의의 날짜 객체를 생성할 수도 있다
		java.util.Date d2 = new java.util.Date(0);
		System.out.println("d2 : " + d2);
		
		long ln2 = d2.getTime();
		System.out.println("ln2 : " + ln2);
		
		// 자바의 날짜는 밀리세컨드 단위로 계산한다
	}
}
