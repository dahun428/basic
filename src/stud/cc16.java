package stud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class cc16 {

	public static void main(String[] args) {
		

		String number = "1231234";
		int k = 3;
		int t = number.length() - k;
		char[] result = new char[t];
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0; i < number.length(); i++) {
			char c = number.charAt(i);
			System.out.println(c);
			//peek --> 가장 최근에 보관한 값 단순참조. 꺼내지 않음
			while(!stack.isEmpty() && stack.peek() < c && k-- > 0) {
				stack.pop();
			}
			stack.push(c);
		}
		for(int i = 0 ; i < result.length; i++) {
			result[i] = stack.get(i);
			System.out.println(result[i]);
		}
		
		
		
//		public String solution(String number, int k) {
//	        char[] result = new char[number.length() - k];
//	        Stack<Character> stack = new Stack<>();
//
//	        for (int i=0; i<number.length(); i++) {
//	            char c = number.charAt(i);
//	            while (!stack.isEmpty() && stack.peek() < c && k-- > 0) {
//	                stack.pop();
//	            }
//	            stack.push(c);
//	        }
//	        for (int i=0; i<result.length; i++) {
//	            result[i] = stack.get(i);
//	        }
//	        return new String(result);
//	        
//		
		
		}
	

}
