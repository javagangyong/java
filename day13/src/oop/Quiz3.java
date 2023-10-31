package oop;

import java.util.Scanner;

class TV {
	// TV의 속성을 필드로 작성하세요
	// 전원, 채널, 볼륨 그 외 필요하다고 생각하는 필드를 자유롭게 작성하세요
	boolean power;
	int channel = 1;
	int volume = 5;
	
	// TV의 기능을 메서드로 정의하세요
	// 전원 on/off, 채널올림/내림, 볼륨올림/내림, TV상태 출력, 음소거
	// 채널은 일정 범위안에서 cycle형식으로 순환되어야 합니다
	// 볼륨은 일정 범위 안에서 최소 최대치를 넘길 수 없습니다
	// 음소거는 한번 누르면 볼륨이 0이 되었다가 다시 누르면 원래 볼륨으로 복구되어야 합니다
	// 대부분의 기능은 전원이 켜져있는 상태에서만 작동해야 합니다
	void turn() {
		power = !power;
	}
	
	int channelUp() {
		if(channel == 20) {
			channel = 1;
		}
		else {
			channel += 1;
		}
		return channel;
	}
	
	int channelDown() {
		if(channel == 0) {
			channel = 20;
		}
		else {
			channel -= 1;
		}
		return channel;
	}
	int volumeUp() { 
		if(volume == 10) {
			
		}
		return volume;
	}
	int volumeDown() { 
		return --volume;
	}
	int volumeZero() {
		volume = 0;
		return volume;
	}
	
	// 생성자에서 객체 생성 시 초기값을 지정하세요
	// 매개변수로 받지 않아도 초기값을 지정할 수 있습니다
	// 예를 들면 채널의 초기값이 0인것은 이상합니다. 다른 값이 초기값이 되도록 하세요
}

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TV tv = new TV();
		int menu;
		
		LOOP : while(true) {
			System.out.println(" ");
			System.out.println(" ");
			System.out.print("선택 >>> ");
			menu = sc.nextInt();
			switch(menu) {
			// 입력된 메뉴에 따라서 tv객체의 매서드를 호출하는 형태로 진행
			case 7:
				tv.channelUp();
				break;
			case 0:
				break LOOP;
			}
		}
		sc.close();
		System.out.println("프로그램 종료");
		
		
	}

}
