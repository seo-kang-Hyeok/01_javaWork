package _01_arryTwo;
public class _02_ArryTwo {
	public static void main(String[] args) {
		//사람별 총점과 평균 값 구하기 ^^ 행 = 사람, 열 = 과목별 점수
		int[][] score = {{90,89,100},
						{89,97,48},
						{68,93,88},
						{79,38,92},
						{100,59,81}};
		
		System.out.println("   국어   수학   영어   총점    평균");
		System.out.println("----------------------------------");
		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("%6d",score[i][j]); //"%6d"앞6자릿수를 확보해라.
				sum += score[i][j];
			}
			System.out.printf("%6d", sum);
			System.out.printf("%7.1f\n",((double)sum/score[i].length));
		}	
		System.out.println("==================================");
		int sum = 0;
		int[] num2 = new int[3];
		for (int i = 0; i < 3; i++) {
			sum = 0;
			for (int j = 0; j < score.length ; j++) {
				sum += score[j][i];
				 num2[i] = sum;
			}
			System.out.printf("%6d",sum);
		} 	
		System.out.println();
		for (int i = 0 ; i < 3 ; i++) {
			System.out.printf("%6.1f",(double)num2[i]/5);
		}
		
	
	}
}
