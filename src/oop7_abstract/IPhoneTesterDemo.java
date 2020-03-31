package oop7_abstract;

public class IPhoneTesterDemo {

	public static void main(String[] args) {
		IPhoneTester tester = new IPhoneTester();
		IPhone p1 = new IPhone();
		IPhone8 p2 = new IPhone8();
		IPhoneX p3 = new IPhoneX();
		IPhone11 p4 = new IPhone11();
		
		Galaxy p5 = new Galaxy();
		
		
	
		
//		tester.testIphone(p5); //에러 IPhone 타입류가 아닌 것은 전달 할 수 없다.
		
		
		System.out.println("#### IPhone 객체 테스트 실시");
		tester.testIphone(p1);
		System.out.println("#### IPhone8 객체 테스트 실시");
		tester.testIphone(p2);
		System.out.println("#### IPhoneX 객체 테스트 실시");
		tester.testIphone(p3);
		System.out.println("#### IPhone11 객체 테스트 실시");
		tester.testIphone(p4);
	}

}
