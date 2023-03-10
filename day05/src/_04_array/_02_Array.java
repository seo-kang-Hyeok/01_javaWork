package _04_array;

public class _02_Array {

	public static void main(String[] args) {
		// 합계와 평균 구하기
		int[] score = {89, 100, 94, 46, 75};
		System.out.println("배열의 길이 : " + score.length);
		
		int sum = 0;	
		for(int i=0; i <score.length; i++) 
			sum += score[i];
		
		double avg = (double)sum / score. length;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
	}
}
