package day17과제;
import java.util.Scanner;
public class Gcd {
	Scanner sc = new Scanner(System.in);
	int a ;
	int b ;
	public void gcd(){
		System.out.println("1번 숫자를 입력하세요. : ");
		int num1 = sc.nextInt();
		System.out.println(" 2번 숫자를 입력하세요. : ");
		int num2 = sc.nextInt();
		this.a = num1;
		this.b = num2;
		int min = (num1 < num2) ? num1 : num2;   
		int gcd = 0;
			for (int i = 1; i <= min; i++) {
				if (num1 % i == 0 && num2 % i == 0)
					gcd = i;
			}
	System.out.println(a+" 와 "+ b + " 최대공약수 : " + gcd);
		}
}
