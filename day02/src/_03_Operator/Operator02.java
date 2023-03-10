package _03_Operator;

public class Operator02 {

	public static void main(String[] args) {
		
		int n1 = -20;
		n1 = +n1; //변하지 x, +-20 = 20
		System.out.println(n1);
		
		n1 = -n1; //--20 = +20
		System.out.println(n1);
		
		//int / int = int , 결과적으로 몫만 나옴.
		int x = 10; 
		int y = 7;
		int result = x/y;
		System.out.println(result); //1 나누면 몫만 나오고 나머진 버려진다.
		
		double result2 = x/y;
		System.out.println(result2); //1.0 나누면 몫만 나오고 나머진 버려진다.
		
		//실수형으로 결과를 보고싶으면 적어도 1개이상의 항이 실수형이어야한다.
		//나머지까지 구하려면 둘 중 double형을 사용하면 높은 값으로 자동형변환이 되기 때문에 소수점 까지 구해진다.
		result2 = x/(double)y;//명시적 형변환을 통해 y를 double형으로 변환하여 double형 값이 출력됨.
		System.out.println(result2); //1.4285714285714286
	
		// % 나머지
		result = x % y;
		System.out.println(result); //3 나머지 값이 출력 된다.
		
//		연습문제
//		x = 15;
//		y = 4;
//		출력문 "15/4의 몫은 3이고, 나머지 3입니다"
		
		int a = 15 / 4 ;
		int b = 15 % 4 ;
		String c = "15/4" ;
		System.out.println(c + "의 몫은" + a + "이고, 나머지" + b + "입니다");
	
		x = 15;
		y = 4 ;
		System.out.println(+ x +"/"+ y + "의 몫은" + x/y + "이고, 나머지" + x%y + "입니다");
	
	
	}

}
