package oop2;

import java.util.Scanner;

public class BangkingDemo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int savePoint = 0;
		Bangking[] banks = new Bangking[100];
		boolean isExistNo = false;
		Bangking find = null;
		Bangking bank = new Bangking();
		
		while(true) {
			System.out.println();
			System.out.println("=======================================================");
			System.out.println("1.신규  2.조회  3.입금  4.출금  5.비번변경  6.해지  0.종료");
			System.out.println("=======================================================");
			
			int inputNum = sc.nextInt();
			
			
			//신규
			if(inputNum == 1) {
				
				System.out.print("이름을 입력하세요 : ");
				String name = sc.next();
				System.out.print("계좌번호를 입력하세요 : ");
				String no = sc.next();
				System.out.print("비밀번호를 입력하세요 : ");
				int password = sc.nextInt();
				System.out.print("입금할 금액을 입력하세요 : ");
				long balance = sc.nextLong();
				System.out.print("가입기간을 입력하세요  : ");
				int period = sc.nextInt();
				
				bank = new Bangking(name, no, password, balance, period);
				banks[savePoint] = bank;
				savePoint++;
				
				
			//조회	
			}else if(inputNum == 2) {
			
				System.out.print("계좌번호를 입력하세요 : ");
				String no = sc.next();
				
				
				isExistNo = bank.isExistNo(banks, no, savePoint);
				if(isExistNo) {
					find = bank.foundBankNo(banks, no, inputNum);
					find.display();
				}else {
					System.out.println("해당 계좌를 찾을 수 없습니다.");
				}
				
			//입금	
			}else if(inputNum == 3) {
								
				System.out.print("계좌번호를 입력해주세요 : ");
				String no = sc.next();
				System.out.print("입금할 금액을 입력해주세요 : ");
				long money = sc.nextLong();
				
				isExistNo = bank.isExistNo(banks, no, savePoint);
				
				if(isExistNo) {
					find = bank.foundBankNo(banks, no, inputNum);
					find.deposit(money);
				}else {
					System.out.println("잘못된 계좌번호입니다. 다시 입력해주세요");
				}
				
			//출금	
			}else if(inputNum == 4) {
				
				System.out.print("계좌번호를 입력해주세요 : ");
				String no = sc.next();
				System.out.print("출금할 금액을 입력해주세요 : ");
				long money = sc.nextLong();
				System.out.println("계좌 비밀번호를 입력해주세요 : ");
				int pwd = sc.nextInt();
				
				isExistNo = bank.isExistNo(banks, no, savePoint);
				
				if(isExistNo) {
					find = bank.foundBankNo(banks, no, inputNum);
					find.withdraw(money, pwd);
				}else {
					System.out.println("잘못된 계좌번호입니다. 다시 입력해주세요");
				}
				
			//비밀번호 변경	
			}else if(inputNum == 5) {
				
				System.out.print("계좌번호를 입력해주세요 : ");
				String no = sc.next();
				System.out.println("계좌 비밀번호를 입력해주세요 : ");
				int oldPwd = sc.nextInt();
				
				isExistNo = bank.isExistNo(banks, no, savePoint);
				find = bank.foundBankNo(banks, no, savePoint);

				if(isExistNo) {
					if(oldPwd == find.password) {
						System.out.print("새로운 비밀번호를 입력해주세요 : ");
						int newPwd = sc.nextInt();
						find.changePassword(oldPwd, newPwd);
					}
					
				}else {
					System.out.println("잘못된 계좌번호입니다. 다시 입력해주세요");
				}

			//해지	
			}else if(inputNum == 6) {
				
				System.out.print("계좌번호를 입력해주세요 : ");
				String no = sc.next();
				System.out.println("계좌 비밀번호를 입력해주세요 : ");
				int pwd = sc.nextInt();
				
				isExistNo = bank.isExistNo(banks, no, savePoint);
				find = bank.foundBankNo(banks, no, savePoint);
				
				if(isExistNo) {
					find.close(pwd);
				}else {
					System.out.println("잘못된 계좌번호입니다. 다시 입력해주세요");
				}
				
			//종료	
			}else if(inputNum == 0) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				sc.close();
				
			}else {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
			}
			
		
		}
		
		
	}

}
