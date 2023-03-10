package chap_03;

public class _02_String {

	public static void main(String[] args) {
		String s = "I Like Java and python and C.";
		
		
		//문자열 변환
		System.out.println(s.replace("and", ",")); //"and"를 ","로 변환
		System.out.println(s.substring(7)); //인덱스 기준 7 부터 시작 (이전 내용은 삭제)
		System.out.println(s.substring(7, 10)); //인덱스 기준 7 부터 10번 전까지!(이전 내용은 삭제)
		System.out.println(s.substring(s.indexOf("Java"))); //자바부터 끝까지!
		//"java"가 시작하는 위치부터, "."이 시작하는 위치 바로 앞까지.
		System.out.println(s.substring(s.indexOf("Java"),s.indexOf(".")));// 시작 위치부터 끝 위치 직전 
		
		
		//공백 제거
		System.out.println(s);
		System.out.println(s.trim()); // 앞 뒤 공백 제거
		
		//문자열 결합
		String s1 = "Java";
		String s2 = "Python";
		System.out.println(s1+s2); // JavaPython
		System.out.println(s1+ ","+ s2); //Java,Python
		System.out.println(s1.concat(",".concat(s2))); //concat = 문자를 결합해주는!
		//Java,Python

		
	}

}
