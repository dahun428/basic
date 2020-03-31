package oop8_abstract;

public class Monitor extends Computer{
	
	
	@Override
	void move(String stuck) {

		System.out.println("["+stuck+"]"+"모니터를 움직입니다.");
	}
}
