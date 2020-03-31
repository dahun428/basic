package oop4;

public class Product {

	String name;
	String maker;
	String category;
	int price;//가격
	double discountRate;//
	int stock;//재고량
	boolean isSoldOut;//
	
	Product(){}
	
	
	public Product(String name, String maker, String category, int price, double discountRate, int stock,
			boolean isSoldOut) {

		this.name = name;
		this.maker = maker;
		this.category = category;
		this.price = price;
		this.discountRate = discountRate;
		this.stock = stock;
		this.isSoldOut = isSoldOut;
	}
	public Product(String name, String maker, String category, int price, int stock) {

		this.name = name;
		this.maker = maker;
		this.category = category;
		this.price = price;
		this.stock = stock;

	}
	public Product(String name, String maker, String category, int price, int stock, double discountRate) {

		this.name = name;
		this.maker = maker;
		this.category = category;
		this.price = price;
		this.stock = stock;
		this.discountRate = discountRate;
	}
	


	void diplay() {
		System.out.println("-----------상품정보-------------");
		System.out.println("상품이름 :" + name);
		System.out.println("제조회사 :" + maker);
		System.out.println("카테고리 :" + category);
		System.out.println("판매가격 :" + price);
		System.out.println("할인비율 :" + discountRate);
		System.out.println("재 고 량 :" + stock);
		System.out.println("절판여부 :" + isSoldOut);
		System.out.println("-----------------------------");
	}
	void display2() {
		System.out.println("==============================================================");
		System.out.println("	상품이름	제조회사	카테고리	판매가격	할인비율	재고량	절판여부");
		System.out.println("==============================================================");
		System.out.print(name+"\t");
		System.out.print(maker+"\t");
		System.out.print(category+"\t");
		System.out.print(price+"\t");
		System.out.print(discountRate+"\t");
		System.out.print(stock+"\t");
		System.out.print(isSoldOut+"\t");
		System.out.println("---------------------------------------------------------------------");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMaker() {
		return maker;
	}


	public void setMaker(String maker) {
		this.maker = maker;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public double getDiscountRate() {
		return discountRate;
	}


	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public boolean isSoldOut() {
		return isSoldOut;
	}


	public void setSoldOut(boolean isSoldOut) {
		this.isSoldOut = isSoldOut;
	}
	
	
	
}
