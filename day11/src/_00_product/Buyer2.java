package _00_product;

import java.util.ArrayList;

public class Buyer2 {  //배열대신ArrayList써보기
	int money = 200;
	int bonusPoint;
	ArrayList<Object> item = new ArrayList<Object>(); //객체가 들어와야해.Object를 넣으면 모든 종류의 객체를 넣을 수 있습니다.
	int i; //Object 모든 타입의 조상. 
	
	void buy(Product p) { 
		if(money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint; 
		item.add(p); //ArrayyList에 삽입.메서드
		System.out.println(p + "를 구입하였습니다."); 
	}
	//반품
	void refund(Product p) {
		if(item.remove(p)) { //remove //삭제 메서드.
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "를 반품하였습니다.");
		} else {
			System.out.println("구입한 물품 중 해당 제품이 없습니다");
		}
	}
	void summary() {
		int sum = 0;
		String itemList = "";
		if(item.isEmpty()) {
			System.out.println("구입한 물품이 없습니다.");
			return;
		}
		
		for(int i =0; i<item.size(); i++) { //size = arrayList의 길이
			// ArrayList의 index번호의 객체를 얻어올때 get(index)메서드 사용
			Product p = (Product)item.get(i); //형변환
			sum += p.price;
			itemList += p + ", "; 
		}

		System.out.println("총 구입금액 : " + sum);
		System.out.println("구입 물품들 : " + itemList);
	}
}		