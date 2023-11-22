package socket;

import java.io.BufferedWriter;
import java.io.File;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) throws Exception {
		
		File f = new File("index.html");	// 접속한 클라이언트에게 보낼 파일을 하나 준비한다
		Scanner sc = new Scanner(f);		// 파일의 내용을 읽어내는 스캐너
		
		ServerSocket ss = new ServerSocket(1234);	// 접속자와 소켓을 생성하기 위한 서버소켓
		
		System.out.println("접속 대기중...");
		Socket so = ss.accept();			// 클라이언트가 접속하면 이후 코드 실행
		System.out.println("접속 : " + so.getInetAddress());
		
		OutputStreamWriter osw = new OutputStreamWriter(so.getOutputStream(), "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);	// 클라이언트에게 데이터를 내보내는 스트림
		
		while(sc.hasNextLine()) {		// 파일의 내용에서 다음 줄이 있으면
			String data = sc.nextLine();// 그 내용을 읽어서
			bw.write(data + "\r\n");	// 클라이언트에게 소켓을 통하여 데이터를 보낸다
		}
		bw.flush();
		bw.close();
		sc.close();
		so.close();
		ss.close();
	}
}
