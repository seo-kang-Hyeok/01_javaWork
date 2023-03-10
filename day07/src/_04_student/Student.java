package _04_student;

public class Student {
//학생 속성----------------------------//
	String name;
	int studentNum;
	int lever;
	String major;
	String className;
	
//메소드------------------------------//
	
	String classnameChange(String classname1) {
		className = classname1;
		return className;
	};
	int leverUp(int lever1) {
		lever += lever1;   //혹은 ++lever;
		return lever;
	};
	String nameChange(String name1) {
		name = name1;
		return name;
	}
}
