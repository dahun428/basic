package oop11_interface;

public class NormalTv{

	
	private Monitor monitor;	//Monitor류 객체를 담는 멤버변수
	
	public NormalTv(Monitor monitor	) {
		this.monitor = monitor; 		//생성자를 실해할때  Monitor를 구현한 객체를 전달받겠다. (Nomal Monitor , HDMonitor, CinemaMoniotr,LCDMonitor를 전달받을 수 있음
	}
	
	public void watch() {
		
		//Monitor 인터페이스를 기준으로 프로그램을 작성한다.
		monitor.on();
		monitor.display();
	}
	
}


