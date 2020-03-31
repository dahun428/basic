package oop8_abstract;

public class Computer {

	String stuck;
	
	void on() {
		System.out.println("컴퓨터를 실행합니다.");
	}
	void off() {
		System.out.println("컴퓨터를 종료합니다.");
	}
	
	
	void setStuck(String stuck) {
		this.stuck = stuck;
	}
	
	void interfaceLink(String stuck) {
		System.out.println(stuck+"를 실행합니다.");
	}
	
	void move(String stuck) {
		System.out.println(stuck+"를 움직입니다.");
	}
}
