package _03_tv;

public class Tv3 {
	//tv3의 속성-------------------------//
	String company;	//null
	String model;	//null
	int channel;	//0
	int volume;		//0
	boolean power;	//false		아무것도 넣지 않았을때 디폴트 값.

	//메서드
	void power() {
		power = !power;
		if(power == true)
			System.out.println("tv를 켭니다.");
		else
			System.out.println("tv를 끝니다.");
	}
	int channelUp() {
		++channel;
		return channel; 
	}	
	int channelDown() {
		--channel;
		return channel;
	}
	int volume(int volume1) { //사용자로 부터 볼륨 값을 입력받음.
		volume = volume1;	//기존의 볼륨을 대체하세요.
		return volume1; //volume1을 리턴하세요.
	}
	int volumeUp(int volume1) {
		volume += volume1; //기존의 볼륨이 입력된 수를 더해라.
		return volume;//volume에 리턴하세요.
	}
	int volumeDown(int volume1) { 
		volume -= volume1;//기존에 볼륨이 입력된 수를 뺴세요.
		return volume;//volume에 리턴하세요.
	}
}
