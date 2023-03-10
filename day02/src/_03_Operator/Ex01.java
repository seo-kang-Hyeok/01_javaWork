package _03_Operator;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
//		// 사용자로부터 숫자 2개를 입력받아
//		// 사칙연산(+,-,*,/)과 몫, 나머지를 출력하시오.
//		9
//		5
//		
//		9+5=14
//		9-5=4
//		9*5=45
//		9/5=1.??????
//		9/5의 몫은 1
//		9/5의 나머지는 4
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int num1 = scan.nextInt(); //입력한 숫자를 a로 지정.nextInt=인트형으로 받아올께요!
		System.out.print("두번째 숫자를 입력하세요 : ");
		int num2 = scan.nextInt(); //입력한 숫자를 b로 지정.nextInt=인트형으로 받아올께요!
		
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2)); //앞에 string이 하나라도 있을때 수에 괄호를 하지 않으면 수가 아닌 문자로 인식하므로 수식에 괄호를 넣어준다.
		System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
		System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
		System.out.println(num1 + "/" + num2 + "=" + (num1/(double)num2)); //두 수 중 하나 이상의 형변환을 해주어야 소수점 이하의 값까지 출력된다.
		System.out.println(num1 + "/" + num2 + "의 몫은 " +(num1/num2));
		System.out.println(num1 + "/" + num2 + "의 나머지는 " +(num1%num2));
		

	}

}
