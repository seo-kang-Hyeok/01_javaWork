package _01_for01;

import java.util.Scanner;

public class _09_Ex {

	public static void main(String[] args) {
		// 주사위 숫자 맞추기 게임
		//random으로 1~6까지의 숫자를 추출하여
		//사용자가 3회전까지 숫자 맞추기
		
//		1.랜덤 추출하기
//		2.for
//		3.사용자로부터 숫자가 몇인지 입력받기.
//		4.맞으면 for문 빠져나오기
//		5.틀리면 계속 for문 돌기
//		6.3회까지 틀리면 게임오버
		
//		강혁 정답
//		int random = (int)(Math.random()*6)+1; 
//		Scanner scan = new Scanner(System.in);	
//		for (int i = 1; i <= 3 ; i++) {
//			System.out.println("정답을 입력하세요! :");
//			int user = scan.nextInt();
//				for (int j = 1; random == user ; j++) {
//					System.out.println("정답입니다.");
//					break;
//				}
//		}	System.out.println("맞추지 못했습니다. 정답은 "+random+ "입니다.");
			
//		선생님 정답
		int random = (int)(Math.random()*6)+1;
		Scanner scan =new Scanner(System.in);
		for(int i = 1 ; i <=3; i++) {
			System.out.println("주사위의 숫자는 몇일까요? ");
			int user = scan.nextInt();
			
			if(random == user) {
				System.out.println("축하합니다. 정답입니다.");
				break;
			} else {
				if(i == 3) {
					System.out.println("3번 모두 틀렸습니다. 게임오버");
				} else {
					System.out.println("틀렸습니다 다시 입력하세요");
				}
			}
		}
		
		
	}

}
