package _00_product;

public class Audio extends Product{
	Audio() {
		super(50);
	}
	//최고 조상인 Object클래스
	public String toString() { //toString = 오버라이딩하겠습니다.(앞에 최소 public )
		return "Audio";
	}
}