package _04_array;

import java.util.Random;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class _01_Array {

	public static void main(String[] args) {
		int num1 = 0, num2 = 1,num3 = 2, num4 = 3, num5 = 4;
		//배열 표시 []는 자료형 또는 변수명 어디에 붙여도 상관없음.
		//나중에 값을 넣고자 할 떄는 new키워드로 생성하면서 반드시 갯수를 넣어줘야 한다.
		//배열 표시[].
		//[]같은 값이여도 더 빠르다. sc시간이 더 빠르다.
		//객체를 순서대로 저장하기 때문에 
		//같은 자료여도 훨씬 빠르게 만들 수 있기 때문에...??
		//자~ 이제 자료 넣을꺼니까 자리 마련해놔 ^^ 
		//얼마나 넣으시게요? 몰?루 ?: ?? 자리 마련 못해놔여;;
		//이처럼 자리를 얼마나 마련 할 지 입력놔야한다.
		
		int[ ] arr1 = new int[5];
		int arr2 [] = new int[10];
		
		double[] douArr = new double[10];
		
//		int[] arr3 = new int[3]{10,20,30};
//		오류!자료를 넣던지 자리를 만들던지 하나만 해야해!오류 생겨요.
		int[] arr3 = {10,20,30,40,50,60,70,80,90,100}; //자료 3개 넣으면 알아서 3개 자리를 만들어준댜.
		char[] chArr = {'a', 'b', 'c', 'd', 'e'};
		boolean barr[] = {true, false, false, true, false};
		String strArr[] = {"이순신", "아무개", "홍길동"};
		
		//1개의 값 출력시 index 번호를 이용하여 출력.
		//index번호는 반드시 0부터 시작
		System.out.println(arr3[0]); //10 출력//인덱스 번호는 0번 부터 시작.
		System.out.println(arr3[1]); //20 출력
		System.out.println(arr3[2]); //30 출력
		System.out.println(arr3[3]); //40 출력
		System.out.println(arr3[4]); //50 출력
		System.out.println(arr3[5]); //60 출력
		System.out.println(arr3[6]); //70 출력
		System.out.println(arr3[7]); //80 출력
		System.out.println(arr3[8]); //90 출력
		System.out.println(arr3[9]); //100 출력
		System.out.println(chArr[3]); //d 출력
		
		//배열의 모든 값 출력.
		for (int i = 0; i <= 9; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		
		arr1[0] = 15; //비어있던 inDex자리에 자료가 쓩!
		arr1[2] = 25;
		arr1[4] = 35;
		
		System.out.println(arr1[0] + " " + arr1[2]);
		System.out.println(arr1[1]);
		
		for (int i = 1 ; i <=5; i++)
			System.out.print(arr3[i] + " ");
		
		System.out.println();
		System.out.println("--------------------");
		//규칙이 있는 배열 입력과 출력
//		arr2[0] = 1;
//		arr2[1] = 2;
//		...
//		arr2[9] =10;

		for(int i = 0 ; i <10; i++) {
			arr2[i] = i+1;
			System.out.print(arr2[i]+ " ");
		}	System.out.println();
		
		for(int i = 0 ; i <10; i++) {
			System.out.print(arr2[i]+ " ");			
		}	System.out.println();
			
		//퀴즈!
		//정수형 배열 10개 생성
		//생성한 배열에 random으로 1~100까지 추출하여 값 넣기
		//출력하기
		
		int[ ] arr10 = new int[10];
			for (int i = 0 ; i < 10 ; i++) {
				arr10[i] = (int)(Math.random()*100)+1;
				System.out.print(arr10[i]+ ", ");
			}
		
	}

}
