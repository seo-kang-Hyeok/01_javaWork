package _01_1stringMethod;

public class _06_StringEx6 {

	public static void main(String[] args) {
		//substring(시작index, 끝index) : 시작index ~ 끝index-1 
		//Substring(시작index) : 시작index부터 끝까지
		String str = "공공데이터 융합 웹 애플리케이션 개발자 양성과정2";
		System.out.println(str.substring(6,8));
		System.out.println(str.substring(9));
		
		//		or 따로 저장해두고 출력하고 싶다?
		String subStr = str.substring(6,8);
		System.out.println(subStr);
		
//		문제
//		나이 생일 성별 출력/
		
		String sn ="041121-3789760";
//성별
//		String gender = sn.substring(7,8);
//		if(gender.equals("1" || gender.equals("3"))
//		or
//		int gender = Integer.parseInt(sn.substring(7,8));
//		if(gender == 1 || gender == 3)
//			System.out.println("남자");
//		else
//			System.out.println("여자");
		//
		String gender = sn.substring(7,8);
		switch (gender) {
		case "1" : case "3" : 
			System.out.println("남자입니다.");
			break;
		case "2" : case "4" :
			System.out.println("여자입니다.");
			break;
		}

		String birthday = sn.substring(2,4) + "월" + sn.substring(4, 6) +"일";
		System.out.println("생일은"+birthday+"입니다.");
		
		//문자열을 숫자로 바꿔준다.
		int year = Integer.parseInt(sn.substring(0,2)) + 2000;
		System.out.println(2023-year + "세");
		//90년대생과 2000년대생 구분하려면 인텍스 7번으로 비교 하면 될 듯. 1or2면 1900더하고 3.4면 2000더하고
	}

}
