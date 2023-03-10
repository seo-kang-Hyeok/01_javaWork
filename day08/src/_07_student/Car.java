package _07_student;

public class Car {
	String color;
	String model;
	int door;			//기본값
	
	Car() { //this입력시 가장 처음에 넣어줘야한다.
		this("black", "SM7", 5);
		System.out.println("매개변수가 없는 생성자");
	}
	Car(String color) { 
		this(color, "SM7", 5);
	}
	Car(int door) {
		this("black", "SM7", door);
	}
	Car(String color, String model) {
		this(color, model, 5);
	}
	Car(String color, int door) {
		this(color, "SM7",door);
	}
	Car(String color, String model, int door) {
		this.color = color;
		this.model = model;
		this.door = door;
		System.out.println("매개변수가 3개인 생성자");
	}
}
