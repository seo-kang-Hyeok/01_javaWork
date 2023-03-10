package _01_2stringBuffer;

public class stringBuffer1 {
	
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		//equals()를 오버라이딩 하지 않았음. 주소가 같은가를 물어봄
		System.out.println("sb1 == sb2 ? " + (sb1 == sb2));
		System.out.println("sb.equals(sb2) ? "+ sb1.equals(sb2));
		
		//sb1 = sb1 + "def"; 오류 stringBuffer는 String 처럼 이어서 쓸 쑤 없음.
		//addend() 사용 : 맨 뒤에 부착된다.
		sb1.append("def");
		System.out.println("sb1 : " +sb1);
		sb1.append("...알파벳");
		System.out.println("sb1 : " +sb1);

		sb2.append("def...알파벳");
		
		//문자열이 같은가를 비교할 떄는 String으로 변환하여 비교하는 것이 편함.
		//String으로 변환. 더 이상 변경하지 않을 가능성이 큰걸 변경.
		String str =sb1.toString();
//					new String(sb1); 동일하다.	
		String str2 =sb2.toString();
		System.out.println(str.equals(str2));
	}

}
