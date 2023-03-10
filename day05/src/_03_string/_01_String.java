package _03_string;

import java.util.Scanner;

public class _01_String {

	public static void main(String[] args) {
		// == 주소가 같은가? 물어보는것. 객체
		// 참조자료형에서 ==, != 는 객체가 생성된 줏고가 같은지 같지 않은지를 비교
		String name = "서강혁";
		String name2 = "서강혁";
		
		System.out.println(" 주소가 같은가? " + (name == name2));
		//true 같은 객체를 불러온 것이기 때문에 같다.
		
		String name3 = new String("kh정보교육원"); //new = 객체를 생성하시오.
		String name4 = new String("kh정보교육원");
		
		System.out.println(" 주소가 같은가? " + (name3 == name4));
		//false 새로운 객체를 생성하였기 때문에 같지 않다.
		
		String name5 = "아무개";
		String name6 = "서강혁";
		System.out.println(" 주소가 같은가? " + (name == name6));
		// true  작성된 위치와 상관없이 같은 객체로 인식 한다.
		
		name = "이순신"; //객체는 덮어쓰기 개념이 없다.
		System.out.println(" 주소가 같은가? " + (name == name6));
		
		System.out.println(" 주소가 같은가? " + name3.equals(name4));
		System.out.println(" 주소가 같지않은가? " + !name3.equals(name4));
		//== 와 equals 의 차이. equals는 내용이 같은지 물어본다.
		
		boolean bool = name.equals("이순신");
		System.out.println(bool);
		System.out.println(name.equals("이순신"));
		
	}

}
