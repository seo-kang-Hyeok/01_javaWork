package _02_product;

public class Computer extends Product{
	Computer() {
		super(100);
	}
	//최고 조상인 Object클래스
	public String toString() { //toString = 오버라이딩하겠습니다.(앞에 최소 public )
		return "Computer";
	}
}