package oop8_abstract;

public class ConsoleDataOutPut extends DataOutPut{

	@Override
	void output(String[] data) {
		System.out.println("---------데이터 목록-----------");
		for(int i = 0; i < data.length; i++) {
			System.out.println("["+(i+1)+"]"+data[i]);
		}
		System.out.println("---------데이터 목록-----------");
		
		
	}
	
	
	
}
