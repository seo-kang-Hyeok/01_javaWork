package collection.hashSet02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Member {
	public String name;
	public int age;
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) { //값 비교 =Object obj 싹다!
//	public boolean equals 원래 이렇게 되어있습니다.
		if(obj instanceof Member) { //오브잭트에 있는 값이 
			Member member = (Member)obj;
			return member.name.equals(name) && member.age==age;//obj에 있는 name.이 name과 같은가?
		}
		return false;
	}
	
	@Override
	public int hashCode() { //hashCode = 주소
		return name.hashCode() + age; //hashCode까지 같게 만들어줘야 완전히 같게 만들어진다.
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
}

//원래 == 는 주소가 같은가? 라는뜻.
//toString은 
//==를 오버라이딩 했다. 그래서 값이 같은가? 라는 뜻으로 변환된 것.
public class HashSet4 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 20));
		set.add(new Member("홍길동", 20));
		
		System.out.println("size : " + set.size());
		iteratorPrint(set.iterator());
		System.out.println();
		
	}
	
	static void iteratorPrint(Iterator<Member> i) { //i = set.Iterator()
	while(i.hasNext()) {
		
		Member p = i.next(); // i에 next한 객체를 p로 지정
		System.out.print(p.name + ", ");
		System.out.print(p.age + " ");
		}
		System.out.println();
	}
}
