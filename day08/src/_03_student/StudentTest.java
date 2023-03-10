package _03_student;

public class StudentTest {

	public static void main(String[] args) {
		Student.class1 = "JAVA반";
		
		Student st1 = new Student(); //static이 붙지않은 변수를 불러오기 위해서 객체 생성해줘야한다.
		st1.name 	= "홍길동";
		st1.stuNum 	= 20230201;
		st1.addr 	= "서울 당산동";
		
		Student st2 = new Student(); //static이 붙지않은 변수를 불러오기 위해서 객체 생성해줘야한다.
		st2.name 	= "서강혁";
		st2.stuNum 	= 20230202;
		st2.addr 	= "서울 종로구";
		
		System.out.println("학급명 : " +Student.class1);
		System.out.println("이름 : " +st1.name);
		System.out.println("학번 : " +st1.stuNum);
		System.out.println("주소 : " +st1.addr);
		System.out.println("---------------------");
		
		System.out.println("학급명 : " +Student.class1);
		System.out.println("이름 : " +st2.name);
		System.out.println("학번 : " +st2.stuNum);
		System.out.println("주소 : " +st2.addr);
		System.out.println("---------------------");
		//학급명이 바뀌었다!
		Student.class1 = "공공데이터융합반";
		System.out.println("학급명 : " +Student.class1);
		System.out.println("이름 : " +st1.name);
		System.out.println("학번 : " +st1.stuNum);
		System.out.println("주소 : " +st1.addr);
		System.out.println("---------------------");
		
		System.out.println("학급명 : " +Student.class1);
		System.out.println("이름 : " +st2.name);
		System.out.println("학번 : " +st2.stuNum);
		System.out.println("주소 : " +st2.addr);
		//하나가 바뀌면 전부 바뀐다.
		
		System.out.println("=====================");
		Student.totalCount(28);
		//객체 생성없이 사용 가능하다.
		st1.totalCount(25);
		Math.abs(-6); //student 가 붙었음을 할 수 있음.없다면?
//		Math ma = new Math();
	}

}
