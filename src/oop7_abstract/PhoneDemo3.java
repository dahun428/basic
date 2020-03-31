package oop7_abstract;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneDemo3 {

	public static void main(String[] args) {

		SmartPhone testPhone = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("인터넷 기능을 테스트할 폰을 선택하세요. 테스트를 진행해드립니다.");
		System.out.println("1.그냥 스마트폰 2.아이폰 3.갤럭시");
		
		int no = sc.nextInt();
		
		if(no == 1) {
			testPhone = new SmartPhone();
		}else if(no == 2) {
			testPhone = new IPhone();
		}else if(no == 3) {
			testPhone = new Galaxy();
		}
		
		if(testPhone != null) {
			testPhone.internet(); 
		}
		
	}

}
