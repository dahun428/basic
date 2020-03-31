package control;

import java.util.Scanner;

public class forDemo6 {

	public static void main(String[] args) {

		// break
		//반복문을 탈출, for문, while 문 안에서 사용된다.
		//내가 입력한 주사위의 숫자와 동일한 숫자가 나오면 탈출
		// for(;;) ==> 무한루프
		
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		for(;;) {
			System.out.print("숫자를 입력하세요 (1~6) : ");
			int myNumber = sc.nextInt();
			int randomNumber = (int)(Math.random() * 6 + 1);
			
			System.out.println("[" + myNumber +", " + randomNumber + "] ");
			
			if(myNumber == randomNumber) {
				System.out.println("섬을 탈출합니다.");
				break;
			}
		}
		
	}

}
