package _03_inheritance; //static가 붙어있으면 조금 달라요!
class D{
	static int i;
	static int J;
}

class E extends D { 
	static String i;
}

public class InheritanceTest4 {
	public static void main(String[] args) {
		D.i = 100;			//static는 객체생성하지 않기 때문에 맟춰서 생성하지 X
		E.i = "KH정보 교육원";
		D.J = 500;
	
	}
}

