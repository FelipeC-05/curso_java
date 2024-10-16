package entities;

import exceptions.BusinessException;

public class Account {
	private Integer number;
	private  String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getwithdrawLimit() {
		return withdrawLimit;
	}

	public void setwithdrawLimit(Double withdraw) {
		this.withdrawLimit = withdraw;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		validateWithdraw(amount);
		balance -= amount;
	}
	
	private void validateWithdraw(double amount) {
		if(amount > getwithdrawLimit()) {
			throw new BusinessException("Erro de saque: A quantia excede o limite de saque.");
		}
		if (amount > getBalance()) {
			throw new BusinessException("Erro de saque: saldo insuficiente.");
		}
	}
	
	
	
}
