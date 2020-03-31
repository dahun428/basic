package array;

import java.util.Arrays;

public class arrayDemo12 {

	public static void main(String[] args) {

		int[] nums = {10,29,1,5,23,75,31};
		Arrays.sort(nums);
		
		String text = Arrays.toString(nums);
		System.out.println(text);
		
		String[] names = {"이순신","김유신","강감찬","류관순","안중근"};
		Arrays.parallelSort(names);
		System.out.println(Arrays.toString(names));
		
		
		//배열을 복사하기
//		Arrays.copyOf(원본배열, 복사할 값의 개수);
//		Arrays.copyOfRange(원본배열, 복사시작위치, 복사 끝 위치);
		
		nums = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		int[]arr1 = Arrays.copyOf(nums, 10);
		int[]arr2 = Arrays.copyOf(nums, 5);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		int[]arr3 = Arrays.copyOfRange(nums, 0, 3);
		int[]arr4 = Arrays.copyOfRange(nums, 4, 7);
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
	}
	

}
