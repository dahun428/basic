package array;

import java.util.Scanner;

public class arrayDemo7 {

	public static void main(String[] args) {
	
		//5개의 정수를 입력받아서 그중에 가장 큰값을 출력하시오
		
		Scanner sc = new Scanner(System.in);
		
		int[]array = new int[5];
		int max = 0;
		int min = 0;
		int temp = 0;
		
		for(int i = 0; i < array.length; i++) {
			System.out.print("숫자를 입력하세요 : ");
			temp = sc.nextInt();
			array[i] = temp;	
		}
		
		max = array[0];
		min = array[0];
		
		for(int i : array) {
			if(i > max) {
				max = i;
			}
			if(i < min) {
				min = i;
			}
		}
		
		
		System.out.println("가장 큰 값은 " + max +" 입니다.");
		System.out.println("가장 작은 값은 " + min +" 입니다.");
		
	}
	

}
