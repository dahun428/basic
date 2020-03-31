package oop11_abastract;

import java.util.Arrays;

public class LottoDemo {
	
	public static void main(String[] args) {
		Lotto lo = new Lotto();
		
		for(int i = 0; i <=5; i++) {
			int[] numbers1 = lo.generateNumbers();
			System.out.println(Arrays.toString(numbers1));
		}
		
	}
	
	
}
