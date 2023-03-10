package _02_while;

public class _01_While {

	public static void main(String[] args) {
		//for while문 의 과정 차이
		for(int i=1; i <=10; i++)
			System.out.println(i);
		
		System.out.println("-------------------");
		
		int i = 1; 				
		while (i <=10) {
			System.out.println(i);
			i++;
		}
		System.out.println("---------------------");
		//횟수가 지정되어 있을 땐 for문을 더 많이 사용한다.
		
		int sum = 0; 
		for (int j = 1; j <=100; j++)
			sum += j;
		System.out.println(sum);
		
		sum = 0 ;
		int j = 1;
		while (j<=100) {
			sum += j;
			j++;
		}
			System.out.println(sum);
		
		
		
		
		
		
		
	}

}
