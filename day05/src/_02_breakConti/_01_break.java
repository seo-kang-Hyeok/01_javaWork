package _02_breakConti;

public class _01_break {

	public static void main(String[] args) {
		//break는 반복문에서 빠져 나온다!
		int sum = 0, i = 0;
		while(true) {
			if(sum > 100) //합계가 100이 넘어가는 순간 멈추시오!break!
				break;
			//break시 그 아래는 실행되지 않는다.
			i++;
			sum += i;
		}
		System.out.println("합계가 100이 넘는 순간은");
		System.out.println("1~" + i + "의 합계 = " + sum);
		
	}

}