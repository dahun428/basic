package oop6_abstract;

public class Contact {

	String name;
	String tel;
	String email;
	
	public Contact() {

	}

	public Contact(String name, String tel) {
		this(name, tel, null);
	}
	
	public Contact(String name, String tel, String email) {

		this.name = name;
		this.tel = tel;
		this.email = email;
	}
	//Oject로부터 상속받은 toString() 메소드를 재정의함
	//""클래스이름@해시코드"를 반환하도록 구현되어있는 Object의 toString()메소드를
	//Contact객체의 name,tel, email멤버변수에 현재 저장된 값이 문자열로 이어서 반환되도록 재정의
	@Override
	public String toString() {
		return "Contact [name=" + name + ", tel=" + tel + ", email=" + email + "]";
	}
	

	
}
