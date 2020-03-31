package stud;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.xml.ws.handler.MessageContext.Scope;

public class cc6 {

	public static void main(String[] args) {
	
		
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		ArrayList list = new ArrayList();
		
		//C가 있는 배열을 모두 찾고
		//C다음에 B가 있는 배열을 모두 찾는다.
		//그다음에 D가 있는 배열을 찾는다.
		int count = 0;
		
		char[] ch = new char[skill.length()];
		
		for(int i = 0; i < skill.length(); i++) {
			ch[i] = skill.charAt(i);
			list.add(ch[i]);
		}
		for(int i = 0; i < list.size(); i++) {
			
		}
		
		
		char C = ch[0];
		char B = ch[1];
		char D = ch[2];
		
		for(int i = 0; i < skill_trees.length; i++) {
			
			for(int j = 0; j < i; j++) {
				int targetC = skill_trees[i].indexOf(C);
				int targetB = skill_trees[j].indexOf(B);
				int targetD = skill_trees[j].indexOf(D);

				if(targetC > targetB && targetB > targetD) {
					count++;
				}
			}
			
					
		}
		System.out.println(count);
		
		
		
	}

}
