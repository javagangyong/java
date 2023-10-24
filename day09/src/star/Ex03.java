package star;

public class Ex03 {
	public static void main(String[] args) {
		int size = 5;
		int sp = 0;
		int st = 5;
		
		for(int i = 0; i < size; i++) {
			
			for(int j = 0; j < sp; j++) {
				System.out.print("  ");
			}
			for(int j = 0; j < st; j++) {
				System.out.print("# ");
			}
			System.out.println();
			sp += 1;
			st -= 1;
		}
	}

}
