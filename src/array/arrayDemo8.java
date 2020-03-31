package array;

import java.util.Scanner;

public class arrayDemo8 {

	public static void main(String[] args) {
	
		//숫자 10개 입력받아서 그 중에 짝수의 합계만 구해서 출력하기
		
		Scanner sc = new Scanner(System.in);
//		int[] num = new int[10];
//		
//		for(int i = 0; i < num.length; i++) {
//			System.out.print("숫자를 입력해주세요 : ");
//			int input = sc.nextInt();
//			num[i] = input;			
//		}
//		int total = 0;
//		
//		for(int i : num) {
//			if(i % 2 ==0) {
//				System.out.println("짝수 숫자 : " + i);
//				total += i;
//			}
//		}
//		System.out.println("총합 : " + total);
//		
		int[] array = new int[4];
		int prev = 0;
		int next = 0;
		int gap = 0;
		int input = 0;
		
		for(int i = 0 ; i < array.length; i++) {
			System.out.print("숫자를 입력해주세요 : " );
			input = sc.nextInt();
			array[i] = input;
		}
		
		for(int i = 0; i < array.length - 1; i++) {
			int tempPrev = array[i];
			int tempNext = array[i+1];
			int currentGap = Math.abs(tempPrev - tempNext);
			
			if( currentGap > gap) {
				prev = tempPrev;
				next = tempNext;
				gap = currentGap;
			}
		}
		
		System.out.println("숫자 1 : " + prev + "  숫자 2 : " + next + " 갭 : " + gap);
		
		
		
		
		
	}
	

}
