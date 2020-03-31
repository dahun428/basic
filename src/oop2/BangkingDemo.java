package oop2;

public class BangkingDemo {

	public static void main(String[] args) {

		Bangking bank = new Bangking("정다훈", "11-1111-1100", 1234, 2000000, 6);
		
		//현재 계좌정보 조회
		bank.display();
		
		//입금하기
		bank.deposit(500000);
		bank.display();
		
		//출금하기
		bank.withdraw(50000, 1121);
		bank.withdraw(1000, 1234);
		bank.display();
		
		//해지하기
		long money = bank.close(1234);
		System.out.println("최종해지 금액 : " + money + " 원");
		bank.display();
	}

}
