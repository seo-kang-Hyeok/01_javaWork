package _01_Iflse;

import java.util.Scanner;

public class _05_Ex {

	public static void main(String[] args) {
		//사용자로 부터 숫자 1개를 입력받아
		//0, 음수, 양수, 출력
		//if ~else 문으로
		
//		Scanner s = new Scanner(System.in);
//		System.out.println("수를 입력하세요 : ");
//		int num1 = s.nextInt();
//		
//		if(num1 == 0)
//			System.out.println("입력값은 0입니다.");
//		else if (num1 < 0)
//			System.out.println("입력값은 음수 입니다.");
//		else
//			System.out.println("입력값은 양수 입니다.");
		
//----------------------------------------------------------//
		
		
//		*if문과 연산자의 활용
		int score = 11;
		if( score > 100 || score < 0)
			System.out.println("점수는  0~100 사이 입니다. 다시 넣으세요.");
		else if(score <= 100 && score >= 90)
			System.out.println("A학점");
		else if(score < 90 && score >= 80)
			System.out.println("B학점");
		else if(score < 80 && score >= 70)
			System.out.println("C학점");
		else if(score < 70 && score >= 60)
			System.out.println("D학점");
		else 
			System.out.println("F학점");
		
		
		
	}

}
