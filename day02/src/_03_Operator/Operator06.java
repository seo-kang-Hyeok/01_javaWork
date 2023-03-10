package _03_Operator;

import java.util.Scanner;

public class Operator06 {

	public static void main(String[] args) {
//		*3항연산자와 그 예시와 
//		3항연산자의 식
//		조건식 ? 식1 : 식2
//		
//		int a = 3;
//		int b = 5;
//		*int result = a > b ? a : b ;	//a가 b보다 큰가? 참이면 a 거짓이면 b 출력.
//		System.out.println(result);
//		
		//사용자로부터 2수를 입력 받아 더 큰 수를 출력하시오.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("첫번째 수를 입력하세요. : ");
//		int num1 = scan.nextInt();
//		System.out.println("두번째 수를 입력하세요. : ");
//		int num2 = scan.nextInt();
//		
//		System.out.println(num1 + "과" + num2 + "중 큰 수는 " + (num1 > num2 ? num1 : num2) + "입니다.");
//		
		//사용자로부터 숫자 1개를 입력받아
		//짝수, 홀수인지 출력하기?????충격 어캄?
		
		//강혁 풀이. 정답!!ㅗ아옹ㅇㅇ아ㅣㅇ
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int num1 = scan.nextInt();
		int num2 = num1 % 2;
		System.out.println("입력하신 " + num1 + " 은 " + ((num2 > 1) ? "홀수" : "짝수") + "입니다.");
		
		//선생님 풀이.
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int num3 = scanner.nextInt();
		String str = num3 % 2 == 1 ? "홀수" : "짝수";
		System.out.println(str);
		System.out.println(num3 % 2 == 1 ? "홀수" : "짝수");
		
		
	}

}
