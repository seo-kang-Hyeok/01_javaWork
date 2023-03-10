package _04_array;

import java.util.Arrays;

public class _04_Array {

	public static void main(String[] args) {
		int[] arr1 = {39,4,29,67,19,95,75,37,68};
		System.out.println(Arrays.toString(arr1));//배열을 모두 출력
		//Arrays.toString
		
		char[] chArr = {'a', 'b', 'c', 'd', 'e'};
		boolean barr[] = {true, false, false, true, false};
		String strArr[] = {"이순신", "아무개", "홍길동"};
		double dArr[] = {10.12, 12.56, 23.45, 54.674};
		
		System.out.println(Arrays.toString(barr));
		System.out.println(chArr); //char는 주소가 아닌 내용이 출력됨.
		System.out.println(Arrays.toString(chArr));//사용가능.
		
	}

}
