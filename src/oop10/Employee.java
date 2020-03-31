package oop10;

public class Employee extends Person{
	
	private String dept;
	private String position;
	private int salary;
	
	public Employee() {
		super(); 	//super()는 부모 클래스의 기본생성자를 가리킨다.
					//모든 생성자 메소드에는 부모클래스의 기본생성자를 실행시키는 super(); 수행문이 자동으로 추가된다.
					//개발자가 다른 super(값,값)메소드를 실행시키는 수행문을 추가하면
					//super(); 수행문은 추가되지 않는다.
	}

	
	/*부모 객체의 기본생성자를 생략하면 자식 개체의 기본생성자도 사용할 수 없다.
	 * 모든 생성자 앞에는 super() 가 자동으로 추가된다.
	 */
	public Employee(String name, String email, String dept, String position, int salary) {
//		super(name, email);
		/*
		 * super( ) 메소드는 부모의 생성자를 가리킨다.
		 * 자식 클래스의 생성자 안에서 부모 클래스의 생성자를 실행할 때만 사용한다.
		 * super() 메소드는 메소드의 첫번째 수행문으로만 사용할 수 있다.
		 * 
		 * super(name, email)은
		 * 
		 * class person{
		 * 		String name;
		 * 		Stirng email;
		 * 
		 * 	public Person(){} <--- employee에서 super()로 접근가능
		 * 	public Person(String name, String email){
		 * 		this.name = name;
		 * 		this.email = email;
		 * 
		 * 	}
		 * }
		 */
		this.dept = dept;
		this.position = position;
		this.salary = salary;
	}

	@Override
	public void printInfo() {

		super.printInfo();
		System.out.println("empp");
		System.out.println("부서 : " + dept);
		System.out.println("직위 : "	+ position);
		System.out.println("급여 : " + salary);
	}
	
}
