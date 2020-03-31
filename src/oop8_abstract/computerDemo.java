package oop8_abstract;

public class computerDemo {

	public static void main(String[] args) {
		
		
		Computer c1 = new Computer();
		Mouse m = new Mouse();
		Keyboard k = new Keyboard();
		Monitor m2 = new Monitor();
		
		mover mover = new mover();
		String stuck ="하이";
		
		mover.setStuck(stuck);
		mover.setInterFace(m2);
		mover.movering();
	}
	
	
}
