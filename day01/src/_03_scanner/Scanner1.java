package _03_scanner;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//next 단어단위로 읽어옴
		
//		System.out.print("이름을 입력하세요 : ");
//		String str = scan.next();
//		System.out.println("당신의 이름은 " + str + "이군요!!!");
//		
//		//nextLine 한 줄로 읽어옴.
//		System.out.print("주소을 입력하세요 : ");
//		String str2 = scan.nextLine();
//		System.out.println("주소 : " + str2);
//		
//		System.out.print("첫번째 숫자를 입력하세요 : ");
//		int num1 = scan.nextInt();
//		System.out.print("두번째 숫자를 입력하세요 : ");
//		int num2 = scan.nextInt();
//		
//		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
//		
//		~~님의 주소는 ~~입니다. 만들기.
		System.out.print("이름을 입력하세요 : ");
		String str1 = scan.nextLine();
		System.out.print("주소을 입력하세요 : ");
		String str2 = scan.nextLine();
		
		System.out.println("str1" + "님의 주소는" + "str2" + "입니다.");
		
		
		
		
		
		
		
	}

}
