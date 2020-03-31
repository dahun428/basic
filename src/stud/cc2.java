package stud;

import java.util.ArrayList;
import java.util.Arrays;

public class cc2 {

	public static void main(String[] args) {
		
		
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		for(int i = 0; i <commands.length; i++) {
			int[] answer = new int[commands.length];
			int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]-1);
			Arrays.sort(temp);
			answer[i] = temp[commands[i][2]-1];
			System.out.println(answer[i]);
		}
		
		
				
	}

}
