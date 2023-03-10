package _01_Iflse;

public class _07_Ex {

	public static void main(String[] args) {

		int month = 8;
		int tem = 42;
		
		if(month >= 3 && month <=5)
			System.out.println("봄입니다");
		else if (month >=6 && month <=8) {
			System.out.println("여름입니다"); //35도 이상이면 폭염주의, 40도이상 이면 폭염경보
			if(tem >= 35) // 35~
				System.out.println("폭염경보");
			else if (tem >= 40)
				System.out.println("폭염주의보");
		}else if(month>=9 && month <=11)
			System.out.println("가을입니다");
		else if (month == 1 || month == 2 || month ==12 ) {
			System.out.println("겨울입니다"); // - 10도 이하이면 한파주의보, -20도 이하이면 폭염 경보
			if(tem <= -20)
				System.out.println("한파경보");
			else if(tem<= -10)
				System.out.println("한파주의보");
		} else
			System.out.println("1~12달만 존재합니다 다시 넣으세요");
		}
	}


