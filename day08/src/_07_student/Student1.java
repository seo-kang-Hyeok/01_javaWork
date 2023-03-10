package _07_student;

public class Student1 {
//	변수 3개
//	학번
//	이름
//	전화번호
//	
//	생성자(매개변수 3개)
//		인스턴스변수를 초기화
	int studentNum ;
	String name;
	String phonNum;
	
	Student1(int studentNum, String name, String phonNum) {
		this.studentNum = studentNum;
		this.name = name;
		this.phonNum = phonNum;
	}
}