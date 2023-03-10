package userExcreption02;

import java.io.NotSerializableException;

public class Account {
	private int balance; //잔고
	public Object withdraw;
	
	public int getBalnce() { 	//잔고입력 메서드
		return balance;
		
	}
	
	public void deposit(int money) {
		balance += money;
		System.out.println(" 입금액 " + money +"원이  입금됨");
	}
	public void withdraw(int money) throws NotSerializableException {
	if (balance < money) {
		System.out.println("잔고부족 : " + (money - balance) + "원 부족하여 출금 할 수 없음.");
		return;
	}
	balance -= money;

	
	
	}
}