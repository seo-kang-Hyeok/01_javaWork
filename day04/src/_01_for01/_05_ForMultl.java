package _01_for01;

public class _05_ForMultl {

	public static void main(String[] args) {
		//충첩 for문
		for(int i = 1 ; i <= 3; i++) {
			for(int j = 9; j > 4; j--) {
				System.out.println("i=" + i + ", j=" + j);
			}
		}
		System.out.println("-----------------------------");
		
		// 중첩 for문을 이용한 구구단 출력
		
		for(int dan = 2; dan <= 9; dan ++) {
			System.out.println(dan+"단"); //내부 사이클이 돌기 전에 출력
			for(int i = 1; i <= 9; i ++) {
				System.out.println(dan + "*" + i + "=" + dan * i);		
			}
			System.out.println(); //내부 사이클 1회전 후 출력
		}
		
		
		
		
		
		
	}
}
