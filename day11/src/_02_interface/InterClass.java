package _02_interface;

public class InterClass implements Interface{

	@Override
	public void methodA() {
		System.out.println("interfaceB-methodA()실행");
	}

	@Override
	public void methodA1() {
		System.out.println("interfaceB-methodA1()실행");
	}

	@Override
	public void methodB() {
		System.out.println("interfaceB-methodB()실행");
	}

	@Override
	public void methodB1() {
		System.out.println("interfaceB-methodB1()실행");		
	}

	@Override
	public void method() {
		System.out.println("interfaceB-method()실행");		
	}

}
