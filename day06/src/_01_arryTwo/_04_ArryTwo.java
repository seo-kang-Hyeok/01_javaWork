package _01_arryTwo;

public class _04_ArryTwo {

	public static void main(String[] args) {
		// 1행은 5열, 2행 3열, 3행 7열
		int[][] num = new int[3][];
		num[0] = new int[5];
		num[1] = new int[3];
		num[2] = new int[7];
		
		int count = 1;
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				num[i][j] = count++;
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	
		
	}
}
