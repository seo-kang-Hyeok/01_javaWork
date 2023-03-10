package _01_for01;

import java.util.Scanner;

public class _06_ForMultl {

	public static void main(String[] args) {
//			안의 for
//		1행	*          	별1      밖의 for
//		2행	**			별2
//		3행	***			별3
//		4행	****		별4
//		5행	*****		별5
//		6행	******		별6
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력 할 별의 갯수 입력 : ");
		int star = sc.nextInt();
		
		for(int i = 1; i <=star; i++) {		//i = 1 입력값 star보다 i 작거나 같은가? true = 수행
			for (int j = 1; j <= i; j++) {	
				System.out.print("*");
			}
			System.out.println();
		}
		//진행 순서 
		// sc 3 입력
		//i = 1. 입력값 star보다 i 작거나 같은가? true = 수행 . i++
		//j = 1. j는 i 보다 작거나 같은가 ? true = 수행 = 별찍기. j++리사이클
		//j = 2. J는 i 보다 작거나 같은가 ? false = 수행x 통과 . println 리사이클
		
		//i = 2. 입력값 star보다 i 작거나 같은가? true = 수행 . i++
		//j = 1. J는 i 보다 작거나 같은가 ? true = 수행 = 별찍기. j++리사이클
		//j = 2. J는 i 보다 작거나 같은가 ? true = 수행 = 별찍기. j++리사이클
		//j = 3. J는 i 보다 작거나 같은가 ? false = 수행x 통과 . println 리사이클
		
		//i = 3. 입력값 star보다 i 작거나 같은가? true = 수행 . i++
		//j = 1. J는 i 보다 작거나 같은가 ? true = 수행 = 별찍기. j++리사이클
		//j = 2. J는 i 보다 작거나 같은가 ? true = 수행 = 별찍기. j++리사이클
		//j = 3. J는 i 보다 작거나 같은가 ? true = 수행 = 별찍기. j++리사이클
		//j = 4. J는 i 보다 작거나 같은가 ? false = 수행x 통과 . println 리사이클
		
		//i = 4. 입력값 star보다 i 작거나 같은가? false = 수행x 통과 종료
		
	}

}
