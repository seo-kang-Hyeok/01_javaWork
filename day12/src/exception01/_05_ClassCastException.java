package exception01;
class Animal{};
class Dog extends Animal{};
class Cat extends Animal{};
public class _05_ClassCastException {
	public static void main(String[] args) {
		try {
			Dog dog = new Dog();//자식 클래스 생성
			Animal ani = dog; 	//자동 형변환 자식 ->부모
			Dog dog1 =(Dog)ani; //강제 형변환 부모 ->자식
			System.out.println("Dog타입으로 변경");
			
			Animal ani2 = new Animal();//부모 클래스 생성
			Cat cat = (Cat)ani2;	   //강제 형변환 부모 ->자식
			System.out.println("Cat타입으로 변경");
		} catch(ClassCastException e)	{
			System.out.println("클래스 타입 변경 불가");
		}
	}
}