package _02_product;

public class ProductTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Computer()); //모든 객체를 넣을 수 있다.
		b.buy(new Game());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Game());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Game());
		b.buy(new Audio());
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈 : " + b.money);
		System.out.println("보너스 점수 : " + b.bonusPoint);
	
	}

}
