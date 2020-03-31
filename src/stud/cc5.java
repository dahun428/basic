package stud;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

import javax.xml.ws.handler.MessageContext.Scope;

public class cc5 {

	public static void main(String[] args) {
	
		
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		
		TreeSet set = new TreeSet();
		for(int i = 0; i < skill_trees.length; i++) {
			set.add(skill_trees[i]);	
		}
		System.out.println(set);
		System.out.println(set.tailSet("B"));
	
	}

}
