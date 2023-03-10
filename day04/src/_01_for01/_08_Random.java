package _01_for01;

public class _08_Random {

	public static void main(String[] args) {
		// 난수 발생 : random()
		// 0.0 ~ 0.999999999999
		double random = Math.random();
		System.out.println(random);
		
		//0.0 ~ 9.9999999
		random = Math.random()*10;
		System.out.println(random);
		
		// 정수로 : 0 ~ 9 출력 = double을 int로 변환
		int random2 = (int)(Math.random()*10);
		System.out.println(random2);
		
		//1~10까지
		random2 = (int)(Math.random()*10)+1;
		System.out.println(random2);
		
		//1 ~ 3까지
		random2 = (int)(Math.random()*3)+1;
		System.out.println(random2);
		
		//1~6까지
		random2 = (int)(Math.random()*6)+1;
		System.out.println(random2);
		

		
		
		
		
	}

}
