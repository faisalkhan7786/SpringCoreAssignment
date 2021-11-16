package com.SpringBanking;

public abstract class BankAccountRepositoryImpl implements BankAccountRepository {
	private void BankAccountRepositoryImplementation()
	{
		BankAccount bankAccount = new BankAccount();
		bankAccount.setAccountHolderName("Faisal");
		bankAccount.setAccountId(12);
		bankAccount.setAccountType("Savings");
		bankAccount.setAccountBalance((long) 20000.222);
	}
}
