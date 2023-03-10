package _01_for01;

public class _03_For {

	public static void main(String[] args) {
		//1~100까지 홀수의 합
		int oddSum = 0 ; {
		for (int i = 1; i <= 100; i += 2)
			oddSum += i;
		}
		System.out.println("1~100까지 홀수의 합 : " + oddSum);
		
		//1~100까지 홀수의 합
		int sum = 0;	{
			for (int i = 0; i <= 100; i+=2) 
				sum += i;		
		}
		System.out.println("1~100까지 짝수의 합 : " +  sum );
			
		//if문을 사용해서
			
		sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%2==1)
					sum += i;
		}
		
		int oddSum2 = 0;
		int evenSum = 0;
		for(int i =1; i<=100; i++) {
			if(i%2==0)
				evenSum += i;
			else
				oddSum2 += i;
	}
		System.out.println("1개의 for문으로 짝수의 합 : " + evenSum);
		System.out.println("1개의 for문으로 홀수의 합 : " + oddSum2);

	}

}
