package _01_1stringMethod;

public class _09_StringEx9 {

	public static void main(String[] args) {
		//trim() : 앞과 뒤의 공백 제거
		//중간의 공백들은 그대로 유지
		String str1 = "           java        ";
		
		System.out.println(str1 + "공백제거 전");
		System.out.println(str1.trim() + "공백제거 후");
		
		String str2 = "           program     ";
		String str3 = "         입문       ";
		System.out.println(str1.trim() + str2.trim() + str3.trim());
		
		String str4 = "          jave program 입문      ";
		System.out.println(str4.trim() + ": 공백제거");
		
	}
}
