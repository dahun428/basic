package oop8_abstract;

public class Keyboard extends Computer{

	@Override
	void move(String stuck) {
	
		System.out.println("["+stuck+"]"+"키보드를 움직입니다.");
	}
	
}
