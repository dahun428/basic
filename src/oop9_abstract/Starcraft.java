package oop9_abstract;

public class Starcraft{

	Unit[] units = new Unit[200];
	Unit name;
	int unitCount = 0;
	
	
	void addUnit(Unit unit) {
		units[unitCount] = unit;
		unitCount++;
		System.out.println();
		System.out.println(unit.name + "이 추가되었습니다. ");
		System.out.printf(" 현재 총 유닛수 : [ %d ]%n", unitCount);
	}
	
	
	void click() {
		for(int i = 0; i < unitCount; i++) {
			Unit unit = units[i];
			unit.move();
		}
	}
	void clickA() {
		for(int i = 0; i < unitCount; i++) {
			Unit unit = units[i];
			unit.attack();
		}
	}
	
	
	
}
