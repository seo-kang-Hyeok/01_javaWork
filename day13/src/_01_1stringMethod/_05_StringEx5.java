package _01_1stringMethod;

public class _05_StringEx5 {

	public static void main(String[] args) {
		//replace : 글자치환
		String str = "javaprogram java kinjava parljava";
		String newStr = str.replace("java", "자바");
		System.out.println(newStr);
		
		newStr = str.replace("j", "oi");
		System.out.println(newStr);

		newStr = str.replaceFirst("a", "b"); 
		System.out.println(newStr);
		//가장 앞에 있는 a만 b로 치환.
		
	}

}
