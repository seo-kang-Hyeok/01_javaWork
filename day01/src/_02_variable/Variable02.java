package _02_variable;

public class Variable02 {

	public static void main(String[] args) {
		int X = 10;
		double pi = 3.141519;
		//반드시 1글자만
		char ch = 'a';
		boolean bool = false;
		//안넣어도 되고 1글자 이상이어도 됨.
		String str = "abaasdff"; 
		
		System.out.println(X);
		System.out.println(pi);
		System.out.println(bool);
		System.out.println(str);
		System.out.println("-------------------");
		
		bool = 50 > 40 ;
		System.out.println(bool);
		System.out.println("===================");
	
		//정수를 넣을 떈 int 기본자료형.
		//더 큰수를 넣고 싶을 땐 long형.
		//long형을 사용시 반드시 뒤에 L입력 후 출력. 
		//그렇지 않은 int로 인식.
		long long1 = 1234567890000L;
		//float형 사용시 반드시 뒤에 F입력 후 출력. 
		//그렇지 않으면 double로 인식.
		float fl = 45.372F;

	}

}
