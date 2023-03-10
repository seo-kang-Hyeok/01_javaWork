package _00_product;

public class Buyer {//지금까지 구입한 물건 목록보기
	int money = 1000;
	int bonusPoint = 0;
	Product[] cart = new Product[20]; //객체로 만들땐 공간을 넉넉하게 해주는게 좋아요.
	int i; //클래스 바로 밑에 있어서 인스턴스 변수다. 기본값 0
	
	//product를 상속 받아 생성된 모든 것이 들어 올 수 있다.
	void buy(Product p) { // Product p에 들어 올 수 있는건 모두 삽입 가능해. 프로덕트 주소가능.
		if(money < p.price) { //200번지의 price computer면 200
			System.out.println("카드의 한도가 초과되었습니다.");
			return;
		}
		money -= p.price; //money가 작지않으면 진행 price에 저장되 값을 뺀다.
		bonusPoint += p.bonusPoint; //p에 있는 보너스 포인트를 더한다.
		cart[i++] = p;
		System.out.println(p + "를 구입하였습니다."); //p는 오버라이딩한 컴퓨터 출력.
	}
	void summary() {
		int sum = 0;
		String itemList = "";
		// 보편적인 for문.
		for(int i=0; i<cart.length; i++) {
			if(cart[i] == null) //배열 값이 비어있으면 break.
				break;
			sum += cart[i].price; //sum에 i번째에 입력된 주소에 price를 더합니다.
			itemList += cart[i] + ", "; //ite
		}
		
		//향상된 for문을 사용하여 작성하는 방법.
//		for(Product i : cart) {//향상된 for문 cart를 Product i 에 넣는다. 끝까지.
//		if(i== null)	
//			break;
//		sum += i.price;
//			itemList += i + ", ";
//		}
		System.out.println("총 구입금액 : " + sum);
		System.out.println("구입 물품들 : " + itemList);
	}
}		
	

//	void buy(Product p	= new Product()) { //Product p 받고자 하는 매개변수
//						= new Audio()
//						= new Computer()
//						= new Game()
//						= new Tv()