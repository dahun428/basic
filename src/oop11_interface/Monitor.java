package oop11_interface;
//인터페이스  -> 기획서
//모든 종류의 모니터가 반드시 갖춰야 하는 기능
//모든 종류의 모니터에 대한 표준을 정한다.
public interface Monitor {

	
	public abstract void on();	//추상클래스
	void off(); 				//public abstract는 생략가능
	void display(); 
	
}
