package pers.ycy.report.test2.title2;

public class BankAccount {
	private String account = "2018520612";
	private double money = 100.0;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	// 存款
	public void saveMoney(double money) {
		this.setMoney((this.getMoney() + money));
		System.out.println("你存入的金额为：" + money);
		System.out.println("你余额为：" + this.getMoney());

	}

	// 查询余额
	public void displayMeoney() {
		System.out.println("你余额为：" + this.getMoney());

	}

	// 显示帐号
	public void displayAccount() {

		System.out.println("账号为：" + this.account);

	}

	// 取款
	public void getAccountMoney(double money) {

		if (money <= this.money) {
			System.out.println("你取出的金额为：" + money);
			this.setMoney((this.getMoney() - money));
			System.out.println("你余额为：" + this.getMoney());

		} else {
			System.out.println("余额不足，取款失败！");
		}

	}

}
