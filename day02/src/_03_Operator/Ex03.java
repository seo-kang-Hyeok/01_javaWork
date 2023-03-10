package _03_Operator;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
//		if01 문제
		
//		사용자로 부터 입력받아 if문을 사용하여 홀수 인지 짝수 인지 확인하라.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오. : ");
		
		int num1 = scan.nextInt();
		
		if(num1 % 2 == 0)	
			System.out.println("양수입니다.");
		
		if(num1 % 2 > 0)
			System.out.println("홀수입니다.");
		
		
	}

}
