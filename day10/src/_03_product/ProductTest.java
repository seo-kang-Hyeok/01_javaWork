package _03_product;

public class ProductTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Computer()); //모든 객체를 넣을 수 있다.
		b.buy(new Game());		//product를 상속 받아 생성된 모든 것이 들어 올 수 있다.
		b.buy(new Computer());		//생성된 tv 삽입
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Game());
		b.buy(new Tv());

		
		System.out.println("현재 남은 돈 : " + b.money);
		System.out.println("보너스 점수 : " + b.bonusPoint);
		b.summary();
		
		Product p = new Product(9); 	//부모만					
		Product p1 = new Computer(); 	//자식이 부모꺼만
		Product p3 = new Tv();			//Product 자식 전부 가능	각각의 주소에 저장됨.
		
	
	}

}
