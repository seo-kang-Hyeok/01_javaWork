package _03_Operator;

public class Operator07 {

	public static void main(String[] args) {
//		*3항 연산자 문제 풀기
		
		int x, y, z;
		int absX, absY, absZ;
		//int signX, signY, signZ;
		
		x = 40 ;
		y = -9 ;
		z = 0 ;
		
		absX = x >= 0 ? x : -x; 	//x 가 0보다 크거나 같은가? 참이면 x ,거짓이면 -x
		System.out.println(absX);	//x는 40, 0보다 크다. 그로인해 absX는 x = 40
		absY = y >= 0 ? y : -y ;	//y 가 0보다 크거나 같은가? 참이면 y ,거짓이면 -y
		System.out.println(absY);	//y는 -9, 0보다 작다. 그로인해 absY는 -y = -9
		
		/*
		+40
		 -9
		  0 로 출력하시오.
		 */
//		강혁 풀이 오답
		int signX = x >= 0 ? +x : -x;  
		System.out.println(signX);
		int signY = y >= 0 ? +y : -y;
		System.out.println(signY);
		int signZ = z >= 0 ? + z : -z;
		System.out.println(signZ);
		//오답인이유! 마이너스에 마이너스가 붙으니 당연히 +로 출력..;;ㅎㅎ바본가 
		
//		선생님 답안
//		String signX = x > 0 ? "+" + x : ""+x; 
//		System.out.println(signX);				
//		
//		String signY = y > 0 ? "+" + y : ""+y;
//		System.out.println(signY);
//		
//		String signZ = z > 0 ? "+" + z : (z == 0 ? ""+z : ""+z);
//		System.out.println(signZ);
//		
//		signZ = z > 0 ? "+" + z : ""+z;
//		System.out.println(signZ);
		
		
		
	}

}
