package _03_inheritance;
class AA {
	int i, j;
	void setIJ(int x, int y) { //setIJ = IJ에 무언가를 넣어주겠구나! 그럴때 많이 사용하는 변수명 입니다.
		i = x;
		j = y;
	}
	int getI() {				//getI = I에 무언가를 얻어오겠구나! 라고 보통 만듭니다.
		return i;
	}
}
class BB extends AA { //A상속 받을께요.
	int total;
	int sum() {
		total = i+j;
		return total;
	}
}
public class InheritanceTest2 {
	public static void main(String[] args) {
		BB b1 = new BB();
		b1.setIJ(30, 70);
		System.out.println(b1.sum());
	
	}
}

