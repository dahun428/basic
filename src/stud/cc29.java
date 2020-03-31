package stud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class cc29 {
	
	public static void main(String[] args) {

		Function<String, Integer> f = (String s) -> Integer.parseInt(s);
		Function<String, Integer> f1 = Integer::parseInt;
		//하나의 매서드만 호출하는 람다식은
		//클래스이름::매서드이름 또는 참조변수::매서드이름으로 바꿀 수 있다.
		
		
		Function<Integer, int[]> f3 = int[]::new;
		
	}
		
}
	
