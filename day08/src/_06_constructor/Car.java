package _06_constructor;

public class Car {
	String color;
	String model;
	int door;
	
//	Car() { }생성자를 따로 작성하지 않으면 빈 생성자가 자동생성되어 컴파일됨.
	Car(String color, String midel, int door) {
		System.out.println("Car 생성자 호출");
		this.color = color;
		this.model = midel;
		this.door = door;
	}
	

}
