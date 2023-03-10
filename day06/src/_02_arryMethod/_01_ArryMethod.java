package _02_arryMethod;
import java.util.Arrays;
public class _01_ArryMethod {
	public static void main(String[] args) {
//==배열의 메소드 배우기==========================================//
		
		int[] num = {1, 8, 9, 10, 5};
		int[] result = new int[10];
		
		//==========================================================//
		
		for(int i=0; i<num.length; i++) {
			result[i+2] = num[i];  //인덱스 번호도 연산 가능해요 ^^
		}
		System.out.println("result 배열 :" + Arrays.toString(result));
		//배열 내부의 자료를 모두 출력하는 메소드.
		
		//Arrays 클래스의 method사용===================================//
		
		int[] re2 = Arrays.copyOf(num, 3); 
		//원본 배열(num)의 인댁스번호 3전까지 복사 0, 1, 2
		System.out.println("re2    배열 :" + Arrays.toString(re2));
		
		int[] re3 = Arrays.copyOfRange(num, 1, 4); 
		//원본 배열(num)의 인댁스번호 1 ~ 4전까지 1,2,3 복사
		System.out.println("re3    배열 :" + Arrays.toString(re3));
		
		//System 클래스의 method 사용==================================//
		int[] re4 =new int[10];
		System.arraycopy(num, 2, re4, 3, 2);
		//원본 배열(num)의 (2번째인덱스)부터 (re4)의 (3번인덱스)에 (2개)가져온다.
		System.out.println("re4    배열 :" + Arrays.toString(re4));

	
	}
}
