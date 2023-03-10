package _00_product;

public class ProductTest {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		Computer com = new Computer();
		Tv tv =new Tv();
		Audio audio = new Audio();
		Game game = new Game();
		
		b.buy(com); 
		b.buy(tv);
		b.buy(audio);
		System.out.println();
		
		b.refund(audio);
		b.summary();
		System.out.println();
		
		b.buy(game);
		b.buy(com);
		b.buy(com);

		
		System.out.println("현재 남은 돈 : " + b.money);
		System.out.println("보너스 점수 : " + b.bonusPoint);
		b.summary();
		
		Product p = new Product(9); 	//부모만					
		Product p1 = new Computer(); 	//자식이 부모꺼만
		Product p3 = new Tv();			//Product 자식 전부 가능	각각의 주소에 저장됨.
		
	
	}

}
