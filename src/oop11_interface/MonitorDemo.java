package oop11_interface;

public class MonitorDemo {

	public static void main(String[] args) {
		//일반모니터
//		NormalMonitor m1 = new NormalMonitor();
//		m1.on();
//		m1.display();
//		m1.off();
//		m1.display();
//		
		//해당도 조정이 가능한 고화질 모니터
		HDMonitor m2 = new HDMonitor("4k");
		m2.on();
		m2.display();
		m2.off();
		m2.display();
		
		
		//스크린 크기 조정이 가능하고, 사운드 출력이 지원되는 대형 모니터
		CinemaMonitor m3 = new CinemaMonitor("200인치	");
		
		m3.on();
		m3.display();
		m3.volumeUp();
		m3.volumeDown();
		m3.display();
		m3.off();
		
		
		//스크린 크기 조정이 가능하고, 사운드 출력과 터치기능이 지원되는 대형 lcd 모니터
		LCDCinemaMonitor m4 = new LCDCinemaMonitor("100인치", 60);
		m4.on();
		m4.display();
		m4.volumeDown();
		m4.volumeUp();
		m4.touch();
		m4.off();
		
		
	}

}
