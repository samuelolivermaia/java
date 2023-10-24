package appliction;

import entities.BusinessAccount;

public class Program20 {

	public static void main(String[] args) {

		BusinessAccount account2 = new BusinessAccount(8010, "Bob Brown", 0.0, 500.0);

		System.out.println(account2.getBalance());
	}
}
