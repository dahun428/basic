package control;

import java.util.Scanner;

public class forDemo9 {

	public static void main(String[] args) {

		
//		for(int i = 1; i <= 5; i++) {
//			System.out.println("*");
//			for(int j = 1; j <= i*2; j++) {
//				System.out.print("*");
//			}
//		}
//		System.out.println();
//		
//		for(int i = 1; i <= 5 ; i++) {
//			
//		
//			for(int j = 1; j <= 10-i*2; j++) {
//				System.out.print("-");
//			}
//			for(int k = 1; k <= i*2; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		for(int i = 1; i <= 5 ; i++) {
			
			
			for(int j = 1; j <= 5-i; j++) {
				System.out.print("-");
			}
			for(int k = 1; k <= i*2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
