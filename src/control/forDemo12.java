package control;

import java.util.Scanner;

public class forDemo12 {

	public static void main(String[] args) {

		//1~100범위의 임의의 정수를 생성해서 secretNumber에 저장
		
		int secretNumber = (int)(Math.random()*100 +1);
		
		//사용자가 정답을 맞추기 위해서 숫자를 입력한 횟수
		int inputCount = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			int answer = sc.nextInt();
			
			inputCount++;
			
			if(answer == secretNumber) {
				System.out.println("정답 : " + secretNumber + " 입력횟수 : " + inputCount);
				break;
			}else{
				if(answer < secretNumber) {
					System.out.println("UP");		
				}else {
					System.out.println("Down");
				}
				
			}
			
		}
		
		sc.close();
	}

}
