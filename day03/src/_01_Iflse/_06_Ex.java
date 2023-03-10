package _01_Iflse;

import java.util.Scanner;

public class _06_Ex {

	public static void main(String[] args) {
//		점수를 입력 받아서
//		70점 이상이면 합격
//			90점 이상이면 "장학생입니다"
//			그 나머지는 "축하합니다."
//		70점 미만이면 "불합격"
//		모든 사람에게 "고생하셨습니다."
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();
		
			if(score >= 0 || score <=100) 
				if(score >=70) 
					System.out.println("합격입니다. 축하합니다.");
				else
					System.out.println("불합격 입니다.");
				
			else 
				System.out.println("입력값 오류");
			
				System.out.println("고생하셨습니다.");
		
				
				
		char ch1 = ' ', ch2 = ' ';
		if (score >-90) {
			ch1 = 'A';
			if(score >= 95) {
				ch2 = '+';
			} else {
				ch2 = '0';
			}
		} else if (score >= 80) {
			ch1 = 'B';
			if(score >= 85)
				ch2 = '+';
			else
				ch2 = '-';
		}
		System.out.println(" 당신의 학점은 " + ch1 + ch2 + "입니다");
	
	
				
}
}