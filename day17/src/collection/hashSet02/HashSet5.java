package collection.hashSet02;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class HashSet5 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		while(set.size() <6 ){
			set.add((int)(Math.random()*45)+1);
		}
		
		List list = new LinkedList(set);
		Collections.sort(list);
		System.out.println(list);

		//방법 2
		HashSet<Integer> set2 = new HashSet<Integer>();
		for(int i =0 ; set2.size() < 6; i++) {
			set2.add((int)(Math.random()*45)+1);
		}
		List list2 = new LinkedList(set2);
		Collections.sort(list2);
		System.out.println(list2);
		
		
		
/*		
		Object[] arr = {1,4,6,7,3,2,8,9,3,4,5,6,7}; //13개
		Set set = new HashSet();
		for(Object i : arr)
			set.add(i);
	*/	
			
	}
}
