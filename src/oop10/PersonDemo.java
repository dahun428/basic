package oop10;

public class PersonDemo {

	public static void main(String[] args) {

		Person p = new Person("홍", "@h");
		p.printInfo();
		
		Employee p2 = new Employee("h","@d","영업부","사원",3000);
		p2.printInfo();
		
//		Employee p3 = new Employee();
//		p3.printInfo();
		
	}

}
