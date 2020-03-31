package stud;

import java.util.ArrayList;


public class cc14 {

	public static void main(String[] args) {
	
		int[] arr= {1,1,1,1,1,3,3,3,0,0,0,1,1,1,1,5,5};
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<Integer>();
		int next = 0;
		for(int i : arr) {
			int prev = i;
			if(next != prev) {
				list.add(prev);
			}
			next = prev;
		}
		
		answer = new int[list.size()];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
			System.out.println(answer[i]);
		}
		
	}
	

}
