package _03_Operator;

public class Ex02 {

	public static void main(String[] args) {
		int myAge		= 23;	//변수에 23을 대입
		int teacherAge 	= 38;
		
		boolean value = (myAge > 25);
		System.out.println(value);
		
		System.out.println(myAge <= 25);
		//myAge 와 teacherAge이 같은지 비교
		System.out.println(myAge == teacherAge); //같은지 비교
		
		char ch;
		ch = (myAge > teacherAge) ?	'T':'F'; // 삼항 연산자
		System.out.println(ch);
	}

}
