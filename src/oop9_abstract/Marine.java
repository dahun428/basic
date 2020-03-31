package oop9_abstract;

public class Marine extends Unit{
	
	String name = "Marine";
	
	Marine(){
		this.name = name;
	}
	
	@Override
	void attack() {
		System.out.println("["+name+"] 은 적을 총으로 사살합니다.");
	}
	
	
}
