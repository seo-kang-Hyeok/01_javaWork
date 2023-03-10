package exam;

public class GCD {//최대 공약수

	public void lcm(int num1, int num2) {
		for(int i = num1; ; i--) {
			if(i % num1 == 0 && i % num2 % i == 0) {
			
				System.out.println("최대공약수 : " + i);
			break;
			}
		}
	}
}