package _05_phone;

public class Phone {
	boolean call;
	
	void callOn() {
		call = true;
		System.out.println("전화를 받았습니다.");
	}
	void callOff() {
		call = false;
		System.out.println("전화를 끊었습니다.");
}
}