package array;

public class Ex07 {
	public static void main(String[] args) {
		// 문자열을 char배열로 변환후 선택정렬을 수행하고
		// 다시 문자열로 바꿔서 출력하기
		
		String str = "qwertyuiopasdfghjklzxcvbnm";
		char[] arr = str.toCharArray();
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = (char)tmp;
				}
			}
		}
		// 캐릭터배열을 받는 print함수가 따로 있다. 오버로딩 되어있는
//		System.out.println(char[] arr);
		System.out.println(arr);
		
		
		
	}

}
