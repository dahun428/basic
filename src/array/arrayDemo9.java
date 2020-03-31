package array;

import java.util.Scanner;

public class arrayDemo9 {

	public static void main(String[] args) {
	
		//숫자 5개를 입력받아서 배열에 저ㅏㅇ
		// 배열의 n번째까지의 합계를 새로운 배열에 저장하고 새 배열의 값을 전부 출력
		
		int[]array = {3,5,11,7,4};
		int[]array1 = new int[array.length];
		
		int sum = 0;		
		for(int i = 0; i < array.length; i++) {
			System.out.println("sum : " + sum);
			sum += array[i];
			array1[i] = sum;
		}
		for(int i : array1) {
			System.out.println(i);
		}
	}
	

}
