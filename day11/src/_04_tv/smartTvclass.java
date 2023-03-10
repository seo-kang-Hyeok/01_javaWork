package _04_tv;

public class SmartTvclass implements Tv,SmartTv{
	int volume;
	int channel;
	@Override
	public void search(String search) {
		System.out.println(search + " 영화를 를 검색합니다.");
	}

	@Override
	public void tvOn() {
		System.out.println("tv를 켭니다.");
	}

	@Override
	public void tvOff() {
		System.out.println("tv를 끕니다.");
	}

	@Override
	public void channel(int channel) {
		if ( channel > MAX_CHNNEL) 
			this.channel = MAX_CHNNEL;
		
			else if (channel < MIN_CHNNEL)
				this.channel = MIN_CHNNEL;
		
			else
				this.channel = channel;
		System.out.println("현재 채널 : " + this.channel);
		} 
	

	@Override
	public void volume(int volume) {
		if ( volume > MAX_VOLUME)
			this.volume = MAX_VOLUME;
		
			else if (volume < MIN_VOLUME)
				this.volume = MIN_VOLUME;
		
			else
				this.volume = volume;
		System.out.println("현재 볼륨 : " + this.volume);
		

	}
}
