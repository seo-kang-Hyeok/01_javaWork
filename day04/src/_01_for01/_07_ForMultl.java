package _01_for01;

public class _07_ForMultl {

	public static void main(String[] args) {
		//for문 안에 변수는 여러개 넣어도 0,
		//조건식은 1개만 넣어야 한다. 프로그램은 명확한 조건을 넣어야 하기 때문.
		for(int i = 1, j = 10; i <= 10; i++, j--) { 
			System.out.println("i=" + i + ", j=" + j);
		}
		System.out.println("---------------------------");
		
//		for(;;) 무한 반복을 뜻함. 내부에 빠져나오는 조건을 입력해아함. 그렇지 않으면 무한 루프에 빠지게 됨.
		
		int num1 = 10;
		for(;;) { 
			num1++;
			System.out.println(num1);
			if(num1 == 20)
				break; // 반복문을 빠져나올때 사용.
		}
		
	}

}
