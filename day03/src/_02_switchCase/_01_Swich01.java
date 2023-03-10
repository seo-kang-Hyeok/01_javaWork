package _02_switchCase;

import java.util.Scanner;

public class _01_Swich01 {

	public static void main(String[] args) {
		//값이 맞으면 수행. break를 만나기 전까진 모두 수행한다.
		//가장끝은 브래이크 넣지 않아도 자동으로 빠져나간다.
		//~에서 ~까지 범위가 있는 것은 if문을 사용한다.
//		int num = 1;
//		switch(num) {
//		case 1 : 
//		case 6 : //1과 6모두 A반으로 출력됨. 한구역에 여러 값을 넣을 수도 있다.				
//		case 7 : case 8 : case 9 : //가로로 입력해도 된다.	
//			System.out.println("A반");
//			break; //1이면 거기까지!
//		case 2 :
//			System.out.println("B반");
//			break;
//		case 3 :
//			System.out.println("C반");
//			break;
//		case 4 :
//			System.out.println("D반");
//			break;
//		default	:
//			System.out.println("F반");//가장끝은 브래이크 넣지 않아도 자동으로 빠져나간다.
//		}
//		switch 문제
		// 월을 입력받아 switch문으로 봄, 여름, 가을, 겨울을 출력하기.
		Scanner s = new Scanner(System.in);
//		System.out.println("월을 입력하시오 :");
//		int mo = s.nextInt();
//		
//		switch(mo) {
//		case 4 : case 5 :
//			System.out.println("봄 입니다.");
//			break;
//		case 6 : case 7 : case 8 : case 9 : case 10 :
//			System.out.println("여름 입니다.");
//			break;
//		case 11 :
//			System.out.println("가을 입니다.");
//			break;
//		case 1 : case 2 : case 3 :
//			System.out.println("겨울 입니다.");
//			break;
//		default :
//			System.out.println("유효한 값이 아닙니다.");
//		}
//		
//		점수를 입력 받아서
//		A, B, C, D, F학점 출력.
	
		System.out.println("점수를 입력하세요 : ");
		int num = s.nextInt();
		num /= 20; 
		switch(num) {
		case 5 :
			System.out.println("A학점입니다.");
			break;
		case 4 :
			System.out.println("B학점입니다.");
			break;
		case 3 :
			System.out.println("C학점입니다.");
			break;
		case 2 :
			System.out.println("D학점입니다.");
			break;
		case 1 : case 0 :
			System.out.println("F학점입니다.");
			break;
		default :
			System.out.println("유요한 값이 아닙니다.");
		}
		 
		
	}

}
