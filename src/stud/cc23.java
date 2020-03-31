package stud;

import java.util.ArrayList;
import java.util.Arrays;

public class cc23 {

		public int[] divisible(int[] array, int divisor) {
			
			return Arrays.stream(array).filter(factor -> factor % divisor ==0).toArray();
		}
	
	
		public static void main(String[] args) {
		
			cc23 div = new cc23();
			int[] array = {5,9,7,10};
			int divisor = 5;
			System.out.println(Arrays.toString(div.divisible(array, divisor)));
		}
	}
	
