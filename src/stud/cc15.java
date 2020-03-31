package stud;

import java.util.ArrayList;
import java.util.Collections;

public class cc15 {

	public static void main(String[] args) {
		

		String number = "1231234";
		System.out.println("length : " + number.length());
		//[1][2][3][1][2][3][4]
		String[] num = new String [number.length()];

		int k = 3;
		int t = number.length() - k ; 
		
		num = number.split("");
		
		String sum = "";
		
		
//		for(int i = 0; i < t; i++) {
//			sum += num[i];
//		}
//		System.out.println(sum);
//		
		String number2 = "231234";
		
		for(int i = 0; i < t; i++) {
			System.out.println("substring[e] : " + number.substring(i,i+t));
		}
//		
//		System.out.println("substring : "+number.substring(0,5));
//		System.out.println("substring : "+number.substring(1,6));
//		System.out.println("substring : "+number.substring(2,7));
//		
		
		
		
//		System.out.println("substring : "+number.substring(4));
//		System.out.println("substring : "+number.substring(5));
//		System.out.println("substring : "+number.substring(6));
		
		
//		for(int i = 0; i < num.length; i++) {
//			
//			for(int j = 0; j < 4; j++) {
//				System.out.println(num[i+j]);
//			}
//			
//			System.out.println(	num[0+0]+num[0+1]+num[0+2]+num[0+3]);
//			System.out.println(	num[1+0]+num[1+1]+num[1+2]+num[1+3]);
//			System.out.println(	num[2+0]+num[2+1]+num[2+2]+num[2+3]);
//			System.out.println(	num[3+0]+num[3+1]+num[3+2]+num[3+3]);
//			
//		}
		
		
		
		
		//1231
		//1312
		//1123
		//1234
		
		//2312
		//2123
		//
		//i번째 부터 k번째 숫자까지, k번째 숫자가 마지막이 될때까지
		
		
		//1924
		//19
		//12
		//14
		//92
		//94
		//24

		
//		String[] num = new String[number.length()];
//		num = number.split("");
//
//		//배열 자리수를 t 만큼 만한다.
//		String [][] array = new String[t][number.length()];
//		for(int i = 0 ; i < t; i++) {
//			for(int j = 0; j < number.length(); j++) {
//				if(num[i] == num[j]) {
//					j++;
//				}
//				array[i][j] = num[i]+num[j];
//				
//				System.out.println(array[i][j]);
//			}
//		}
//		ArrayList<String> list = new ArrayList<String>();
//		ArrayList<Integer> intList = new ArrayList<Integer>();
//		
//		num = number.split("");
//		
//		
//		
//		for(int i = 0; i < num.length; i++) {
//			for(int j = 0; j < num.length; j++) {
//				if(i != j) {
//					list.add(num[i]+num[j]);		
//				}
//			}
//		}
//		System.out.println(list);
//		for(int i = 0; i < list.size(); i++) {
//			intList.add(Integer.parseInt(list.get(i)));	
//		}
//		System.out.println(intList);
//		
//		int max = Collections.max(intList);
//		System.out.println("max : " + max);
//		
//		
		
		
//		char[] ch = new char[number.length()];
//		int[] in = new int[ch.length];
//		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		
//		//String - > char - > int
//		for(int i = 0; i < ch.length; i++) {
//			ch[i] = number.charAt(i);
//			in[i] = Character.getNumericValue(ch[i]);
//		}
//		
//		for(int i = 0; i < ch.length; i++) {
//			for(int j = 0; j < i; j++) {
//				list.add(ch[i] + ch[j]);
//			}
//		}
//		System.out.println(list);
//	
	}
	

}
