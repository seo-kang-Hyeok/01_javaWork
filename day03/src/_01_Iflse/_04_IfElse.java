package _01_Iflse;

public class _04_IfElse {

	public static void main(String[] args) {
//		*else if 의 활용 . else엔 조건을 넣을 수 없으므로 if를 활용하여 조건을 넣을 수 있다.
		int score = 89;
		
		if(score >=90)					
			System.out.println("A학점"); //90점 이상일 때 출력
		else if(score >= 80)			//90점 이상이 아닌 것 중 80점 이상 일 때
			System.out.println("B학점"); //80점 이상일 때 출력
		else if(score >= 70)			//80점 이상이 아닌 것 중 70점 이상 일 때
			System.out.println("C학점"); //70점 이상일 때 출력
		else if(score >= 60)			//70점 이상이 아닌 것 중 60점 이상 일 때
			System.out.println("D학점"); //60점 이상일 때 출력
		else 							//60점 이상이 아닐 때
			System.out.println("F학점"); //60점 미만일 때 출력
		
		int month = 1;
		if(month >= 3 && month <=5)			//month가
			System.out.println("봄입니다");
		else if (month >= 6 && month <=8)
			System.out.println("여름입니다"); //35도 이상이면 폭염경보, 40도 이상이면 
		else if (month >= 9 && month <=11)
			System.out.println("가을입니다"); // -10도 이하이면 한파경보, -20도 이하이면 한파경보
		else if (month == 1 || month == 2 || month ==12)
			System.out.println("겨울입니다");
		else
			System.out.println("1~12달만 존재 합니다. 다시 입력하세요.");
		
	}

}
