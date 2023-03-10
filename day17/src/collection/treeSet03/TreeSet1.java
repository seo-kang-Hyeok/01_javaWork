package collection.treeSet03;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet<Integer>  scores = new TreeSet<Integer>();
		scores.add(Integer.valueOf(89));
		scores.add(89);
		scores.add(100);
		scores.add(45);
		scores.add(91);
		scores.add(75);

		System.out.println("가장 낮은 점수 : " + scores.first()); //45
		System.out.println("가장 높은 점수 : " + scores.last()); //100
		
		System.out.println("91점 바로 아래 점수 : " + scores.lower(91)); //89
		System.out.println("91점 바로 위에 점수 : " + scores.higher(91)); //100
		
		System.out.println("89점과 같거나 바로 아래 점수 : " + scores.floor(89));  //89
		System.out.println("90점과 같거나 바로 아래 점수 : " + scores.floor(90)); //89
		
		System.out.println("89점과 같거나 바로 위의 점수 : " + scores.ceiling(89)); //89
		System.out.println("90점과 같거나 바로 위의 점수 : " + scores.ceiling(90)); //89
		
		
		
	}

}
