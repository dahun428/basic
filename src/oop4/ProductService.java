package oop4;

import java.util.Arrays;
import java.util.Collections;

import oop2.Banking;

public class ProductService {

	Product[] db = new Product[20];
	int savePosition = 0;
	boolean isExist;
	
	//배열에 저장된 모든 상품 정보를 출력한다.
	//전체조회
	void printAllProduct() {
	isExist = false;
	for(int i = 0; i < savePosition; i++) {
			Product product = db[i];
			if(!isExist) {
				System.out.println("입고된 상품이 없습니다.");	
			}else {
				product.diplay();
			}

		}
		
		
	}
	
	//상품 객체(새상품, 이월상품)을 전달받아서 배열에 저장한다.
	//상품검색
	
	
	//상품명과 입고량을 전달받아서 이미 배열에 저장된 상품의 재고량을 증가
	//입고
	void insertProduct(Product product) {
		
		db[savePosition] = product;
		isExist = true;
		savePosition++;
		
	//상품명과 출고량을 전달받아서 배열에서 해당상품을 찾아서 재고량을 감소
	//단, 재고량보다 출고량이 많은 경우 오류 메시지 출력
	//단, 재고량이 0이 되면 해당상품의 절판여부를 true로 설정
	}
	void addProductStock(String name, int amount) {
		
		for(int i = 0; i < savePosition; i++) {
			Product product = db[i];
			if(product.name.equals(name)) {
				product.stock += amount;
			}else {
				System.out.println("해당 상품이 없습니다.");
			}
		}
		
	}
	
	void exportProduct(String name, int amount) {
		
		for(int i = 0; i < savePosition; i++) {
			Product product = db[i];
			if(product.name.equals(name)) {
				if(product.stock < amount) {
					System.out.println("보유 재고가 적습니다.");
					System.out.println("요청 재고 ["+amount+"] ");
					System.out.println("현재 재고 ["+product.stock+"] ");
					System.out.println("부족 재고 ["+(product.stock - amount)+"] ");
				}else {
					System.out.println("출고를 완료하였습니다.");
					System.out.println("요청 재고["+amount+"] ");
					product.stock -= amount;
					System.out.println("남은 재고량 ["+product.stock+"] ");
				}
			}else {
				System.out.println("해당 상품이 없습니다.");			
			}
			if(product.stock == 0) {
				product.isSoldOut = true;
			}
		}
		
	}
	//상품명을 전달받아서 배열에서 상품명이 일치하는 상품정보 출력
	
	void printProductsByName(String name) {
		for(int i = 0; i < savePosition; i++) {
			Product product = db[i];
			if(product.name.equals(name)) {
				product.diplay();
			}else {
				System.out.println("해당 상품이 없습니다.");
			}
		}
		
	}
	//제조사 명을 전달받아서 배열에서 제조사명이 일치하는 상품정보 출력
	void printProductsByMaker(String maker) {
		for(int i = 0; i < savePosition; i++) {
			Product product = db[i];
			if(product.maker.equals(maker)) {
				product.diplay();
			}else {
				System.out.println("해당 제조사명과 일치하는 상품이 없습니다.");
			}
		}
		
	}
	//카테고리 명을 전달받아서 배열에서 카테고리명이 일치하는 상품정보 출력
	void printProductsByCategory(String category) {
		for(int i = 0; i < savePosition; i++) {
			Product product = db[i];
			if(product.category.equals(category)) {
				product.diplay();
			}else {
				System.out.println("해당 카테고리와 일치하는 상품명이 없습니다.");
			}
			
		}
	}
	//최저가격과 최고가격을 전달받아서 배열에서 해당 가격 범위에 속하는 상품 정보 출력
	void printProductsByPrice(int minPrice,  int maxPrice) {
				
		for(int i = 0; i < savePosition; i++) {
			Product product = db[i];
			if(minPrice < product.price && product.price < maxPrice){
				
				product.diplay();
				
			}else {
				System.out.println("해당하는 상품이 없습니다.");
			}
		}
		
	}
	
//	Product[] findNo(Product[] arr, int savePosition) {
//		Product[] products = null;
//		for(int i = 0; i < savePosition; i++) {
//			Product product = db[i];
//		
//		}
//		
//		
//		return products;
//		
//	}
	
	
}
