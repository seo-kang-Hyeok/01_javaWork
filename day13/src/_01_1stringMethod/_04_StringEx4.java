package _01_1stringMethod;

public class _04_StringEx4 {

	public static void main(String[] args) {
		String ssn = "0123456789112";
		int length = ssn.length();
//		if(length == 13) 
//		System.out.println("주민번호 자리수가 맞습니다.");
		System.out.println(length);
		if(ssn.length() == 13)
			System.out.println("주민번호 자리수가 맞습니다.");
		else
			System.out.println("주민번호 자리수가 아닙니다.");
		
	}
}
