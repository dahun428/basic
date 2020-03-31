package stud;

import java.util.Arrays;
import java.util.stream.IntStream;

public class cc32 {
	
	public static void main(String[] args) {
		int[] arr= {1,1,3,3,0,1,1}; 

		int[] answer = {};
        //int[] arr를 stream으로 바꾸기
        IntStream intStream = Arrays.stream(arr);
        answer = intStream.distinct().toArray();
        System.out.println(answer.length);
        for(int i : answer) {
        	System.out.println(i);
        }
	}
		
}
	
