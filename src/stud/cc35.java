package stud;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

public class cc35 {
	
	public static void main(String[] args) {
		
		Stream<String[]> strArrStrm = Stream.of(
				new String[] {"abc","def","jsl"},
				new String[] {"ABC","GHI","JLK"}
		);
		
		Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);
		strStrm.map(String::toLowerCase)
			.distinct()
			.sorted()
			.forEach(System.out::println);
		System.out.println();
		
		String[] lineArr = {
			"Believe or not It is true",
			"Do or do not There is no try"
		};
		
		Stream<String> lineStream = Arrays.stream(lineArr);
		lineStream.flatMap(line -> Stream.of(line.split(" +")))
			.map(String::toUpperCase)
			.distinct()
			.sorted()
			.forEach(System.out::println);
		System.out.println();
	}
	
}