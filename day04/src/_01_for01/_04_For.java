package _01_for01;

import java.util.Scanner;

public class _04_For {

	public static void main(String[] args) {
		//구구단 출력
		//2단 출력
//		
//		System.out.println("2단");
//		for(int i = 1 ; i <= 9; i ++ ) {
//			System.out.println("2*"+ i + "=" + 2*i);
//		}		
		
		//사용자로부터 구구단 몇단을 출력 할 것 인지 입력 받아 출력.
		Scanner scn = new Scanner(System.in);
		
		System.out.println("몇단을 출력 할까요?: ");
		int dan = scn.nextInt();
		
		System.out.println(dan+"단");
		for(int i = 1 ;  i <= 9 ; i++) {
			System.out.println(dan + "*" + i +"=" + dan * i);
		}
		
		
		
		
		
		
		
	}

}
