package loop;

import java.io.File;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) throws Exception {
		String data = "";
		File f = new File("C:\\windows\\system32\\drivers\\etc\\hosts");
		Scanner sc = new Scanner(f);
		
		while(sc.hasNextLine()) {
			data += sc.nextLine() + "\n";
		}
		sc.close();
		
		System.out.println(data);
		// 문제) data 변수에 들어있는 글자 중에서 대문자의 개수는 총 몇개일까요?
		
		int count = 0;
		for(int i = 0; i < data.length(); i++) {	
			char ch = data.charAt(i);
			if('A' <= ch && ch <= 'Z') {
				count += 1;
			}
		}
		System.out.println("대문자의 개수 : " + count);
		
		// 위와 비슷한 구조의 숫자 문제
		// 1에서 1000사이의 정수 중에서 13과 17의 공배수는 총 몇개인지 출력하세요
		
		int count2 = 0;
		for(int i = 1; i <= 1000; i++) {
			if(i % 13 == 0 && i % 17 == 0) {
				System.out.println(i);
				count2 += 1;
			}
		}
		System.out.println("13과 17의 공배수의 개수 : " + count2);
		
		
		
	}
}





