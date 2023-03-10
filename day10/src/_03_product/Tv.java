package _03_product;

public class Tv extends Product{
	Tv() {
		super(200);
	}
	//최고 조상인 Object클래스
	public String toString() { //toString = 오버라이딩하겠습니다.(앞에 최소 public )
		return "Tv";
	}
}