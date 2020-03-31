package array;

import java.util.Scanner;

public class arrayDemo6 {

	public static void main(String[] args) {
	
		//숫자를 5번 입력받아서 입력받은 숫자를 총합을 계산하기
		
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		int total = 0;
		
//		for(int i = 0; i < array.length; i++) {
//			System.out.print("숫자를 입력하세요 : ");
//			array[i] = sc.nextInt();	
//			total += array[i];
//		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.print("숫자를 입력하세요 : ");
			int temp = sc.nextInt();
			array[i] = temp;
		}
		for(int i : array) {
			total += i;
		}
		System.out.println("총합 : " + total);
		
		
	}
	

}
