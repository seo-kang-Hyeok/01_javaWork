package collection.hashSet02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class A {
	String aa;
	public A(String aa) {
		this.aa = aa;
	}
}
public class HashSet01 {
	public static void main(String[] args) {
		HashSet set1 = new HashSet();
		Set set2 = new HashSet();
		
		A a1 = new A("c"); 
		set1.add(new A("a"));//add = 주어진 객체를 가장 끝에 추가.
		set1.add(new A("b"));
		set1.add(a1);
		set1.add(new A("d"));
		set1.add(new A("e"));
		
		System.out.println("size : " + set1.size()); //5 
		//size 저장되어 있는 전체 객체수를 리턴
		Iterator<A> iterator = set1.iterator(); //객체 5개를 넣음
		//hasNext() : 남아있는 객체가 있나? true, false
		//next() : 순회하면서 값 얻어오기
		
		System.out.print("set1 출력 :");
		while(iterator.hasNext()) {
			A a2 = iterator.next();
			System.out.print(a2.aa + " ");
		}
		System.out.println(); //인덱스가 없어서 인덱스를 지정해서 삭제하거나 지정해서 불러오는게 불가능 하다.
		
		set1.remove(a1);
		System.out.print("set1 삭제 후 출력 : ");
		iteratorPrint(set1.iterator()); 
		System.out.println();

		set1.add(new A("e"));
		System.out.println("size : " + set1.size());
		System.out.println("set1에 e 입력 후 출력 : ");
		iteratorPrint(set1.iterator());
		System.out.println();
	
		set1.add(a1);
		System.out.println("size : " + set1.size());
		set1.add(a1);
		System.out.println("size : " + set1.size());
		System.out.print("set1에 a1을 2번 입력 후 출력 : ");
		iteratorPrint(set1.iterator());
		System.out.println();
	} //new 하고 만들면 주소가 다르고 객체가 느른객체로 인식. 
	
	static void iteratorPrint(Iterator<A> i) { //반복되는 출력 메서드로 만들어버리자.
	while(i.hasNext()) {
		A a2 = i.next();
		System.out.print(a2.aa + " ");
		}
		System.out.println();
	}

}