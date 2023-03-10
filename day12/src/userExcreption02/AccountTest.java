package userExcreption02;

import java.io.NotSerializableException;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(100000);
		System.out.println("잔액 : " + account.getBalnce());

		try {
			account.withdraw(150000);
		} catch (NotSerializableException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("잔액 : " + account.getBalnce());
	}

}

