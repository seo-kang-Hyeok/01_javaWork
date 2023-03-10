package _03_Operator;

public class Operator05 {

	public static void main(String[] args) {
//		*복합 대입 연산자, 복합 대입 연산 테스트.
		
		int num1 = 10;
		num1 = num1 + 10 ;	//같은말이다!
		num1 += 10;			//num1 = num1 + 10;같은말이다! + 더하고 = 출력해라!
		num1 *= 3;			//num1 = num1 * 3;
		num1 -= 5;			//num1 = num1 - 5;
		num1 /= 3;			//num1 = num1 / 3;
		num1 %= 5;			//num1 = num1 % 5;
		System.out.println(num1);
		
	}

}
