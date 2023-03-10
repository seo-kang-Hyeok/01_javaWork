package chap_01;

public class _07_TypeCasting {

	public static void main(String[] args) {
		//형변환 TypeCasting
		//정수형에서 실수형으로
		//실수형에서 정수형으로
		
//		int scort = 93 + 98.8; 
		//정수형 데이터와 실수형 데이터가 더해지려고 하니 오류발생!
		//int to float, double
		int score = 93; 
		System.out.println(score); //93
		System.out.println((float)score); //93.0
		System.out.println((double)score); //93.0
		
		//float, double to int
		float score_f = 93.3F;
		double score_d = 98.8;
		System.out.println((int)score_f); //93
		System.out.println((int)score_d); //98
		
		//정수 + 실수 연산
		score = 93+(int)98.8; // 93 + 98
		System.out.println(score); // 191
		
		score_d = (double)93+98.8; //93.0+98.8
		System.out.println(score_d); //191.8
		
		//변수의 형 변환된 데이터 집어넣기
		double convertedScoreDouble = score; // 191 -> 191.0
		//int -> long -> float  -> double (자동 형변환)
		
//		int convertedScoreInt = score_d; //
//		191.8 -> 191 에러발생 = 큰데이터에서 작은 데이터로 옮겨가면서 데이터가 잘린다는 경고라고 생각하면 됩니다.
		int convertedScoreInt = (int)score_d; // 191.8 -> 191
//		double -> float -> long -> int (수동 형 변환)
		
		//숫자를 문자열로 .클래스의 도움을 받아야해요
		String s1 =String.valueOf(93);
		s1 = Integer.toString(93); //93
		System.out.println(s1); //93
		
		String s2 = String.valueOf(98.8);
		s2 = Double.toString(98.8);
		System.out.println(s2);
	
		//문자열을 숫자로
		int i =Integer.parseInt("93");
		System.out.println(i); //93
		double d =Double.parseDouble("98.8");
		System.out.println(d); //98.8

//		숫자로 바뀔 수 없는 문자를 숫자로 바꾸려고 하면? 
//		int error = Integer.parseInt("자바");
//		에러발생! 바뀔 수 없는 자료는 에러 발생합니다. 
	}
}
