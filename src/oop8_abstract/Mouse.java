package oop8_abstract;

public class Mouse extends Computer{

	
	@Override
	void move(String stuck) {
	
	System.out.println("["+stuck+"]"+"마우스를 움직입니다.");
	}
	
}
