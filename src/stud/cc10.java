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

public class cc10 {

	public static void main(String[] args) {
	
		int[] input = new int[3];
		int[] secret = new int[3];
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//0~9의 숫자 중복되지 않게 랜덤 입력
		for(int i = 0; i < secret.length; i++) {
			secret[i] = (int)(Math.random()*9 + 1);
			for(int j = 0; j < i; j++) {
				if(secret[i] == secret[j]) {
					i--;
					break;
				}
			}
		}
		
		while(true) {
			int strike = 0;
			int ball = 0;
			
			for(int i = 0; i < secret.length; i++) {
				System.out.println("              (secret 숫자 : "+secret[0]+","+secret[1]+","+secret[2]+")");
				System.out.print("숫자를 입력 해주세요 " + "(입력 갯수 "+ (i) +" 개 ) : ");
				
				input[i] = sc.nextInt();
				if(input[i] == secret[i]) {
					strike++;
					System.out.println();
					System.out.println("======Strike : " + strike);
					System.out.println();
				}
				for(int j = 0; j < input.length; j++) {
					if(input[i] == secret[j] && input[i] != secret[i]) {
						ball++;
						System.out.println();
						System.out.println("=======ball : " +ball);
						System.out.println();
					}
				}
				
			}
			count++;
			if(strike == 3) {
				System.out.println("Three Strike!");
				break;
			}else {
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("              Game 다시하기 ");
				System.out.println();
				System.out.println();
				System.out.println();
			}
			if(count >=10) { 
				System.out.println();
				System.out.println();
				System.out.println("              Game Over");
				System.out.println();
				System.out.println();
				break;
			}
			
		}
	
	}

}
