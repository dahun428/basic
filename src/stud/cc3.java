package stud;

import java.util.Set;
import java.util.TreeSet;

public class cc3 {

	public static void main(String[] args) {
		
//		TreeSet set = new TreeSet();
//		
//		String from = "b";
//		String to = "d";
//		
//		set.add("abc");
//		set.add("alien");
//		set.add("bat");
//		set.add("car");
//		set.add("Car");
//		set.add("disc");
//		set.add("dance");
//		set.add("dZZZZ");
//		set.add("dzzzz");
//		set.add("elephant");
//		set.add("elevator");
//		set.add("fan");
//		set.add("flower");
//		
//		System.out.println(set);
//		System.out.println("range search : from " + from + " to " + to);
//		System.out.println("result 1 : " + set.subSet(from, to));
//		System.out.println("result 2 : " + set.subSet(from, to + "zzz"));
//		System.out.println("set.last : " + set.last());
//		System.out.println("set.first : " + set.first());
		
		TreeSet set = new TreeSet();
		int[] scores = {80,95,50,35,45,65,10,100};
		
		for(int i : scores) {
			set.add(i);
		}
		System.out.println("50보다 작은 값 : " + set.headSet(new Integer(50)));
		System.out.println("50보다 큰 값 : " + set.tailSet(new Integer(50)));
		
		
	}

}
