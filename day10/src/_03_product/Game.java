package _03_product;

public class Game extends Product{
	Game() {
		super(50);
	}
	//최고 조상인 Object클래스
	public String toString() { //toString = 오버라이딩하겠습니다.(앞에 최소 public )
		return "Game";
	}
}