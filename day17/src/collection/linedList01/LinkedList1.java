package collection.linedList01;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>(); //기본자료형x 객체사용.기본자료형을 객체형으로 사용가능하게 만든 클래스를 이용한다.Integer
		//LinkedList<Integer> list = new LinkedLis ();
		//<> 모든 객체가 들어올 수 있습니다. 내가 만든것도 가능. <>한곳만 써도 되긴하지만 정석은 앞뒤에 넣어줍니다.
		//기본적으로 toString 가 오버라이디 되어있습니다.
		
		//추가
		list.add(new Integer(99));  //권장 x
		list.add(Integer.valueOf(99)); //앞뒤의 주소를 가지고 있습니다.
		list.add(8);
		list.add(20);
		list.add(3);
		
		for(int i : list) System.out.print(i + " ");
		System.out.println();
		
		//삭제 
		list.remove(1); //index번호에 해당하는 노드(객체)삭제  - 1번 index삭제
		for(int i : list) System.out.print(i + " ");
		System.out.println();
		
		list.remove(); //가장 앞에 노드 삭제
		for(int i : list) System.out.print(i + " ");
		System.out.println();
		
		list.removeFirst(); //가장 앞에 노드 삭제 위와 동일
		list.removeLast(); //맨 끝 삭제
		for(int i : list) System.out.print(i + " ");
		System.out.println();
		
		//막간 공부 toString
		LinkedList<Student> stuList = new   LinkedList<Student>();
		stuList.add(new Student("홍길동",23));
		stuList.add(new Student("아무개",23));
		
		for(Student i : stuList) System.out.print(i+ " ");
		System.out.println();
		
	}

}
