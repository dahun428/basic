package oop11_interface;


//인터페이스 -기획서
//사운드 출력이 지원되는 모든 모니터가 갖춰야하는 기능을 정의한다.
public interface Speakable {
	int MIN_VOLUME = 0;		//상수
	int MAX_VOLUME = 100; // public static final 
	
	void sound();
	void volumeUp();
	void volumeDown();
	
	
}
