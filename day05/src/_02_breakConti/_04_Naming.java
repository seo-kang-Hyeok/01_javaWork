package _02_breakConti;

public class _04_Naming {

	public static void main(String[] args) {
		//break로 상위 사이클 빠져나오기. for문에 이름을 지정해서 브레이크에 이름을 적어준다.
		Stop1 : for(int i = 1; i <= 3; i++) {
					for(int j = 1; j <=3; j++) {
						if(i==2)
						break Stop1; //현재 반복문에서 빠져나온다. 완전히 빠져나오고 싶을 때
					System.out.println("i = "+i+", j = "+j);
					}
				System.out.println("안의 for문 종료");
			}
			System.out.println("밖의 for문 종료");
		
			System.out.println(12/3);
	}

}
