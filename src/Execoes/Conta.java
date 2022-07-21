package Execoes;

public class Conta {
	
	private int number;
	private String holder;
	private double balance;
	private double withdrawLimit;
	
	public Conta() {
		
	}
	
	public Conta(int number, String holder, double balance, double withdrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}	

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double deposit) {
		this.balance += deposit;
	}
	
	public void withdraw(double withdraw) {
		validateWithdraw(withdraw);
		this.balance -= withdraw;
	}	
		
	private void validateWithdraw(double amount) {
		if(amount > getWithdrawLimit()) {
			throw new ExceptionLimit("Quantia excede o limite de saque");
	}	if(amount > getBalance()) {
			throw new ExceptionLimit("Saldo insuficiente");
	}
		

}

	}
