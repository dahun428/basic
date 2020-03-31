package oop4;

public class Book {

	String title;
	String writer;
	String publisher;
	int price;
	String genre;
	
	//생성자 메소드
	//기본생성자메소드
	Book(){
		publisher = "한빛미디어";
		//거의 대부분의 책이 한빛미디어에서 출판
		//book객체 생성되고나면 pulisher를 "한빛미디어"로 설정해버리자.
	}
	
	
	public Book(String title, String writer, int price, String genre) {
	
		this.title = title;
		this.writer = writer;
		this.publisher = "한빛미디어";
		this.price = price;
		this.genre = genre;
	}


	//일반 멤버 메소드(인스턴스 메소드)
	void printBookInfo() {
		System.out.println("-----도서 정보-----");
		System.out.println("제  목 : " + title);
		System.out.println("저  자 : " + writer);
		System.out.println("출판사 : " + publisher);
		System.out.println("가  격 : " + price);
		System.out.println("장  르 : " + genre);
		System.out.println("----------------");
	}
	
	
	
}
