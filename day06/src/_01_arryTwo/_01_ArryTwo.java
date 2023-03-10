package _01_arryTwo;

public class _01_ArryTwo {

	public static void main(String[] args) {
		int[][] score1 = new int [2][3];
		int[][] score2 = 	{{34, 78, 98},  
							{100, 87, 59}};
		
		System.out.println(score2[0][2]);
		System.out.println(score2[1][1]);
		
		System.out.println("score2 배열의 길이 (행)" + score2.length);
		System.out.println("score1 배열의 길이 (행)" + score1.length);
		
		System.out.println("score2 배열 [0]행의 열의 길이 :" + score2[0].length);
		System.out.println("score2 배열 [1]행의 열의 길이 :" + score2[1].length);
		
		//for 문을 이용해 이차원 배열 내용 추출하기.
		
		int[][] score3 = 	{{34, 78, 98},  
							{100, 87, 59, 98}};
		for (int i = 0; i < score3.length; i++) {
			for(int j = 0; j<score3[i].length; j++) {
				System.out.print(score3[i][j] + "\t"); //\t 탭
			}
			System.out.println();		
		}
			
		//2차원 배열 3행 5열 생성
		//값 1~ 15 넣기 ??어떻게 넣지?
		//seo[i][j] = {1};
		//출력하기
//		1.행과 열 만들기 0
//		1.행과 열값에 1~15를 넣어준다. 넣으면서 증가하면 됨.
//		행의 1~길이 까지 넣어주고 열로 넘어가서 다음~길이까지 넣어준다.
//		
		
		int[][] num = new int[3][5];
		int count = 1;
		
		for(int i = 0 ; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j ++) {
				num[i][j] = count++;
				System.out.print(num[i][j] + "\t");
			}	
			System.out.println("");
		}

	}

}
