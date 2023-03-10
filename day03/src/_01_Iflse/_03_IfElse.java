package _01_Iflse;

public class _03_IfElse {

	public static void main(String[] args) {
//		*else 의 활용	. else 에만 조건을 넣을 수 있다. else에는 조건을 넣을 수 없음.
		int score = 98;
		
		if(score >= 80)
			System.out.println("합격입니다");
		else
			System.out.println("불합격입니다");
		
		int num1 = 678;
		if (num1 >= 1000)
			System.out.println("1000보다 큰 숫자 입니다");
		else
			System.out.println("1000보다 작은 수 입니다");
		
		if(num1 % 2 == 0)
			System.out.println("짝수 입니다");
		else
			System.out.println("홀수 입니다");
		
		
	}

}
