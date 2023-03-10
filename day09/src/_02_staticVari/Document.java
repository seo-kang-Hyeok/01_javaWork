package _02_staticVari;

public class Document {
	static int count; //초기값 0
	String name;
	
//	Document() { //생성자
//		name = "제목없음" + ++count;
//		System.out.println("문서" + name + "이 생성되었습니다.");
//	}
	Document() { //생성자
		this("제목없음" + ++count); //생성자 불러오는게 잘 이해가 안됨; 
	}
	
	Document(String name) {
		this.name = name;
		System.out.println("문서 " + this.name + " 생성되었습니다." );
	}
	
	Document(int a) {
		System.out.println("문서 " + this.name + " 생성되었습니다." );
	}
}
