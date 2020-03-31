package oop4;

public class BookDemo {

	public static void main(String[] args) {
		Book book1 = new Book();
		book1.printBookInfo();
		Book book2 = new Book();
		book2.printBookInfo();
		Book book3 = new Book();
		book3.printBookInfo();
		
		Book book4 = new Book("처음만나는머신러인","바보",5000,"추리");
		book4.printBookInfo();
		
	}
	
	
	
}
