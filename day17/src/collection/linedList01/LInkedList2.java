package collection.linedList01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList2 {
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList(2000000);
		LinkedList l = new LinkedList();
		System.out.println("순차적으로 추가할 떄 걸린시간.");
		System.out.println("ArrayList  : " + add(a));
		System.out.println("LinkedList  : " + add(l));
	}

	static long add(List list) {
		long start = System.currentTimeMillis();
		for(int i=0 ; i <10000000; i++) {
			list.add(i+" ");
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
	
	static long addM(List list) {
		long start = System.currentTimeMillis();
		for(int i=0 ; i <10000000; i++) { 
			list.add(5000, "m"); //5000번에 m을 계속 넣으세요! 4999번 자료가 99999999번 밀리나?
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
}	
