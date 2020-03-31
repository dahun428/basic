package oop9_abstract;

public class Ghost extends Unit{
	
	String name = "Ghost";
	@Override
	void attack() {
		System.out.println("["+name+"]은 자신을 감추고 적을 공격합니다.");
	}
}
