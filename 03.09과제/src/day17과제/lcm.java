package day17과제;
import java.util.Scanner;
public class Lcm {
	Scanner sc = new Scanner(System.in);
	int a;
	int b;
	
	 public void lcm(){
		 System.out.println("1번 숫자를 입력하세요. : ");
			int num1 = sc.nextInt();
			System.out.println(" 2번 숫자를 입력하세요. : ");
			int num2 = sc.nextInt();
		 this.a = num1;
		 this.b = num2;
		int min = (a < b) ? a : b;   
		int gcd = 0;
			for (int i = 1; i <= min; i++) {
				if (a % i == 0 && b % i == 0)
					gcd = i;
	}
	System.out.println(a+" 와 "+ b + " 의 최소공배수 : " + a * b / gcd);

}
}
