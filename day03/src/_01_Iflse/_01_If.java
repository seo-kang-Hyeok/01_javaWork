package _01_Iflse;

public class _01_If {

	public static void main(String[] args) {
//		*조건문
//		if(조건식)
		
//		int score = 50;
//		
//		if(score >= 80) {
//			System.out.println("합격입니다."); 
//		}											//참일때만 실행.
//			System.out.println("------------------");
//		
//		if(score < 60)		
//			System.out.println("재평가 대상입니다.");	//한 줄 일때 괄호를 쓰지 않아도 됨. 괄호가 없으면 if문 바로 아래만 적용되어 출력됨.
//													//위에서 부터 내려온다.
//			System.out.println("------------------");
//			if(score >= 90)	{ 
//			System.out.println("합격입니다.");
//			System.out.println("우수한 성적입니다.");	//두 줄 이상일때 괄호를 사용하지 않으면 조건없이 내용이 출력됨.
//		}											//시안성을 위해 괄호를 넣어준다.
//			System.out.println("==================");
		
		int num = -40;
		
		if(num == 0)	{
			System.out.println("0입니다.");
		}
		if( num > 0)	{
			System.out.println("양수입니다.");
		}
		if( num < 0)	{
			System.out.println("음수입니다.");
			System.out.println("0보다 작은 수 입니다.");
		}
	
	
	}

}
