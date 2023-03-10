package _03_tv;

public class Tv2 {
	//tv2의 속성-------------------------//
	String company;	//null
	String model;	//null
	int channel;	//0
	int volume;		//0
	boolean power;	//false		아무것도 넣지 않았을때 디폴트 값.

	//기능 : 메서드
	void power() {
		power = !power; //
		if(power ==true)
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
	int volumeUp() {
	++volume;
	return volume;
	}
	int volumeDown() {
	--volume;
	return volume;
	}
}
