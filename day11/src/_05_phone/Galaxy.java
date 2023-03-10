package _05_phone;

public class Galaxy extends Phone{
	Galaxy(){
		System.out.println("갤럭시폰을 구입합니다.");
	}
	@Override
	void bell() {
		System.out.println("따르르르릉");
		}
	@Override
	void callOn() {
		call = true;
		System.out.println("갤럭시 ...전화를..받습니다...통화녹음on!");
	}
	@Override
	void callOff() {
		call = false;
		System.out.println("갤럭시 ...전화를..끊습니다...통화녹음off!");	
	}
}
