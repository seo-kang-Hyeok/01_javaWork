package _02_product;

public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
		
	void buy (Product p) { //Product 가 들어 간다는게 중요 합니다.
		if(money < p.price) {
			System.out.println("카드의 한도가 초과되었습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "를 구입하였습니다.");
		
	}
}		
	

//	void buy(Product p	= new Product()) { //Product p 받고자 하는 매개변수
//						= new Audio()
//						= new Computer()
//						= new Game()
//						= new Tv()