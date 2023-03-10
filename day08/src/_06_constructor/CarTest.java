package _06_constructor;

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car("black", "제네시스", 5); //3개의 인자를 넣으라고 쓰여있기 때문에 넣지 않으면 오류 발생.
		//new! 객체가 생성될때 생성자가 호출이 됩니다.
		System.out.println("car1의 색상 : " + car1.color);
		System.out.println("car1의 모델명 : " + car1.model);
		System.out.println("car1의 문의 갯수 : " + car1.door);
		System.out.println("-----------------------------");
		
		//
		Car car2 = new Car("White","스포츠카", 3);
		System.out.println("car2의 색상 : " + car2.color);
		System.out.println("car2의 모델명 : " + car2.model);
		System.out.println("car2의 문의 갯수 : " + car2.door);
		
		}
	}