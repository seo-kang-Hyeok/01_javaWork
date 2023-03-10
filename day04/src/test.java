import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		   for(int j=1; j<=3; j++) {
			System.out.println("첫번째 숫자 입력 : ");
			int num1 = scan.nextInt();
			System.out.println("두번째 숫자 입력 : ");
			int num2 = scan.nextInt();
			
			System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		}
	}

}
