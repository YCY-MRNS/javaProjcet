package pers.ycy.report.test2.title2;

public class BankExample {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.setAccount("2018520612");
		account.setMoney(100);
		account.displayAccount();
		account.saveMoney(100);
		account.getAccountMoney(10);
	}

}
