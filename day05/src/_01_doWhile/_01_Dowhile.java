package _01_doWhile;

import java.util.Scanner;

public class _01_Dowhile {

	public static void main(String[] args) {
		// do~While : 1번은 반드시 실행해야되는 반복문 일 때 사용
		int user = 0 ; //내부에 user을 넣게 되면 지역 변수로 외부에서 사용 할 수 없기 때문에 외부에 지정해준다.
		Scanner scan = new Scanner(System.in); 
		do {
			System.out.println("----------------");
			System.out.println("  1  |  2  |   3");
			System.out.println(" 계속 | 실행 | 중지");
			System.out.println("================");
			System.out.println (" 선택하세요");
			user = scan.nextInt();
			
		} while (user != 3); //외부에 탈출 조건을 입력! 1번 출력 후 지하면 탈출! do ~ while문
		System.out.println("프로그램이 중지됨");
		
	
	}

}
