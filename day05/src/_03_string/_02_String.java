package _03_string;

public class _02_String {
	
	public static void main(String[] args) {
		// String(참조자료형)을 기본자료형(Byte, Short, Integer)으로 변환
		String str = "30";
//		int num = (int)b;
		//오류// String는 기본 자료형이 X. 괄호 변환은 기본자료형만 변환됨. 변환되지 않는다.
		int num = Integer.parseInt(str);
		System.out.println(num + 10);
		System.out.println(str + 10);
		//nun을 Integer로 변환 했기 때문에 연산된다. 
		//str은 문자로 인식.
		byte b1 = Byte.parseByte(str);
		
		String str2 = "15.678";
		double d1 = Double.parseDouble(str2);
		
		String str3 = "true";
		boolean bool = Boolean.parseBoolean(str3);
		
		//String.valueOf : 기본자료형을 String(참조자료형) 으로 바꿀떄
		int num2 = 50;
		String str4 = String.valueOf(num2);
		System.out.println(str4 + 100);
		
		
				
		
		
	}
}
