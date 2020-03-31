package oop3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReturnDemo {
	public static void main(String[] args) {
		int[] nums = {1,3,6,9,4,6,8};
		
		int[] arr1 = multipleArray(nums, 7);
		System.out.println("arr1 : " + Arrays.toString(arr1));
		
		int[] arr2 = multpleStream(nums, 7);
		System.out.println("arr2 : " + Arrays.toString(arr2));
	}
	
	//전달 받은 배열의 값을 n 배로 만들어서 반환하는 메소드
	static int[] multipleArray(int[] src, int num){
		
		int[] result = new int[src.length];
		for(int i = 0; i <src.length; i++) {
			result[i] = src[i]*num;
		}
		
		return result;
	}
	static int[] multpleStream(int[] src, int num) {
		
		int[] result = new int[src.length];
		IntStream intStream = Arrays.stream(src);
		result = intStream.map(s -> s*num).toArray();
		
		return result;
	}
	
}
