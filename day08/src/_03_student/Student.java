package _03_student;

import _04_operator.OperatorTest;

public class Student {
	static String class1; 
	int stuNum;
	String name;
	String addr;
	String subName;
	static int tCount;
	
	//메서드(기능)
	String subjectName(String subName) {
		this.subName = subName;
		return this.subName;
	}
	
	static void totalCount(int tCount) {
		System.out.println("현재 수강인원 : " + tCount);
//		System.out.println("이름 : " name); 사용불가.
//		name은 객체를 생성하지 않고 사용 할 수 없기 때문.
	
	}
}