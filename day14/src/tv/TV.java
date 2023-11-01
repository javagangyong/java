package tv;

public class TV {
	
	// 필드 (변수)
	boolean power;
	int channel;
	int volume;
	
	int maxCh = 15;	// 메서드에 직접 리터럴로 입력할 수도 있지만
	int minCh = 1;	// 가급적 리터럴을 최소화 시킨다
	int maxVl = 10;	// 그래서 필드에 저장해서 사용
	int minVl = 0;
	int saveVolume;
	
	// 생성자
	TV() {
		power = false;
		channel = 5;
		volume = 3;
	}
	
	// 메서드
	void turn() {
		power = !power;
		show();
	}
	
	// **기능과 요구사항을 정리하고 코드를 쓰기**
	// 채널 올림	(채널은 최대값을 넘기면 최소값으로 변해야 한다)
	void channelUp() {
		if(power) {					// 전원이 켜져 있으면
			channel++;				// 채널을 변경하고
			if(channel > maxCh) {	// 추가 보정이 필요하면
				channel = minCh;	// 값을 수정하고
			}
		}
		show();					// 그 결과를 화면에 출력한다
		
	}
	
	// 채널 내림	(채널은 최소값을 넘기면 최대값으로 변해야 한다)
	void channelDown() {
		if(power) {
			channel--;
			if(channel < minCh) {
				channel = maxCh;
			}
		}
		show();
		
	}
	
	// 볼륨 올림	(볼륨은 최대값을 넘기면 최대값으로 변해야 한다)
	void volumeUp() {
		if(power) {
			volume++;
			if(volume > maxVl) {
				volume = maxVl;
			}
		}
		show();
	}
	
	// 볼륨 내림	(볼륨은 최소값을 넘기면 최소값으로 변해야 한다)
	void volumeDown() {
		if(power) {
			volume--;
			if(volume < minVl) {
				volume = minVl;
			}
		}
		show();
	}
	
	// 음소거		(마지막으로 저장된 볼륨값을 복사해두었다가, 다시 불러와야 한다)
	void mute() {
		if(power) {
			int tmp = volume;
			volume = saveVolume;
			saveVolume = tmp;
		}
		show();
	}
	
	// 화면 출력	(현재 TV의 채널과 볼륨상태를 보여줄 수 있어야 한다)
	void show() {
		if(power) {
			System.out.println("┌─────────────────┐");
			System.out.println("│                 │");
			System.out.printf("│    ch : %2d\t  │\n", channel);
			System.out.printf("│    vol : %2d\t  │\n", saveVolume != 0 ? "--" : volume);
			System.out.println("│                 │");
			System.out.println("└────────┰────────┘");
			System.out.println("  ━━━━━━━┻━━━━━━━ \n");
		}
		else {
			System.out.println("┌─────────────────┐");
			System.out.println("│                 │");
			System.out.printf("│    power off    │\n", channel);
			System.out.printf("│                 │\n", volume);
			System.out.println("│                 │");
			System.out.println("└────────┰────────┘");
			System.out.println("  ━━━━━━━┻━━━━━━━ \n");
		}
		
		
	}
	
	
	
	
	
}
