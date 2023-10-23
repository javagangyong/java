package string;

public class Ex03 {
	public static void main(String[] args) {
		
			// 주어진 문자열에서 알파벳만 가져와서 새로 구성된 문자열 s2를 출력하세요
			String s1 = "a1B2c3D3e5";
			String filter = "abcdefgABCDEFG";
			String s2 = "";		
			
			for(int i = 0; i < s1.length(); i++) {	// 전체 글자 중에서
				char ch = s1.charAt(i);				// 각 글자를 ch 라고 할때
				String s = ch + ""; 				// contains 함수에는 문자열을 전달해야 한다
				if(filter.contains(s)) {			// 필터가 글자를 포함하면(글자가 필테어 포함되면)
					s2 += s;						// 결과에 포함시킨다
				}
			}
			System.out.println("s2 : " + s2);
			
	}
}
