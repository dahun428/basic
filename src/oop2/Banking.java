package oop2;

/**
 * 계좌에 대한 입금기능, 출금기능, 조회기능, 비밀번호 변경 기능, 해지기능을 제공하는 클래스
 * @author JHTA
 *
 */

public class Banking {

	static final double RATE_OF_INTEREST = 0.021;
	String name; //소유주
	String no; //계좌번호
	int password; // 패스워드
	long balance; // 잔액
	int period; // 기간
	
	
	//뱅킹 입력
	public Banking(String name, String no, int password, long balance, int period) {
		this.name = name;
		this.no = no;
		this.password = password;
		this.balance = balance;
		this.period = period;
	}

	public Banking() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public static double getRateOfInterest() {
		return RATE_OF_INTEREST;
	}

	//계좌번호 존재여부 메소드
	boolean isExistNo(Banking[] banks, String no, int savePoint) {
		boolean isExistNo = false;
		
		for(int i = 0; i < savePoint; i++) {
			Banking bank = banks[i];
			if(no.equals(bank.no)) {
				isExistNo = true;
				break;
			}
		}
		return isExistNo;
	}
	
	//계좌번호 넘버 반환 메소드
	Banking foundBankNo(Banking[] banks, String no, int savePoint) {
		Banking foundBankNo = null;
		
		for(int i = 0; i < savePoint; i++){
			Banking bank = banks[i];
			if(no.equals(bank.no)) {
				foundBankNo = bank;
				break;
			}
		}
		
		return foundBankNo;
	}
	
	
}
