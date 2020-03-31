package oop2;

/**
 * 계좌에 대한 입금기능, 출금기능, 조회기능, 비밀번호 변경 기능, 해지기능을 제공하는 클래스
 * @author JHTA
 *
 */

public class Bangking {

	static final double RATE_OF_INTEREST = 0.021;
	String name; //소유주
	String no; //계좌번호
	int password; // 패스워드
	long balance; // 잔액
	int period; // 기간
	
	
	//뱅킹 입력
	public Bangking(String name, String no, int password, long balance, int period) {
		this.name = name;
		this.no = no;
		this.password = password;
		this.balance = balance;
		this.period = period;
	}

	public Bangking() {}

	/**
	 * 입금기능
	 */
	void deposit(long money) {
		balance += money;
		System.out.println("입금이 완료되었습니다.");
		System.out.println("현재 잔액은 " + balance +" 원 입니다.");
	}
	
	/**
	 * 출금기능
	 * @return
	 */
	long withdraw(long money, int pwd) {
		long withdrawMoney = 0;

		if(balance >= money + 1300) {
			if(password == pwd) {
				balance -= (money + 1300);
				withdrawMoney = money;	
				System.out.println("출금이 완료되었습니다.");
				System.out.println("출금 후 잔액은 " + balance +" 원 입니다.");
				
			}else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
			
		}else {
			System.out.println("잔액이 부족합니다.");
		}
		
		return withdrawMoney;
	}
	
	/**
	 * 조회기능
	 */
	void display() {
		System.out.println("-----------계좌 정보-----------");
		System.out.println("예 금 주 : " + name);
		System.out.println("계좌번호 : " + no);
		System.out.println("현재잔액 : " + balance);
		System.out.println("적금기간 : " + period + " 개월");
		System.out.println("금    리 : " + Bangking.RATE_OF_INTEREST * 100 + "%");
		System.out.println("-----------------------------");
	}
	
	void changePassword(int oldPwd, int newPwd) {
		if(password == oldPwd) {
			password = newPwd;
			System.out.println("새비밀번호로 변경되었습니다.");
		}else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
	}
	
	long close(int pwd) {
		long finalMoney = 0L;
		if(password == pwd) {
			finalMoney = balance + (long)(balance * Bangking.RATE_OF_INTEREST*period/12);
			//계좌정보 폐기
			name = null;
			no = null;
			password = 0;
			balance = 0L;
			period = 0;
			System.out.println("해지가 완료되었습니다.");
			System.out.println("출금한 금액 : " + finalMoney);
		}else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
		
		return finalMoney;
	}
	
	//계좌번호 존재여부 메소드
	boolean isExistNo(Bangking[] banks, String no, int savePoint) {
		boolean isExistNo = false;
		
		for(int i = 0; i < savePoint; i++) {
			Bangking bank = banks[i];
			if(no.equals(bank.no)) {
				isExistNo = true;
				break;
			}
		}
		return isExistNo;
	}
	
	//계좌번호 넘버 반환 메소드
	Bangking foundBankNo(Bangking[] banks, String no, int savePoint) {
		Bangking foundBankNo = null;
		
		for(int i = 0; i < savePoint; i++){
			Bangking bank = banks[i];
			if(no.equals(bank.no)) {
				foundBankNo = bank;
				break;
			}
		}
		
		return foundBankNo;
	}
	
	
}
