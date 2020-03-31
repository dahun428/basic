package stud;

import java.util.ArrayList;
import java.util.Arrays;

public class cc {

	public static void main(String[] args) {
		
		
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer = {};
		int value = 0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		for(int[] command : commands) {
			int firstNum = command[0] - 1;
			int secondNum = command[1] - 1;
			int position = command[2] - 1;
			int length = secondNum - firstNum +1;
			
			int[] dest = new int[length];
		
			System.arraycopy(array, firstNum, dest, 0, length);
			Arrays.sort(dest);
			
			value = dest[position];
			
			list.add(value);
		}
		answer = new int[list.size()];
		int size = 0;
		for(int i : list) {
			answer[size++] = i;
		}
				
	}

}
