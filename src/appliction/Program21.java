package appliction;

import entities.Account3;
import entities.BusinessAccount2;
import entities.SavingsAccount;

public class Program21 {

	public static void main(String[] args) {

		Account3 acc = new Account3(1001, "Alex", 0.0);
		BusinessAccount2 bacc = new BusinessAccount2(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		
		Account3 acc1 = bacc;
		Account3 acc2 = new BusinessAccount2(1003, "Bob", 0.0, 200.0);
		Account3 acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
	
		// DOWNCASTING
		
		BusinessAccount2 acc4 = (BusinessAccount2)acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount2) {
			BusinessAccount2 acc5 = (BusinessAccount2)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}
}