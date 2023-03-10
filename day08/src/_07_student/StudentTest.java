package _07_student;

public class StudentTest {

	public static void main(String[] args) {

		Student1 a = new Student1(20230001,"서강혁", "010-114");
		Student1 b = new Student1(20230111,"김자바", "010-119");
		Student1 c = new Student1(20230222,"홍코딩", "010-112");
		
		System.out.println("첫번째 학생");
		System.out.println("이름 : " + a.name +" 학번 : "+a.studentNum +" 전화번호 : "+a.phonNum);
		System.out.println("두번째 학생");
		System.out.println("이름 : " + b.name +" 학번 : "+b.studentNum +" 전화번호 : "+b.phonNum);
		System.out.println("세번째 학생");
		System.out.println("이름 : " + c.name +" 학번 : "+c.studentNum +" 전화번호 : "+c.phonNum);
		
		
		
//		Car car1 = new Car(5);			//int 자료형
//		Car car2 = new Car("yellow");	//String 자료형
//		Car car3 = new Car("green", "K7");
//		Car car4 = new Car();
//		
//		System.out.println(car1.color+" "+car1.door+" "+car1.model);
//		System.out.println(car2.color+" "+car2.door+" "+car2.model);
//		System.out.println(car3.color+" "+car3.door+" "+car3.model);
//		
	}
}
