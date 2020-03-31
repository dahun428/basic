package stud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class cc30 {
	
	public static void main(String[] args) {

//		String[] arr = {"aaa", "ddd", "ccc"};
//		List<String> strList = Arrays.asList(arr);
//		
//		Stream<String> strStream1 = strList.stream();
//		Stream<String> strStream2 = Arrays.stream(arr);
//		
//		strStream1.sorted().forEach(System.out::println);
//		strStream2.sorted().forEach(System.out::println);
//		
//		
//		List<String> sortedList = strStream1.sorted().collect(Collectors.toList());
//		
//		List<Integer> list = Arrays.asList(1,2,3,4,5);
//		System.out.println(list);
//		Stream<Integer> intStream = list.stream();
//		intStream.forEach(System.out::println);
		
//		Stream<String> strStream = Stream.of("a","b","c");
//		strStream.forEach(System.out::println);
//		Stream<String> strStream1 = Stream.of(new String[] {"a","b","c"});
//		Stream<String> strStream2 = Arrays.stream(new String[] {"a","b","c"});
//		Stream<String> strStream3 = Arrays.stream(new String[] {"a","b","c"}, 0,3);
//		
//		IntStream intStream = new Random().ints();
//		intStream.limit(5).forEach(System.out::println);
//		
//		IntStream intStream = IntStream.range(1, 5); // 1,2,3,4
//		IntStream intStream1 = IntStream.rangeClosed(1, 5); //1,2,3,4,5
//		
		String[] arr = {"dd","aaa","CC","cc","b"};
		Stream<String> stream = Stream.of(arr);
		Stream<String> filteredStream = stream.filter(null);
		Stream<String> distinctedStream = stream.distinct();
		Stream<String> sortedStream = stream.sorted();
		Stream<String> limitedStream = stream.limit(5);
		
	}
		
}
	
