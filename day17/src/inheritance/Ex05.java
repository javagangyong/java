package inheritance;

class Parent5 {	// 두 정수를 전달받아서, 객체를 생성하고, 덧셈식을 출력하는 클래스
	int n1, n2;
	
	public Parent5(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public void show() {
		System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
	}
	
}

class Child5 extends Parent5 {
	// 생성자를 작성하여 필요한 코드를 작성하세요
	int n3;
	public Child5(int n1, int n2, int n3) {
		super(n1, n2);
		this.n3 = n3;
	}
	
	// 세 정수를 전달받고, 세 정수의 덧셈식을 출력하는 기능을 오버라이딩하세요 (함수 내용 수정)
	@Override
	public void show() {
		System.out.printf("%d + %d + %d = %d\n", n1, n2, n3, n1 + n2 + n3);
	}
	
	// 세 정수 중 가장 큰 수를 출력하는 함수를 작성하세요 (오버라이딩 아님, 함수 추가)
	public void showMaxNum() {
		int maxNum = Integer.MIN_VALUE;
		if(maxNum < n1) { maxNum = n1; }
		if(maxNum < n2) { maxNum = n2; }
		if(maxNum < n3) { maxNum = n3; }
		System.out.println("가장 큰 수 : " + maxNum);
	}
}

public class Ex05 {
	public static void main(String[] args) {
		Child5 ob = new Child5(12, 7, 25);
		ob.show();
		ob.showMaxNum();
		
		Parent5 ob1 = new Child5(1, 2, 3);
		Child5 ob2 = (Child5)ob1;
		
		System.out.println("ob1 : " + ob1);
		System.out.println("ob2 : " + ob2);
		System.out.println("ob1 == ob2 : " + (ob1 == ob2));
		// ob1 참조변수와 ob2 참조변수는 동일한 대상을 참조하고 있다
		
		ob2.show();
		ob2.showMaxNum();
		
		ob1.show();			// ob1은 슈퍼클래스 타입이지만 오버라이딩 메서드가 실행된다
//		ob1.showMaxNum();	// ob1은 슈퍼클래스 타입이므로, 서브클래스의 메서드를 참조할 수 없다
		// 슈퍼를 참조하든 서브를 참조하든 동일한 결과를 출력
		// 타입에 상관없이 언제든지 
		// 하나의 객체가 서로 다른 형태로 참조될 수 있다
	}

}
