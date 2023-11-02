package reference;

public class Ex08 {
	public static void main(String[] args) {
		// compareTo 함수를 직접 구현해보기
		
		String s1 = "apple";	// [97, 112, 112, 108, 101]
		String s2 = "banana";	// [98, 97, 110, 97, 110, 97]
		String s3 = "aegis";	// [97, 101, 103, 105, 115
		String s4 = "banan";	// [98, 97, 110, 97, 110]
//		System.out.println((int)'e');
		
		System.out.println("s1.compareTo(s2) : " + s1.compareTo(s2));	// -1
		System.out.println("s1.compareTo(s3) : " + s1.compareTo(s3));	// 11
		System.out.println("s2.compareTo(s3) : " + s2.compareTo(s3));	// 1
		System.out.println("s2.compareTo(s4) : " + s2.compareTo(s4));	// 1
		System.out.println();
		
		System.out.println("myCompareTo(s1, s2) : " + myCompareTo(s1, s2));
		System.out.println("myCompareTo(s1, s3) : " + myCompareTo(s1, s3));
		System.out.println("myCompareTo(s2, s3) : " + myCompareTo(s2, s3));
		System.out.println("myCompareTo(s2, s4) : " + myCompareTo(s2, s4));
		System.out.println();
	}
	
	static int myCompareTo(String s1, String s2) {
		int answer = 0;	// 반환할 값의 변수
		
		// 두 문자열의 길이가 다르다면 작은 길이만큼 반복해야 한다
		// ArrayIndexOfOutOfBoundsException (배열의 인덱스 범위를 초과했습니다)
		int size = s1.length() > s2.length() ? s2.length() : s1.length();
		
		for(int i = 0; i < size; i++) {	// 정해진 길이만큼 반복하면서
			char a = s1.charAt(i);	// s1의 i번째 글자
			char b = s2.charAt(i);	// s2의 i번째 글자
			if(a != b) {			// 두 글자가 서로 다르다면
				answer = a - b;		// 두 글자의 차이를 저장한다
				break;				// 차이를 찾았다면 반복중단
			}
		}
		// 반복문이 끝났음에도 불구하고, 차이를 발견하지 못했으면서, 문자열의 길이가 다르다면
		if(answer == 0 && s1.length() != s2.length()) {
			answer = s1.length() - s2.length();	// 길이의 차이를 저장한다
		}
		
		return answer;	// 정답을 반환한다
	}

}
