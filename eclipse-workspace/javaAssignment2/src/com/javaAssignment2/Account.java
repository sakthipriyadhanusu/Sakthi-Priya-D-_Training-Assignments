package com.javaAssignment2;

class BankAccount {
    protected String accountNo;
    protected double balance;

    public BankAccount(String accountNo, double balance) 
    {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void deposit(double amount) 
    {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) 
    {
        if (amount > balance) 
        {
            System.out.println("Insufficient balance");
        } 
        else 
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
}


class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNo, double balance, double interestRate) 
    {
        super(accountNo, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() 
    {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest Added: " + interest);
    }
}


class SalaryAccount extends BankAccount {
    double monthlySalary;

    public SalaryAccount(String accountNo, double balance, double monthlySalary) {
        super(accountNo, balance);
        this.monthlySalary = monthlySalary;
    }

    public void creditSalary() 
    {
        balance += monthlySalary;
        System.out.println("Salary Credited: " + monthlySalary);
    }
}

public class Account {

	public static void main(String[] args) 
	{
		 SavingsAccount sa = new SavingsAccount("SA101", 5000, 5);
	     sa.deposit(1000);
	     sa.withdraw(2000);
	     sa.addInterest();
	     System.out.println("Savings Account Balance: " + sa.balance);

	     SalaryAccount sal = new SalaryAccount("SAL202", 2000, 25000);
	     sal.creditSalary();
	     sal.withdraw(5000);
	     System.out.println("Salary Account Balance: " + sal.balance);
		

	}

}
