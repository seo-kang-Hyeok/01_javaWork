package _04_array;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class _05_Array {

	public static void main(String[] args) {
		// 자리바꿈
		int a = 10;
		int b = 35; //자리 바꾸고 싶당
		int tmp = 0; //잠깐 맞겨둘 변수 만들자.
		
		tmp = a;
		a = b;
		b = tmp;
		 
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		//자리바꿈을 하기 위해서는 변수를 하나 만들어 교체한다.

		//로또 1~ 45
		//배열 45개에 1~45까지 값 넣기
		//for
		//index번호 랜덤으로 추출하여 자리바꿈 하기.
		
	
		int[] lotto = new int[45]; //45개의 공간 마련!
		 
		for (int i = 0 ; i <lotto.length; i++) 
			lotto[i] = i + 1 ;			//lotto[]에 1~45까지 입력됨.
		
		for (int i = 0 ; i < 6; i++) { //배열 앞 6개만!
			 int index = (int)(Math.random()*45); //랜덤으로 0~44까지의 값 추출.
			 int temp = lotto[i];	
			 lotto[i] = lotto[index];
			 lotto[index] = temp;
		}
			
		for (int i = 0; i < 6; i++)
			System.out.print(lotto[i] + ", ");
				
		System.out.println();
		System.out.println("--------------------------");
		//중복제거로 6개만 추출
		int lotto2[] = new int[6];
		for(int i =0; i<lotto2.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}	
			}
		for(int i =0; i<lotto2.length; i++) {
			System.out.print(lotto[i] + ", ");
		
		}
	}
}
