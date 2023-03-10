package _03_interface;

//인터페이스 2개 상속
public class SmartPhone2 implements Phone, Searchable{
	int volume;

	@Override
	public void search(String msg) {
		System.out.println(msg + "를 검색한 결과입니다");		
	}

	@Override
	public void turnOn() {
		System.out.println("전화를 받습니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("전화를 끊습니다.");
	}

	@Override
	public void setVolume(int volume) {
		//max볼륨보다 큰 값이 들어오면
		//max볼륨을 인스턴스 변수에 넣어주고
		//min볼륨보다 작은 값이 들어오면
		//min볼륨을 인스턴스 변수에 넣어주고
		//min~max사이의 볼륨이 들어오면 사용자가 넣은 볼륨을 인스턴스 변수에 넣어준
		if(volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		}
		else if(volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		}
		else
			this.volume = volume;
		System.out.println("현재 볼륨 : " + this.volume);
		//+ volume라고 작성하면 지역변수 volume의 값이 출력. this의
	}
	
	@Override
	public void internet(String url) {
		System.out.println(url + " 을 검색");
	}
}