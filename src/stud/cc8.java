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

public class cc8 {

	public static void main(String[] args) {
	
		
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		int answer= 0;

		ArrayList<String> list = new ArrayList<String>(Arrays.asList(skill_trees));
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			
			String s = it.next();
			String b = s.replace("[^"+skill+"]", "");
			if(skill.indexOf(b) != 0) it.remove();
			
		}
		answer = list.size();
		System.out.println(answer);
		
	}

}
