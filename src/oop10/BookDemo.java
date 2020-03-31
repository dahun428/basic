package oop10;

public class BookDemo {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		
		b1.setTitle("hu");
		b1.setWriter("no");
		b1.setPrice(100);
		
//		b1.writer = 
		
		System.out.println("제목 : " + b1.getTitle());
		System.out.println("저자 : " + b1.getWriter());
		
		
	}

}
