package _01_arryTwo;

import java.util.Scanner;

public class _03_ArryTwo {

	public static void main(String[] args) {
		//2행 3열 배열 생성.
		//사용자로부터 점수를 입력 받아 넣기.
		//사람별로 평균 70점 이상이면 합격 그렇지 않으면 불합격.
		//평균 xx.x입니다. 합격입니다.
		//평균 xx.x입니다. 합격입니다.
//-----------------------------------------------------//
		//공간마련 0
		//과목별 점수 입력 받기. 국어 영어 수학
		//입력 받은 점수 각각의 위치에 입력하기.
		//~~입력하세요. 다시 돌아가서 입력하세요 . i가 가득 찰 때 까지.
		//사람별 점수 입력 받기.
		//사람별 평균 계산하기.
		//사람별 평균 변수만들어[] 입력하기.
		//입력된값 합격 불합격 출력하기.
		




		int[][] score = new int [2][3];
		String[]name = {"홍길동","아무개"};
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0; i<score.length; i ++) {
			int sum = 0;
			for(int j =0; j<score[i].length; j++) {
				System.out.println(name[i] + " 점수 입력 : ");
				score[i][j]= sc.nextInt();
			}
			System.out.println();
		}	
		
		for(int i = 0; i <score.length; i++) {
			int sum = 0;
			for(int j = 0; j < score[i].length; j ++) {
				sum += score[i][j];
			}
		double avg = (double)sum/3;
			if(avg >= 70)
				//System.out.println("평균 : " + avg + 입니다. 합격입니다.");
				System.out.printf("%s평균 :%.1f점 입니다. 합격입니다\n", avg);
			else
				//System.out.println("평균 : " + avg + 입니다. 불합격입니다.");
				System.out.printf("%s평균 :%.1f점 입니다. 불합격입니다\n", avg);
			
		}
		
		
		
		
	}

}
