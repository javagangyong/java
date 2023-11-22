package socket;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) throws Exception {
		// 도메인 주소를 이용하여 접속할 대상을 지정하고, 포트번호를 설정한다
		InetAddress addr = InetAddress.getByName("www.gmarket.co.kr");
		int port = 80;
		
		Socket so = new Socket(addr, port);	// 주소와 포트번호를 이용하여 접속한다
		Scanner sc = new Scanner(so.getInputStream());	// 서버가 나에게 보내는 내용을 읽어들일 Scanner
		
		String request = "GET / HTTP/1.1\r\n";	// 서버에게 보낼 내용(요청)
		request += "\r\n";
		
		System.out.println(request);	// 요청 내용을 간단하게 확인하기 위해 출력
		
		// 내 컴퓨터 -> 서버로 데이터를 보내기 위한 output
		OutputStreamWriter osw = new OutputStreamWriter(so.getOutputStream(), "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write(request);	// 서버에 요청을 보낸다
		bw.flush();
		
		System.out.println("요청 전송");
		
		String response = "";		// 응답을 받기 위한 문자열
		while(sc.hasNextLine()) {	// Scanner로 들어오는 내용이 있으면
			response += sc.nextLine() + "\n";	// 내용을 문자열로 읽어서 response에 추가한다
		}
		sc.close();
		bw.close();
		
		System.out.println(response);	// 서버에게 받은 응답을 출력한다
		System.out.println("종료");
		so.close();
	}

}
