package _07_super;
class Parent {
	int x = 10;
}
class Child extends Parent{
	int x = 100;
	void nethod() {
		System.out.println("x=" + x);//지역변수에 있나?x 인스턴스에 있나?x 부모한테 있나? 타고 올라가면서 확인 합니다. 지금은 인스턴스에 있습니다.
		System.out.println("this.x=" + this.x); //this= int.x를 가르킴. this는 무조건 인스턴스를 봅니다. 지역변수에 있어도 x
		System.out.println("super.x=" + super.x);//부모x를 가르킴. super로 적혀 있으면 무조건 부모를 봅니다. 지역변수에 있어도 x 인스턴스에 있어도 x
	}
}
public class SuperTest {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.nethod();
	}
}
