package _05_phone;

public class Iphone extends Phone{
	int emotion;
	
	Iphone(){
		System.out.println("아이폰을 구입합니다.");
		emotion++;
		System.out.println("갬성이 증가합니다. 갬성래벨 " +(emotion));
	}
	
	@Override
	void bell() {
		System.out.println("딩!딩! 딩디디딩딩딩.딩!");
		}
	@Override
	void callOn() {
		call = true;
		emotion++;
		System.out.println("전화를-받습니다.감성이 1증가합니다.갬성래벨 " +(emotion));
	}
	@Override
	void callOff() {
		call = false;
		emotion++;
		System.out.println("전화를-끊습니다. .감성이 1증가 합니다.갬성래벨 " +(emotion));	
	}
}
