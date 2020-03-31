package stud;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

import javax.xml.ws.handler.MessageContext.Scope;

public class cc4 {

	public static void main(String[] args) {
	
		
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		
		
		char[] skillset = new char[skill.length()];
		char[] skill_treesSet = {};	
		
		int count = 0;
		
		for(int i = 0; i < skill.length(); i++) {
			skillset[i] = skill.charAt(i);
		}
		System.out.println(skillset);
		
		for(int i = 0; i < skill_trees.length; i++) {
			System.out.println(skill_trees[i]);
			String temp = skill_trees[i];
			
			skill_treesSet = new char[temp.length()];
			for(int j = 0; j < skill_treesSet.length; j++) {
				skill_treesSet[j] = skill_trees[i].charAt(j);
				System.out.println(skill_treesSet[j]);
			}
		}
		System.out.println("count : "+count);
		System.out.println(skill_treesSet);
//		for(int i = 0; i < skill_trees[1].length(); i++) {
//			skill_treesSet = new char[skill_trees[1].length()];
//			skill_treesSet[i] = skill_trees[1].charAt(i);
//			
//			
//			System.out.println(skill_treesSet[i]);
//		}
		
	}

}
