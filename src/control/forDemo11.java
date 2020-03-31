package control;

import java.util.Scanner;

public class forDemo11 {

	public static void main(String[] args) {

		int sum = 0;
		int num = 1;
		
		while(true) {
			sum += num;
			if(sum >= 500) {
				break;
			}
			num++;
		}
		System.out.println("합계 : " + sum + "숫자 : " + num);
		
	}

}
