package stud;

import java.util.function.Predicate;

public class cc26 {

	
	public static void main(String[] args) {
		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = i -> i%2 == 0;
		Predicate<Integer> notP = p.negate();
		
		// 100 <= i && (i < 200 || i%2 ==0)
		Predicate<Integer> all = notP.and(q.or(r));
		System.out.println(all.test(150));
		all = notP.and(i -> i <200).or(i -> i%2 ==0 );
	}
		
}
	
