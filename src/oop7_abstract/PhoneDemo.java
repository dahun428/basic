package oop7_abstract;

import java.util.ArrayList;

public class PhoneDemo {

	public static void main(String[] args) {

		
//		IPhone iphone1 = new IPhone();
//		SmartPhone iphone2 = new IPhone();
//		FeacturePhone iphone3 = new IPhone();
//		Phone iphone4 = new IPhone();
//		
//		iphone1.userid ="dahun";
//		iphone1.password= "1234";
//		iphone1.ip ="124.426.212.12.4";
//		iphone1.applemusic();
//		iphone1.siri();
//		
//		iphone1.email = "djkf@naver.com";
//		iphone1.pixel = "천만화소";
//		iphone1.photo();
		/*
		 * 클래스의 형변환(참조변수 형변환)
		 * 
		 * 클래스 형변환은 상속관계에 있는 클래스에서만 가능하다
		 * 자동형변환
		 * 	자손타입의 객체는 그 객체의 클래스 타입의 변수와 그 객체의 조상 클래스 타입 변수에 담을 수 있다.
		 * 수동형변환
		 * 	자손타입의 객체를 생성해서 조상타입의 변수를 저장했을 때, 특정 위치의 자손객체의 참조값을 획득해야하는 경우
		 * 참조할 자손클래스로 형변환 연산자를 이용해서 자손객체의 참조값을 획득할 수 있다.
		 * 
		 * 조상타입클래스 변수 1 = new 자손클래스();
		 * 자손클래스 변수 2 = (자손클래스) 변수 1;
		 * 예> smartPhone p1 = new Iphone();
		 * Iphone 객체의 기능을 사용하고 싶다.
		 * iphone p2 = (iphone) p1;
		 * p2.siri();
		 * 
		 * Iphone 객체의 기능을 사용하고 싶다.
		 * ((Iphone) p1).siri();
		 * 
		 * 
		 */
		
//		
//		SmartPhone[] s1 = new SmartPhone[2];
//		s1[0] = new IPhone();
//		
//		((IPhone) s1[0]).siri();
////		((Galaxy) s1[0]).samsungPay(); //에러 java.lang.classCastException
//		
//		SmartPhone p1 = new IPhone();
//		IPhone p2 = (IPhone) p1;
//		
//		ArrayList list = new ArrayList();
//		 
//		list.stream().forEach(System.out::println);
		
		SmartPhone p4 = new IPhone();
		SmartPhone p5 = new Galaxy();
		p4.internet();
		p5.internet();
		
		
	}

}
