package oop2;


/**
 * 고객들의 계좌정보를 관리한다.
 * 신규계좌의 등록, 계좌에 대한 입출금/해지 등의 서비스를 제공
 * @author JHTA
 *
 */
public class BankingService {

	Banking[] db = new Banking[100];
	int savePoint = 0;
	boolean isExistNo = false;
	Banking find = null;
	
	BankingService() {
		db = new Banking[100];
	}
	BankingService(int size) {
		db = new Banking[size];
	}
	
	//등록된 전체 계좌정보를 출력하는 서비스
	void printAllBankings() {
		System.out.println();
		System.out.println("===============================");
		System.out.println("예금주	계좌번호	잔액	가입기간");
		System.out.println("===============================");
		for(int i = 0; i <savePoint; i++) {
			Banking banking = db[i];
			System.out.print(banking.name+"\t");
			System.out.print(banking.no+"\t");
			System.out.print(banking.balance+"\t");
			System.out.print(banking.period+"\t");
			
		}
		
	}
	//신규 계좌를 등록하는 서비스
	void addNewBanking(String name, String no, int password, long balance, int period) {
		
		Banking banking = new Banking(name, no, password, balance, period);
		db[savePoint] = banking;
		savePoint++;
		
	}
	//계좌조회 서비스(계좌번호에 해당하는 계좌정보를 조회(출력)하는 서비스
	void printBankingByNo(String no) {
		
		Banking banking = new Banking();
		isExistNo = banking.isExistNo(db, no, savePoint);
		
		if(isExistNo) {
			find = banking.foundBankNo(db, no, savePoint);
		}
		if(find != null) {
			System.out.println("-----------계좌 정보-----------");
			System.out.println("예 금 주 : " + find.name);
			System.out.println("계좌번호 : " + find.no);
			System.out.println("현재잔액 : " + find.balance);
			System.out.println("적금기간 : " + find.period + " 개월");
			System.out.println("금    리 : " + Banking.RATE_OF_INTEREST * 100 + "%");
			System.out.println("-----------------------------");
		
		}
		
	}
	//계좌번호,입금액을 전달받아서 해당 계좌에 입금하는 서비스
	void depositToBanking(String no, long money) {
		
		Banking banking = new Banking();
		isExistNo = banking.isExistNo(db, no, savePoint);
		if(isExistNo) {
			find = banking.foundBankNo(db, no, savePoint);
			find.balance += money;
			System.out.println("입금이 완료되었습니다.");
			System.out.println("현재 잔액은 " + find.balance +" 원 입니다.");

		}else {
			System.out.println("해당 계좌가 존재하지 않습니다.");
		}
		
	}
	//계좌번호, 비밀번호, 출금액을 전달받아서 출금액만큼 반환하는 서비스
	long withdrawFromBanking(String no, int pwd, long money) {
		long withdrawMoney = 0;
		Banking banking = new Banking();
		
		isExistNo = banking.isExistNo(db, no, pwd);
		if(isExistNo) {
			find = banking.foundBankNo(db, no, pwd);
		}else {
			System.out.println("잘못된 계좌번호입니다. 다시 입력해주세요");
		}
		if(find != null) {
			if(find.balance >= money + 1300) {
				if(find.password == pwd) {
					find.balance -= (money + 1300);
					withdrawMoney = money;	
					System.out.println("출금이 완료되었습니다.");
					System.out.println("출금 후 잔액은 " + find.balance +" 원 입니다.");
					
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
				
			}else {
				System.out.println("잔액이 부족합니다.");
			}
		}
		
		return withdrawMoney;
		
	}
	//계좌번호, 비밀번호를 전달받아서 해지하고, 해지금액 전체를 반환하는 서비스
	long closeBanking(String no, int pwd) {
		Banking banking = new Banking();
		long finalMoney = 0L;
		
		isExistNo = banking.isExistNo(db, no, savePoint);
		find = banking.foundBankNo(db, no, pwd);
		
		if(isExistNo) {
			if(find.password == pwd) {
				finalMoney = find.balance + (long)(find.balance * Bangking.RATE_OF_INTEREST*find.period/12);
				//계좌정보 폐기
				find.name = null;
				no = null;
				find.password = 0;
				find.balance = 0L;
				find.period = 0;
				System.out.println("해지가 완료되었습니다.");
				System.out.println("출금한 금액 : " + finalMoney);
			}else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}else {
			System.out.println("잘못된 계좌번호입니다. 다시 입력해주세요");
		}
		
		return finalMoney;
	}
	//비밀번호 변경 서비스 , 계좌번호, 기존 비밀번호, 바꿀비밀번호를 받아서 비밀번호수정
	void changePassword(String no, int oldPwd, int newPwd) {
		Banking banking = new Banking();
		
		isExistNo = banking.isExistNo(db, no, savePoint);
		find = banking.foundBankNo(db, no, oldPwd);
		
		if(isExistNo) {
			if(oldPwd == find.password) {
				find.password = newPwd;
				System.out.println("새비밀번호로 변경되었습니다.");
			}else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
			
		}else {
			System.out.println("잘못된 계좌번호입니다. 다시 입력해주세요");
		}
		
	}
	
}
