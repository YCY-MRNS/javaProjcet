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

	// ���
	public void saveMoney(double money) {
		this.setMoney((this.getMoney() + money));
		System.out.println("�����Ľ��Ϊ��" + money);
		System.out.println("�����Ϊ��" + this.getMoney());

	}

	// ��ѯ���
	public void displayMeoney() {
		System.out.println("�����Ϊ��" + this.getMoney());

	}

	// ��ʾ�ʺ�
	public void displayAccount() {

		System.out.println("�˺�Ϊ��" + this.account);

	}

	// ȡ��
	public void getAccountMoney(double money) {

		if (money <= this.money) {
			System.out.println("��ȡ���Ľ��Ϊ��" + money);
			this.setMoney((this.getMoney() - money));
			System.out.println("�����Ϊ��" + this.getMoney());

		} else {
			System.out.println("���㣬ȡ��ʧ�ܣ�");
		}

	}

}
