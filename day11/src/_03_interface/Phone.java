package _03_interface;

public interface Phone {
	int MAX_VOLUME = 50; //없어도 앞에 static final이 붙어있다. 
	int MIN_VOLUME = 0; 

	void turnOn();
	void turnOff();
	void setVolume(int volume); //변하는 값은 넣어주면 안됨. 
}
