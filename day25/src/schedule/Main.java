package schedule;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Main {
	static ScheduleDTO getDTOFromUserInput(Scanner sc, SimpleDateFormat inputFormatter) {
		ScheduleDTO dto = new ScheduleDTO();
		
		System.out.print("일정 입력 : ");
		dto.setTitle(sc.nextLine());
		
		try {
			System.out.print("시작 날짜 입력(yyyy-MM-dd) : ");
			Date d1 = inputFormatter.parse(sc.nextLine());
			java.sql.Date d2 = new java.sql.Date(d1.getTime());
			dto.setStart_date(d2);
			// util.Date 는 Sun May 16 00:00:00 KST 1993 로 출력
			
			System.out.print("끝 날짜 입력(yyyy-MM-dd) : ");
			Date d3 = inputFormatter.parse(sc.nextLine());
			java.sql.Date d4 = new java.sql.Date(d3.getTime());
			dto.setEnd_date(d4);
			
		} catch (ParseException e) {
			System.out.println("형식에 맞지 않습니다" + e);
			e.printStackTrace();
		}
		
		
		
		
		return dto;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Handler handler = new Handler();
		SimpleDateFormat inputFormatter = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat outputFormatter = new SimpleDateFormat("yyyy년 MM월 dd일");
		Date date = null;	// java.util.Date는 java.sql.Date의 슈퍼클래스이다
		List<ScheduleDTO> list = null;
		int menu = -1, row;
		String name;
		
		// select sysdate from dual
		// getDate("sysdate")
		Date now = handler.getSysdate();
		

		while(menu != 0) {
			System.out.println("=== DB기준 현재 날짜 ===");
			System.out.println(now);
			System.out.println("====================");
			System.out.println("1. 전체 출력");
			System.out.println("2. 월별 검색");
			System.out.println("3. 일정 등록");
			System.out.println("4. 일정 삭제");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			switch(menu) {
			case 123: 
				// 오라클 데이터베이스 버전 정보를 문자열로 출력하기
				// select banner from v$version
				String banner = handler.version();		// 버전을 문자열로 불러와서
				System.out.println(banner);				// 출력
				
				break;
				
			case 1 : 
				list = handler.selectAll();
				for(ScheduleDTO ob : list) {
					System.out.printf("%s : %s ~ %s\n",
							ob.getTitle(), 
							ob.getStart_date(), 
							ob.getEnd_date());
				}
				break;
				
			case 2 : 
				break;
				
			case 3 : 
				ScheduleDTO dto = getDTOFromUserInput(sc, inputFormatter);
				row = handler.insertInput(dto);
				System.out.println(row != 0 ? "등록 완료" : "등록 실패");
				break;
				
			case 4 : 
				try {
					System.out.print("삭제할 날짜 입력(yyyy-MM-dd) : ");
					date = inputFormatter.parse(sc.nextLine());
					java.sql.Date d6 = new java.sql.Date(date.getTime());
					row = handler.remove(d6);
					System.out.println(row != 0 ? "삭제 완료" : "삭제 실패");
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				break;
				
				
			
			case 0 : break;
			}
			System.out.println();
		}	// end of while
	}

}
