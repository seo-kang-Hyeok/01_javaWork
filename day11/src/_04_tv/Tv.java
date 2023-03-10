package _04_tv;

public interface Tv {
	int MAX_VOLUME = 50; 
	int MIN_VOLUME = 0; 
	
	int MAX_CHNNEL = 137; 
	int MIN_CHNNEL = 0; 
	
	void tvOn();
	void tvOff();
	void channel(int chnnel);
	void volume(int volume);
}
