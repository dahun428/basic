package stud;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class cc31 {
	
	public static void main(String[] args) {

//		Stream emptyStream = Stream.empty();
//		long count = emptyStream.count();
//		System.out.println(count);
	
//		Stream<T> distinct()//중복을제거
//		Strean<T> filter(Predicate<T> predicate) //조건에 안맞는 요소 제외
//		Stream<T> limit(long maxsize)//스트림의 일부를 잘라낸다.
		
		IntStream intStream = IntStream.of(1,2,2,3,3,4,5,5,6);
		intStream.distinct().forEach(System.out::print);
	}
		
}
	
