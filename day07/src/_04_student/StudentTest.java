package _04_student;

public class StudentTest {

	public static void main(String[] args) {

//강혁답--------------------------------------------------------------//
		
Student st1 = new Student();
		  
	st1.classnameChange("수학"); System.out.println("이번 강좌는 " + st1.className +"입니다.");
	st1.leverUp(2); System.out.println("학년은" + st1.lever + "입니다.");

	st1.name = "김백반";
	st1.nameChange("김차돌"); System.out.println("개명한 이름은" + st1.name + "입니다");
	
	st1.studentNum = 20230001;
	System.out.println("학번은 " + st1.studentNum);
	System.out.println("학과는 " + st1.major);	  
//	100를 만들어야 한다!? 이렇게 각각 만드는건 너무 어렵겠지? 반복문 사용!
//	Student st2 = new Student();
//	Student st3 = new Student();이렇게 각각 만드는건 너무 어렵겠지? 반복문 사용!

	
	Student[] st = new Student[100]; 	//자료형이다
			//비어있는 객체는 안에 null이 들어가 있다.
	for(int i=0; i<st.length; i++) { //안을 넣어주자.
			st[i] = new Student();
			st[i].studentNum = 20230101+i;
			System.out.println(st[i].studentNum);
	}
	
		//학번 같은 int는 더하기만 하면 되니 반복문을 사용하기 좋당

	
	
	}
}

