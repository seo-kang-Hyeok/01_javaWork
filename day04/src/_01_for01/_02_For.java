package _01_for01;

import java.util.Scanner;

public class _02_For {

	public static void main(String[] args) {
		
//		for문을 활용하여 아래와 같이 출력하시오
//		1.안녕하세요
//		3.안녕하세요
//		5.안녕하세요
//		..
//		
//		int num = 1;
//		for(int i = 1; i <= 100; i++) {//i=i+2
//			System.out.println(num +".안녕하세요"); 
//			num += 2;
//			}
//		System.out.println("---------------------------");
//		
//		//for 감소
//		for(int i = 50; i >=1; i--)
//			System.out.println(i+ ". 안녕");
//		System.out.println("---------------------------");
//			
//		//1~100까지 합계를 구하시오
//		int sum = 0;	//밖에 변수를 생성했기 때문에 sum는 사라지지 않는다.
//		for(int i = 1; i <= 100; i++) {
//			sum = sum + i;
//		System.out.println("sum = "+sum); //sum 도 100번 출력 하려면 괄호 안에
//		}
//		System.out.println("---------------------------");
//		System.out.println("sum = "+sum); //sum은 1번 출력 하려면 괄호 밖에
//		
//		
//		Scanner scan = new Scanner(System.in); //Scanner는 계속 사용 가능하니 밖으로 옮겨놓아도 된다.
//		
//		for(int j=0; j <= 5; j++) { 
//			System.out.println("이름 입력 : ");
//			String name = scan.next();
//			System.out.println("당신의 이름은 " + name + "입니다");
//		}
//		
//		for(int j=1; j<=3; j++) {
//			System.out.println("첫번째 숫자 입력 : ");
//			int num1 = scan.nextInt();
//			System.out.println("두번째 숫자 입력 : ");
//			int num2 = scan.nextInt();
//			
//			System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
//		}
		
		//문제 
		//사용자로부터 2숫자와 연산자를 입력받아 연산한 결과 출력 (3번 반복)
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 1 ; i <= 3 ; i++) {
			System.out.println("첫번째 숫자를 입력 : ");
			int num1 = scan.nextInt();
			
			System.out.println("두번째 숫자를 입력 : ");
			int num2 = scan.nextInt();
			
			System.out.println("연산자를 입력 : ");
			String str1 = scan.next();
			
			char ch = str1.charAt(0); //str문을 char롤 변환시 사용
			
			//if문 사용
//			if(ch == '*' ) 
//				System.out.println(num1 + " * " + num2 + " = " + num1*num2);
//				else if(ch == '/')
//					System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
//				else if (ch == '+')
//					System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
//				else if (ch == '-')
//					System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
//				else if (ch == '%')
//					System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
//				else
//					System.out.println("유효하지 않은 연산자 입니다.");
//			
//			 switch case문
			switch(str1) {
			case "*" :
				System.out.println((num1) + " * " + (num2) + " = " + (num1*num2));
				break;
			case "/" :
				System.out.println((num1) + " / " + (num2) + " = " + (num1 / num2));
				break;
			case "+" :
				System.out.println((num1) + " + " + (num2) + " = " + (num1 + num2));
				break;
			case "-" :
				System.out.println((num1) + " - " + (num2) + " = " + (num1 - num2));
				break;
			case "%" :
				System.out.println((num1) + " % " + (num2) + " = " + (num1 % num2));
				break;
				default :
				System.out.println("유효하지 않은 연산자 입니다.");
			}
			
		}
		
}
}


