package _01_polymorphism;
class Car {
	private String model;
	private int door;
	
	Car(String model, int door) {
		this.model = model;
		this.door = door;
	}
	void drive() {
		System.out.println("운전중");
	}
	void stop() {
		System.out.println("stop!!");
	}
	void call() {
		System.out.println("차를 호출한 곳으로 갑니다.");
	}
}
class Ambulance extends Car {
	Ambulance(String model, int door) {
		super("model", door);
	}
	@Override
	void call() {
		System.out.println("삐뽀 삐뽀 ~~~ 환자 이송중");
	}
	void firstAid() { //ambulance특
		System.out.println("부상자를 응급처치합니다.");
	}

}
class FireEngine extends Car {
	FireEngine(String model, int door) {
		super("model", door);
	}
	@Override
	void call() {
		System.out.println("엥 물을 뿌립니다.");
	}
}
public class PolymorphismTest3 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe1 = new FireEngine("소방차", 2);
		Ambulance ab1 = new Ambulance("병원차",3);
		
		car = fe1; //fel을 부모 car로 형변환
		car.call();//오버라이딩해서 사용 가능.
		car.drive();
		car.stop();
		System.out.println();
		
		car = ab1; //ab1을 부모 car로 형변환
		car.call();//오버라이딩해서 사용 가능.
		car.drive();
		car.stop();
		System.out.println();
		
		ab1 = (Ambulance)car; //부모로 형변환 했던 ab1을 자식클래스로 형변환.
		ab1.call();
		ab1.drive();
		ab1.stop();
		ab1.firstAid();
	}
}
