package _03_Operator;

public class Operator01 {

	public static void main(String[] args) {
		/*
		1.  단항 연산자
 			항이 1개인 연산자 음수표시, ++,--
		2.  이항 연산자
			항이 2개인 연산자
			2 + 3
		3.	심항 연산자
			항이 3개인 연산자
			10 == 5 ? 1 : 0
		4.	대입 연산자
			int a = 10
		 */
		
		//1. 단항 형산자
		int num1 = 10;
		num1++;
		System.out.println(num1); //식 뒤에 ++이 들어가 10으로 출력 뒤 1이 더해짐.
		++num1;
		System.out.println(num1); //식 앞에 ++이 들어가 1이 더해고 11으로 출력 .
		
		num1 = 10;
		num1--;
		System.out.println(num1);//식 뒤에 --이 들어가 10으로 출력 뒤 1이 뻬짐.
		--num1;
		System.out.println(num1);//식 앞에 --이 들어가 1이 빼고 8으로 출력 .
		System.out.println("----------------");
		
		int num2 = 10;
		int result = ++num1 + ++ num2;
		System.out.println(result);
		System.out.println("-----------------");
		
		//num1 = 10;
		//num2 = 10;
		//++, -- 는 뒤에 붙으면 우선 순위가 가장 낮다.
		num1 = num2 = 10;
		result = num1 ++ + num2++; //변수 뒤에 붙은 ++의 우선 순위는 가장 낮아, 연산 후 출력 후에 더 해진다.
		System.out.println(result); // 10 + 10 후 1씩 더해짐.
		System.out.println(num1); // 1 더해짐.
		System.out.println(num2); // 1 더해짐.
		
		num1 = num2 = 10; //값 초기화
		result = num1 ++ + ++num2; // 10 + 11 
		System.out.println(result);// 10 + 11
		System.out.println(num1); //1이 더해진 뒤 출력.
		System.out.println(num2);//출력 뒤 1이 더해짐.
		System.out.println("-----------------");
		
		num1 = num2 = 10; //값 초기화
		result = --num1 + num2 --; // 9 + 10
		System.out.println(result);// 9 + 10
		
		num1 = num2 = 10; //값 초기화
		result = ++num1 + num2--; // 11 + 10
		System.out.println(result);// 11 + 10
		
		int n1, n2, n3;
		int n4 = 10, n5 =20, n6= 30;
		n1=n2=n3=10;
		
		//연습문제
		result = ++n1 + n2 -- - -- n3; // 11 + 10 - 9 = 12 (n1 = 11) (n2 = 9) (n3 = 9) 
		System.out.println(result); // 11 + 10 - 9 = 12
		System.out.println(n1); //(n1 = 11)
		System.out.println(n2); //(n2 = 9)
		System.out.println(n3); //(n3 = 9)
		
		n1=n2=n3=10;
		result = n1++ * ++n2 + n3++; //10 * 11 + 10 = 120(n1 = 11)(n2 = 11)(n3 = 11)
		System.out.println(result); //10 * 11 + 10 = 120
		System.out.println(n1); //(n1 = 11)
		System.out.println(n2); //(n2 = 11)
		System.out.println(n3); //(n3 = 11)
		
		System.out.println("-----------------------");
		n1 = n2 = n3 = 10;
		System.out.println(++n1); //11
		System.out.println(n2++); //10 출력 후 11변환
		
		
	}

}
