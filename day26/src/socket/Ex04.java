package socket;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) throws Exception{
		
		URL url = new URL("https://mgr.kgitbank.com");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		Scanner sc = new Scanner(conn.getInputStream());
		String content = "";
		
		while(sc.hasNextLine()) {
			content += sc.nextLine() + "\r\n";
		}
		sc.close();
		conn.disconnect();
		
		System.out.println(content);
		System.out.println(conn.getResponseCode());		// 상태코드
		System.out.println(conn.getResponseMessage());	// 상태메세지
	}

}
