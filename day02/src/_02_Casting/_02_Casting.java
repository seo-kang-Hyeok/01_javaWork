package _02_Casting;

public class _02_Casting {

	public static void main(String[] args) {
//		*명시적 형변환과 변환가능한 크기를 확인하는 방법 테스트.  
		//명시적 형변환 :  큰자료형을 작은 자료형에 넣을때
		//				반드시 앞에 작은자료형을 괄호안에 명시한다.
		int num1 = 120;
		byte b1 = (byte)num1; //명시적 변환. 
		System.out.println(b1);
		
		num1 = 1234534;
		b1 = (byte)num1;		//데이터가 소실되는 것을 확인한다고 생각하면 이해하기 쉽다.
		System.out.println(b1); //명시하여 변환했지만 손실이 너무 큼. 고려해서 변환.
		
		double d1 = 13627.28792838271;
		float f1 =(float)d1;
		System.out.println(f1); //명시하여 변환했지만 손실이 너무 큼. 고려해서 변환.
		
		//변환가능한 정확한 크기를 알려주는(.M)라이브러리에 저장된 상수등장! 을치면 표시됨.
		System.out.println("byte의 크기 : " + Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
		System.out.println("short의 크기 : " + Short.MIN_VALUE + "~" + Short.MAX_VALUE);
		System.out.println("int의 크기 : " + Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		System.out.println("long의 크기 : " + Long.MIN_VALUE + "~" + Long.MAX_VALUE);
		System.out.println("char의 크기 : " + (int)Character.MAX_VALUE + "~" + (int)Character.MIN_VALUE);

		
}
}