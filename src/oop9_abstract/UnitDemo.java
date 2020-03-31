package oop9_abstract;

public class UnitDemo{

	public static void main(String[] args) {

		
//		Marine m = new Marine("Marine");
		Firebat f = new Firebat();
		Ghost g = new Ghost();
		Starcraft star = new Starcraft();
		star.addUnit(f);
	}

}
