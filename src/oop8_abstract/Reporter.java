package oop8_abstract;

public class Reporter {
	
	String [] data;
	DataOutPut output;
	
//	DataOutPut output = new FileDataOutPut(directroy, filename);
	
	//DataOutPut류 객체를 전달받아서 멤버변수 output에 담은 메소드
	void setOutPutter(DataOutPut dataOutPut) {
		this.output = dataOutPut;
	}
	
	void setData(String[] data) {
		this.data = data;
	}
	void reporting() {
		output.output(data);
	}
	
}
