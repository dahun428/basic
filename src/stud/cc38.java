package stud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cc38 {
	
	public static void main(String[] args) {
		String dartResult = "1D2S3T*";
		
		cc38 c = new cc38();
		int a = c.solution(dartResult);
		System.out.println(a);
	}
	
	 public int solution(String dartResult) {
		 
	      int answer = 0;
	      List<String> list = Arrays.asList(dartResult.split(""));
	      //* , #은 indexof로 처리
	      System.out.println("dartResult: " + dartResult);
	      
	      List<Integer> scores = new ArrayList<>();
	      int countLength = 0; 
	      int countDouble = 0;
    	  for(int i = 0; i < list.size(); i++) {
	    	  //S,D,T 글자 찾기
	    	  int score = 0;
	    	    
	    	  if(list.get(i).equals("S") || list.get(i).equals("D") || list.get(i).equals("T")
	    			  || list.get(i).equals("*")|| list.get(i).equals("#")) {
	    		  String num = list.get(i-1);
	    		 
	    		//S일 경우
	    		if(list.get(i).equals("S")) {
	    			countLength++;
	    			System.out.println("num : " + num);
	    			int number = Integer.parseInt(num);
	    			score = (int) (Math.pow(number, 1));
	    			System.out.println("score : " + score);
	    			if(list.get(i+1).equals("*")) {
	    				countDouble++;
		    			score = score * (int)(Math.pow(2, countDouble));
		    		}else if(list.get(i+1) == list.get(list.size()-1) && list.get(i+1).equals("*")) {
		    			countDouble++;
		    			score = score * (int)(Math.pow(2, countDouble));
		    		}
	    			System.out.println("countDouble :" + countDouble );
	    			System.out.println("countLength :" + countLength );
	    			scores.add(score);
	    			
	    		//D일 경우
	    		}else if(list.get(i).equals("D")) {
	    			countLength++;
	    			System.out.println("num : " + num);
	    			int number = Integer.parseInt(num);
	    			score = (int) (Math.pow(number, 2));
	    			System.out.println("score : " + score);
	    			if(list.get(i+1).equals("*")) {
	    				countDouble++;
		    			score = score * (int)(Math.pow(2, countDouble));
		    		}else if(list.get(i+1) == list.get(list.size()-1) && list.get(i+1).equals("*")) {
		    			countDouble++;
		    			score = score * (int)(Math.pow(2, countDouble));
		    		}
	    			System.out.println("countDouble :" + countDouble );
	    			System.out.println("countLength :" + countLength );
	    			scores.add(score);
	    			
	    		//T일 경우
	    		}else if(list.get(i).equals("T")) {
	    			countLength++;
	    			System.out.println("num : " + num);
	    			int number = Integer.parseInt(num);
	    			score = (int) (Math.pow(number, 3));
	    			System.out.println("score : " + score);
	    			if(list.get(i+1).equals("*")) {
	    				countDouble++;
		    			score = score * (int)(Math.pow(2, countDouble));
		    			
		    		}else if(list.get(i+1) == list.get(list.size()-1) && list.get(i+1).equals("*")) {
		    			countDouble++;
		    			score = score * (int)(Math.pow(2, countDouble));
		    		}
	    			System.out.println("countDouble :" + countDouble );		
	    			System.out.println("countLength :" + countLength );
	    			scores.add(score);
	    		}
	    		
	    	  }
	    	  
	    	  
	    	  System.out.println("answer : " + answer);
	      }
    	  if(countDouble != 0 && countLength >2) {
    		  scores.get(0);
    	  }
    	  
    	  for(int i = 0; i < scores.size(); i++) {
    		  answer+= scores.get(i);
    		  
    	  }
	     
    	  return answer;
	  }
}