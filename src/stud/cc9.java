package stud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.xml.ws.handler.MessageContext.Scope;

public class cc9 {

	public static void main(String[] args) {
	
		
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden","kiki"};
		
		String answer ="";
		ArrayList<String> participants = new ArrayList<String>(Arrays.asList(participant));
		ArrayList<String> completions = new ArrayList<String>(Arrays.asList(completion));
		
		Iterator<String> it = completions.iterator();
		
		while(it.hasNext()) {
			String s = (String)it.next();
			participants.remove(s);
		}
		answer += participants;
		answer = answer.replaceAll("\\[", "").replaceAll("\\]","");
		System.out.println(answer);
	}

}
