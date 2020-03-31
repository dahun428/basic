package oop11_interface;

public class LCDCinemaMonitor extends AbstractMonitor implements Speakable,Touchable{

	private String screenSize;
	private int volume;

	public LCDCinemaMonitor() {

		screenSize = "30인치";
		volume = 30;
	}

	public LCDCinemaMonitor(String screenSize, int volume) {
		super();
		this.screenSize = screenSize;
		this.volume = volume;
	}
	//전원체크 생략
	@Override
	public void display() {
		System.out.println("["+screenSize+"] 크기 LCD시네마 모니터로 동영상을 재생합니다.");

	}
	@Override
	public void sound() {
		System.out.println("소리를 재생합니다.");
	}
	@Override
	public void touch() {
		System.out.println("화면의 메뉴를 터치해서 장면을 전환합니다.");
	}
	@Override
	public void volumeDown() {
		volume -= 5;
		if(volume < Speakable.MIN_VOLUME) {
			volume = Speakable.MIN_VOLUME;
		}
		System.out.println("현재 볼륨 : "+ volume);
	
	}
	@Override
	public void volumeUp() {
		volume += 5;
		if(volume > Speakable.MAX_VOLUME) {
			volume = Speakable.MAX_VOLUME;
		}
		System.out.println("현재 볼륨 : "+ volume);
	
	}
}
