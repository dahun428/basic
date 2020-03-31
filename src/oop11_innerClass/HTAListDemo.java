package oop11_innerClass;

import java.util.ArrayList;
import java.util.Iterator;

public class HTAListDemo {

	public static void main(String[] args) {

//		ArrayList<String> list2 = new ArrayList<String>();
//		list2.add("a0");
//		list2.add("a1");
//		list2.add("a2");
//		
//		Iterator<String> iter = list2.iterator();
//		while(iter.hasNext()) {
//			String value = iter.next();
//			System.out.println(value);
//		}
//		
//		
		
		
		HTAList list = new HTAList();
		list.add("홍길동");
		list.add("강감찬");
		list.add("김궁국");
		list.add("캉강강");
		list.add("코로나");
		list.add("류관순");
		
		HTAIterator it = list.iterator();
		String value1 = it.next();
		while(it.hasNext()) {
			String value = it.next();
			System.out.println("이름 : " + value);
		}
		
		
	}
	
	
}
