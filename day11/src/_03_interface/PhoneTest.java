package _03_interface;

public class PhoneTest {

	public static void main(String[] args) {
		SmartPhone sp =new SmartPhone();
		sp.turnOn();
		sp.setVolume(80);
		sp.search("인터페이스");
		sp.turnOff();
		System.out.println("--------------------------");
		
		SmartPhone2 sp2 =new SmartPhone2(); //오버라이딩한 것.
		sp2.turnOn();
		sp2.setVolume(80);
		sp2.search("인터페이스");
		sp2.turnOff();
		sp2.internet("dsfsfdsf");
		System.out.println();
		System.out.println("--------------------------");
		
		Phone phone =sp; //phone에 있는 3가지를 사용 가능하다.
		phone.turnOn();
		phone.setVolume(-5);
		phone.turnOff();
		System.out.println();
		
		Searchable sa = sp; //Searchable에 있는 1가지만 사용 가능.
		sa.search("추상클래스");	
	}
	static void method(Phone phone) { //인터페이스도 상송받은애를 상속 받을 수 있다.
		phone = new SmartPhone();
		phone = new SmartPhone2();
	}
}
