package stud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cc12 {

	public static void main(String[] args) {
	
			String[] participate = {"leo", "kiki", "eden"};  
	        String[] completion = {"kiki","eden"}; 
	        String[] result; 

	        String answer ="";
	        
	        List<String> list = new ArrayList<>(Arrays.asList(participate)); 

	        for(int i = 0; i < completion.length; i++) { 

	            list.remove(completion[i]); 
	        } 
	        
	        result = list.toArray(new String [list.size()]); 

	        for(int i = 0; i < result.length; i++) { 

	        	answer += result[i];
	        }
	        System.out.println(answer);
	}
	

}
