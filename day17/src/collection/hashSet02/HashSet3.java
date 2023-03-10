package collection.hashSet02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Person {
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + "]";
	}
}
public class HashSet3 {
	public static void main(String[] args) {
		Set<Person> set = new HashSet<Person>();
		
		set.add(new Person("홍길동", 20));
		set.add(new Person("아무개", 20));
		
		System.out.println("size : " + set.size());
		iteratorPrint(set.iterator());
		System.out.println();
		
	}
	
	static void iteratorPrint(Iterator<Person> i) { //i = set.Iterator()
	while(i.hasNext()) {
		/*
		System.out.print(i.next() + " "); //패키지명,클래스명@주소(toString을 오버라이딩 하지 않았을 때.)
											//toString을 오버라이딩 했을 때. 
		*/
//		System.out.print(i.next().name + ", "); //아무개
//		System.out.print(i.next().age + " ");  //"홍길동", 20
//		이렇게 출력하면 원하는 값이 나오지 않습니다. i에 next를 2번 했기 때문에 아무개. 20 이런식으로 순서가 바뀌게 됩니다.
		
		Person p = i.next(); // i에 next한 객체를 p로 지정
		System.out.print(p.name + ", ");
		System.out.print(p.age + " ");
//		이렇게 출력하면 i에 next를 한 값은  p로 지정 해놨기 때문에 고정된 좌표의 값이 출력 됩니다.
		}
		System.out.println();
	}
}
