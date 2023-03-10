package _01_Iflse;

import java.util.Scanner;

public class _02_If {

	public static void main(String[] args) {
//		영문자(대소문자중 1개) 혹은 숫자 (0~9 중 1개)를 입력받아
//		영문자이면 문자입니다
//		숫자면 숫자입니다
//		논리연산자를 이용
		
		Scanner scan = new Scanner(System.in); //Scanner로 받으면 string로 입력됨.
		System.out.println("영문자(대소문자중 1개) 혹은 숫자 (0~9 중 1개)를 입력 :");
		String str = scan.next();
		char ch = str.charAt(0);
		
		if('0' <= ch && '9' >= ch)
			System.out.println("숫자입니다");
		
		if(('a' <= ch && 'z' >= ch) || ('A' <= ch && 'Z' >=ch))
			System.out.println("문자입니다.");
		
	}

}
