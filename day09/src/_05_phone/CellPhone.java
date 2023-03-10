package _05_phone;

public class CellPhone extends Phone{
	String massage;
	boolean rec;
	
	void massage(String mms) {
		massage = mms;
		System.out.println("문자가 왔습니다.문자 내용 : " +mms);
	}
	void recOn() {
		rec = true;
		System.out.println("녹화를 시작합니다.");
	}
	void recOff() {
		rec = false;
		System.out.println("녹화를 종료합니다.");
	}
}
