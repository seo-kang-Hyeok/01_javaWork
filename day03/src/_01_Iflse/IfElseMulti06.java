package _01_Iflse;

public class IfElseMulti06	{

	public static void main(String[] args) {
//		중첩 if
		int score = 15;
		
		if(score <= 100) {   //100~-까지
			if(score >= 90)
				System.out.println("A학점");	//90 ~ 100까지	
			else if(score >= 80)	
				System.out.println("B학점"); //80 ~ 89까지
			else if(score >= 70)	
				System.out.println("C학점"); //70 ~ 79까지
			else if	(score >= 60)	
				System.out.println("D학점"); //60 ~ 69까지
			else
				System.out.println("F학점"); //나머지는 F학점
	}	else 
			System.out.println("점수는 100이상 될 수 없습니다.");
			
		
		
		
		}
}
