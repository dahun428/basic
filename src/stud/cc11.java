package stud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.sql.rowset.serial.SerialArray;
import javax.xml.ws.handler.MessageContext.Scope;

public class cc11 {

	public static void main(String[] args) {
	
		/*
		 * 야구게임
		 * 1-9까지의 임의의 수 3개를 가진 배열이 있다.
		 * 사용자로부터 숫자 3개를 입력받아서 순서대로 배열에 저장한다.
		 * 사용자가 입력한 숫자와 임의의 숫자들을 비교해서
		 * 숫자가 동일하고 인덱스도 동일하면 strike
		 * 숫자는 동일하지만 인덱스는 일치하지 않으면 ball로 판정한다.
		 * 
		 */
	
		Scanner sc = new Scanner(System.in);
		
		//임의의숫자 3개를 저장하는 배열
		int[] secretNum = new int[3];
		//사용자가 입력한 숫자 3개를 저장하는 배열
		int[] inputNum = new int[3];
		
		//1~9 임의의 숫자를 secretNum에 순서대로 저장하기
		for(int i = 0; i < secretNum.length; i++) {
			int randomNum = (int)(Math.random()*9 + 1);
			
			//secretNum에 중복된 숫자가 저장되지 않게 하기
			boolean isExist = false;
			for(int j = 0; j < secretNum.length; j++) {
				if(secretNum[j] == randomNum) {
					//동일한 숫자가 발견되면 isExist를 true로 설정하고
					//숫자를 비교하는 for문 탈출
					isExist = true;
					break;
				}
			}
			//isExist가 false 면 중복없음, isExist가 true면 중복이 발생함.
			if(!isExist) {
				//if문은 true면, if문 내용을 실행하고, false 면 else문을 실행시키기 때문에
				//isExist가 true라면 false를 반환하여 else 문을 실행시키게 된다.
				//중복이 없었으므로 난수를 배열에 저장
				secretNum[i] = randomNum;
			}else {
				// 이번에 뽑은 난수가 중복이 발생했으므로 다시 이번회차를 뽑기위해서
				//i를 1감소 시킴
				i--;
			}
		}
		//사용자가 숫자 맞추기
		int tryCount = 1;
		
		while(true) {
			
			if(tryCount > 10) {
				System.out.println("실패 - 시도 횟수가 10회를 넘었습니다!");
				break;
			}
			
			System.out.print("첫번째 숫자를 입력하세요 : ");
			inputNum[0] = sc.nextInt();
			System.out.print("두번째 숫자를 입력하세요 : ");
			inputNum[1] = sc.nextInt();
			System.out.print("세번째 숫자를 입력하세요 : ");
			inputNum[2] = sc.nextInt();
			
			int strikeCount = 0;
			int ballCount = 0;
			for(int i = 0; i < inputNum.length; i++) {
				for(int j = 0; j <secretNum.length; j++) {
					if(inputNum[i] == secretNum[j]) {
						if(i == j) {
							strikeCount++;
						}else {
							ballCount++;
						}
					}
				}
			}
			
			System.out.println("출력값 : " + strikeCount + "S" + ballCount + "B");
			if(strikeCount == 3) {
				System.out.println("정답입니다. 시도 횟수는 총 " + tryCount + " 회 입니다.");
				break;
			}
			tryCount++;
		}
	}

}
