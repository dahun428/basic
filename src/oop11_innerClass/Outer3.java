package oop11_innerClass;

public class Outer3 {
	int x;
	static int y;
	void m1() {}
	static void m2() {}

	void m3() {
		
		int a = 10;
		int b = 10;
		final int c = 10;
		
		class Inner3{
			int A;
//			static int B;		//클래스 변수를 정의 할 수 없다.
			void m4() {
				
			}
//			static void m5() {	// 클래스 메소드를 정의할 수 없다.
//				
//			}
			void m6() {
				System.out.println(x);	//외부 클래스의 멤버 변수
				System.out.println(y);	//외부 클래스의 클래스 변수
				m1();					//외부 클래스의 멤버 메소드
				Outer3.m2();			//외부 클래스의 클래스 메소드
				System.out.println(a);	//내부클래스의 멤버 변수
				System.out.println(b);	//
				System.out.println(c);
				
			}
		}
	}
}
