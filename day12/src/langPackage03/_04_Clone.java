package langPackage03;

import java.util.Arrays;

public class _04_Clone {

	public static void main(String[] args) {
		Card card1 = new Card("CLOVER", 3);
		Card card2 = (Card)card1.clone();//오브잭트 타입으로 리턴됨.,

		
		System.out.println(card1);
		System.out.println(card2);
		
		int[] arr = {1, 2, 3, 4, 5};
		
		int[] arrClone = arr.clone();
		arrClone[0] = 6;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
		
		//객체 생성시 뒤에 getClass()를 호출하면 클래스 이름을 호출.
		Card card3 = new Card("doamond", 8);
		Class cObj = new Card().getClass();
		System.out.println(cObj);//패키징 이름.클래스 이름.
		System.out.println(cObj.getName());//클래스 이름.
		System.out.println(cObj.toString());//패키징 이름.클래스 이름.
	}
}