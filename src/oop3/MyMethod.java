package oop3;

public class MyMethod {

	//인스턴스 변수, 멤버변수
	String name;
	
	//클래스 변수, 정적변수
	static final double PI = 3.14;
	
	//인스턴스 메소드
	//인스턴스 변수, 클래스 변수 모두 사용 가능
	void memberMethod(){
		System.out.println("인스턴스 변수 사용 : " + name);
		System.out.println("클래스 변수 사용 :" + MyMethod.PI);
	}
	
	
	//클래스 메소드, 정적메소드
	//클래스 메소드에서는 클래스 변수만 사용가능하다.
	static void staticMethod() {
//		System.out.println("인스턴스 변수 사용 : " + name); // 에러
		System.out.println("클래스 변수 사용 :" + MyMethod.PI);
	}
	
	
	//클래스 메소드, 정적메소드
	//인스턴스메소드 사용불가, 클래스 메소드 사용가능
	static void staticMethod2() {
//		memberMethod(); //오류
		MyMethod.staticMethod();
		
	}
	
	
}
