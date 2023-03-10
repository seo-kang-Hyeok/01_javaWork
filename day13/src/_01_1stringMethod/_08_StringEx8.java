package _01_1stringMethod;

public class _08_StringEx8 {

	public static void main(String[] args) {
		// toLowerCase() : 모든 문자를 소문자로 변환
		// toUpperCase() : 모든 문자를 소문자로 변환
 		String str1 = "JAVA Program";
 		//string 메서드들은 원본 파일이 바뀌지 않아요.사본입니다.
		
 		String strLower = str1.toLowerCase();
		System.out.println(strLower);
	
		String strUpper = str1.toUpperCase();
		System.out.println(strUpper);
		
		//한글자만 대문자로 바꾸고 싶다.
		String str2 = strLower.substring(0,1).toUpperCase() 
			+ strLower.substring(1,5)
			+ strLower.substring(5, 6).toUpperCase()
			+ strLower.substring(6); 
		System.out.println(str2);
		
	}
}
