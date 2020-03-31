package control;

import java.util.Scanner;

public class forDemo10 {

	public static void main(String[] args) {

		for(int i = 1; i <= 9; i++) {
			if(i <= 5) {
				for(int j = 1; j <= 5-i; j++) {
					System.out.print(" ");
				}
				for(int k = 1; k <= i*2; k++) {
					System.out.print("*");		
				}
			}else if(i > 5){
				for(int j = 1; j <= (5-i)*(-1); j++) {
					System.out.print(" ");
				}
				for(int k = 1; k <= (10-i)*2; k++) {
					System.out.print("*");		
				}
			}
			
			System.out.println();
			
		}
		
	}

}
