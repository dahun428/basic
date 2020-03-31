package oop2;

import java.util.Scanner;

public class BankingDemo3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		BankingService service = new BankingService();
		
		while(true) {
			
			System.out.println();
			System.out.println("			[계좌관리 프로그램]");
			System.out.println("=======================================================");
			System.out.println("1.신규  2.조회  3.입금  4.출금  5.비번변경  6.해지	7.전체조회  0.종료");
			System.out.println("=======================================================");
			
			System.out.println("메뉴를 선택하세요 : ");
			int menuNo = sc.nextInt();
			
			
			//신규
			if(menuNo == 1) {
				System.out.println();
				System.out.println("신규 계좌 개설에 필요한 정보를 입력해주세요");
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
				
				service.addNewBanking(name, no, password, balance, period);
				
			//조회	
			}else if(menuNo == 2) {
				System.out.println();
				System.out.print("계좌번호를 입력하세요 : ");
				String no = sc.next();
				service.printBankingByNo(no);
				
				
			//입금
			}else if(menuNo == 3) {

				System.out.print("계좌번호를 입력해주세요 : ");
				String no = sc.next();
				System.out.print("입금할 금액을 입력해주세요 : ");
				long money = sc.nextLong();
							
				service.depositToBanking(no, money);
				
			//출금
			}else if(menuNo == 4) {
			
				System.out.print("계좌번호를 입력하세요 : ");
				String no = sc.next();
				System.out.print("비밀번호를 입력하세요 : ");
				int pwd = sc.nextInt();
				System.out.print("출금액을 입력하세요 : ");
				long money = sc.nextLong();
				service.withdrawFromBanking(no, pwd, money);
			
			//비밀번호 변경
			}else if(menuNo == 5) {
				
				
				System.out.print("계좌번호를 입력해주세요 : ");
				String no = sc.next();
				System.out.println("계좌 비밀번호를 입력해주세요 : ");
				int oldPwd = sc.nextInt();
				System.out.print("새로운 비밀번호를 입력해주세요 : ");
				int newPwd = sc.nextInt();
				
				service.changePassword(no, oldPwd, newPwd);
				
			//해지
			}else if(menuNo == 6) {
	
				
				System.out.print("계좌번호를 입력해주세요 : ");
				String no = sc.next();
				System.out.println("계좌 비밀번호를 입력해주세요 : ");
				int pwd = sc.nextInt();
				
				service.closeBanking(no, pwd);
				
			//종료
			}else if(menuNo == 0) {
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
			}else if(menuNo == 7){
				service.printAllBankings();
				
				
			//다른 수
			}else {
				System.out.println("올바르지않는 입력입니다. 다시 입력해주세요");
			}
			
			
		}
		
		
	}

}
