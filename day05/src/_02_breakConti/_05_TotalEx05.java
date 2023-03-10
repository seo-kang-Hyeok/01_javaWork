package _02_breakConti;

import java.util.Scanner;

public class _05_TotalEx05 {

	public static void main(String[] args) {
		//사용자로 부터 입력받은 숫자의 약수 구하기
		// ex) 12의 약수 : 1, 2, 3, 4, 6, 12
		// %가 0이 나올 때 까지.
		// /값은 1부터 입력받은 수까지.  % 0일만 출력.
		//i = 1부터 시작. /가 수가 나오면 값에서 %부터 다시 시작.
		//1.사용자로부터 입력받기.
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("약수를 구할 숫자 입력(종료시 0입력) : ");
			int num = sc.nextInt();
			if(num  == 0)
				break;
		
			for (int i = 1; i <= num ; i++) {
				if(num % i == 0)
					System.out.print(i + ", ");
			}
			System.out.println();
		}
	}
}
