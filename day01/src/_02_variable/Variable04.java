package _02_variable;

public class Variable04 {

	public static void main(String[] args) {
		//print는 엔터x \n 넣으면 줄바꿈 가능
		System.out.printf("%d\n", 5);
		int num = 10;
		System.out.printf("%d\n", num);   //소주점 미지정시 6자리까지 출력.
		System.out.printf("%f\n", 3.0);   //"%c" = char 문자1개만 출력.
		System.out.printf("%c\n",'b');
		System.out.printf("%s\n", "asdfsdf");
		System.out.println("================");

		System.out.format("%d\n", 5);
		num = 10;
		System.out.format("%d\n", num);
		System.out.format("%f\n", 3.0);
		System.out.format("%c\n",'b');
		System.out.format("%s\n", "asdfsdf");	
		System.out.println("================");
		
		//8진수로 출력
		System.out.printf("%o\n" , 9);
		
		//16진수로 출력 .대소문x,X차이가 남.
		System.out.printf("%x\n" , 15);
		System.out.printf("%X\n" , 15);
		
		//가장 많이 사용하는 문법.  ("%6.4f", 1.234567);
		
		//소수점 4자리까지 출력.
		System.out.printf("%6.4f\n", 1.234567);
		//소수점 4자리까지 출력.
		System.out.printf("%7.4f\n", 12.234567);
		//정수자리 모두 출력 소수점 3자리까지 출력.
		System.out.printf("%.3f" , 1435.345678);
	}

}
