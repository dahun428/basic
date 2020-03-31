package oop8_abstract;

public class mover {
	
	
	String stuck;
	Computer c;
	void setInterFace(Computer interFace) {
		this.c = interFace;
	}
	
	void setStuck(String stuck) {
		this.stuck = stuck;
	}
	void movering() {
		c.move(stuck);
	}
	
}
