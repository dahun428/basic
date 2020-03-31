package oop8_abstract;

import java.io.File;
import java.io.PrintWriter;

public class FileDataOutPut extends DataOutPut{
	
	String filename;
	String directroy;
	
	FileDataOutPut(String directroy, String filename) {
		this.directroy = directroy;
		this.filename = filename;
	}
	
	@Override
	void output(String[] data) {
	
		try {
			File file = new File(directroy, filename);
			PrintWriter writer = new PrintWriter(file);
			
			writer.println("---------데이터리스트--------");
			for(int i = 0; i < data.length; i++) {
				writer.println("["+(i+i)+"]" + data[i]);
			}
			
			writer.println("---------데이터리스트--------");
			writer.flush();
			writer.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	
}
