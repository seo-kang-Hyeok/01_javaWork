package exam;

public class LCM {

	public void lcm(int num1, int num2) {
		for(int i = num1; ; i +=num1) {
			if(i % num2 == 0) {
			System.out.println("최소공배수 : " + i);
			break;
			}
		}
	}
}