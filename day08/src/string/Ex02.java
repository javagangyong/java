package string;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = "Hello";
		String s2 = "Hello";
		String s3;
		
		System.out.print("Hello 라고 입력하세요 : ");
		s3 = sc.next();
		
		// s3에 Hello라는 값을 입력할 보장이 없기 때문에 
		// 애초에 새로운 메모리 공간을 만들어 놓는다
		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s2 == s3 : " + (s2 == s3));
		System.out.println("s1 == s3 : " + (s1 == s3));
		System.out.println();
		
		System.out.println("s1.eqauls(s2) : " + (s1.equals(s2)));
		System.out.println("s2.eqauls(s3) : " + (s2.equals(s3)));
		System.out.println("s1.eqauls(s3) : " + (s1.equals(s3)));
		System.out.println();
		
		// 문자열의 내용 비교
		// 1) A.equals(B)		: A와 B의 내용이 정확히 일치하는가
		// 2) A.startsWith(B) 	: A문자열이 B내용으로 시작하는가 (접두사 체크)
		// 3) A.endsWith(B) 	: A문자열이 B내용으로 끝나는가 (접미사 체크)
		// 4) A.contains(B) 	: A문자열이 B내용으로 포함하는가 (검색어 체크)
		// 다 A문자열의 기준이다
		
		System.out.println("s1.startsWith(\"He\") : " + (s1.startsWith("He")));
		System.out.println("s1.endsWith(\"lo\") : " + (s1.endsWith("lo")));
		System.out.println("s1.contains(\"el\") : " + (s1.contains("el")));
		
		sc.close();
	}

}
