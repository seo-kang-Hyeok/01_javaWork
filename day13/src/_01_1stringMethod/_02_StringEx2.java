package _01_1stringMethod;

public class _02_StringEx2 {

	public static void main(String[] args) {
		//charAt(index) : index번호에 해당하는 분자 1개를 반환
		String str = "123456-1234567"; //주민등록 번호.
		char ch1 = str.charAt(7);
		switch(ch1) {
		case '1' : case '3' :
			System.out.println("남자");
			break;
		case '2' : case '4' :
			
			System.out.println("여자");
		}
	}

}
