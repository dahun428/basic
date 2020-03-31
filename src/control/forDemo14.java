package control;

import java.util.Scanner;

public class forDemo14 {

	public static void main(String[] args) {

		int sum = 0;
		
		for(int i = 1; i <= 20; i++) {
			
			int b = (i % 2 != 0 && i % 3 !=0) ? sum+=i : 0;
			
//			if(i % 2 != 0 && i % 3 !=0) {
//				sum += i;
//			}

		}
		System.out.println("sum : "+ sum);
		
		sum = 0;
		
		for(int i = 1 ; i <= 10; i++) {
			for(int j = 1; j <=i; j++) {
				sum += j;
			}
		}
		System.out.println("sum : " + sum);
	
		
		sum = 0;
		int num =1;
		int count = 0;
		
		while(true) {
			count++;
		
			if(num % 2 == 0) {
				sum += num *-1;
			}else {
				sum += num;
			}
			if(sum >= 100) {
				break;
			}
			num++;
		}
		System.out.println("count : " + count);
		System.out.println("sum : " + sum);
		
	}	

}
