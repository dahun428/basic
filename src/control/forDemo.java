package control;

import java.util.Scanner;

public class forDemo {

	public static void main(String[] args) {


		int income = 0;		
		Scanner sc = new Scanner(System.in);
		System.out.println("로또 번호 발매기");
		System.out.print("1000원 단위 금액을 입력해주세요 : ");
		
		income = sc.nextInt();
		
		int setCount = income / 1000;
		int[] rottery = new int[6];
		

		for(int i = 1; i <= setCount; i++) {
			System.out.println("로또 번호  : " + i + " 게임");
			for(int j = 0; j < rottery.length; j++) {
				rottery[j] = (int)(Math.random() * 45 + 1);
				System.out.print(" "+rottery[j]);
			}
			System.out.println("");
		}
		

	}

}
