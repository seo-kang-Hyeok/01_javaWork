package _01_3Math;

public class Math1 {

	public static void main(String[] args) {
		// 절대값.실수 정수 모두 가능.
		System.out.println(Math.abs(-11));
		System.out.println(Math.abs(-11.13));
		
		//소수점 이하 무조건 올림
		System.out.println(Math.ceil(13.1));
		System.out.println(Math.ceil(-13.1));
		
		//소수점 이하 무조건 내림
		System.out.println(Math.floor(13.8));
		System.out.println(Math.floor(-13.8));
		
		//가장 가까운 정수값 반환.
		System.out.println(Math.rint(13.1));
		System.out.println(Math.rint(-13.1));
		System.out.println(Math.rint(-13.9));
		System.out.println(Math.rint(13.9));

		//소수점 이하 반올림
		System.out.println(Math.round(13.6));
		System.out.println(Math.round(-13.6));
		System.out.println(Math.round(13.1));
		System.out.println(Math.round(-13.1));
		
		//둘 중 작은수, 큰수
		System.out.println("7과 8중 큰 숫자 : " + Math.max(7, 8));
		System.out.println("7과 8중 작은 숫자 : " + Math.min(7, 8));
		
		//소수점 2째자리까지 얻지
		double value = 12.34567;
		double value2 = value * 100;
		System.out.println(value2);
		double value3 = Math.round(value2);
		System.out.println(value3);
		System.out.println(value3/100);
	}
}