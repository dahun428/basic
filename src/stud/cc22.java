package stud;

import java.util.ArrayList;
import java.util.Arrays;

public class cc22 {

		public static void main(String[] args) {
		
			int[] arr = {5, 9, 7, 10};
			int divisor = 5;
			int[] answer = {};
			int count = 0;
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] % divisor == 0) {
					list.add(arr[i]);
					count++;
				}
			}
			if(count == 0) {
				list.add(-1);
			}
			System.out.println("listsize : "+list.size());
			answer = new int[list.size()];
			
			System.out.println(list);
			for(int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i);
			}
			Arrays.sort(answer);
			for(int i = 0; i < answer.length; i++) {
				System.out.println(answer[i]);
			}
			
		}
	}
	
