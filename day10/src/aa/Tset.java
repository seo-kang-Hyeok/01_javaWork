package aa;

import _05_phone.SmartPhone;
import tv.Tv;

public class Tset {
	public static void main(String[] args) {
		Tv tv = new Tv();
//		tv.channel = 10; 	//사용 불가능 private이 붙어서!
		tv.power(); 		//사용가능
		tv.channelUp();
		SmartPhone sp = new SmartPhone(); //수락해줬더니 오류 해소. public 이라 불러 올 수 있습니다.
		sp.talk("카톡보내기");
		sp.search("ㅎㅇ");
	}
}
