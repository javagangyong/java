package accessModifier;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// Human 클래스를 이용하여 비어있는 상태의 객체를 하나 생성하세요
		
		Scanner sc = new Scanner(System.in);
		Human ob;
		ob = new Human();	// 새로운 객체를 생성하고, ob가 그 객체를 가리키도록 한다
		
		// 본인의 이름과 나이를 키보드로 입력하여 그 값을 ob에 저장하고
		// 한줄에 출력하세요
		
		String name;
		int age;
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		ob.setName(name);	// ob.name = name;
		ob.setAge(age);		// ob.age = age;
		
		System.out.printf("%s님은 %d살입니다.", ob.getName(), ob.getAge());
		
		sc.close();
		
	}

}
