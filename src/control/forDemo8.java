package control;

import java.util.Scanner;

public class forDemo8 {

	public static void main(String[] args) {

		
		for(int i = 1; i <= 9; i++) {
			
			for(int j = 2; j <= 9; j++) {
				
				System.out.print("\t");
				System.out.print(j+" * " + i +" = " + i*j);
			}
			System.out.println();
		}
		
		
	}

}
