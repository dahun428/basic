package oop3;

public class ArgSample {

	//기본자료형 타입의 값을 매개변수로 전달받은 경우
	void changeValue(int num) {
		System.out.println("changeValue()에서의 num----> " + num);
		num = 150;	
		System.out.println("changeValue()에서의 num----> " + num);
	}
	//참조형 타입의 값을 매개변수로 전달 받은 경우
	void changeDataValue(Data data) {
		data.num = 400;
		System.out.println("changeDataValue()에서의 num----> " + data);
	}
	
}
