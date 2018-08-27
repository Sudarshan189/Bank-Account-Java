package com.sudarshan.day4.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sudarshan.day4.BankAccount;
import com.sudarshan.day4.SavingBankAccount;


class BankAccountTest {
	BankAccount account;
	BankAccount account1;

	@BeforeEach
	void setUp() {
		account = new SavingBankAccount("John", 50000, true);
		account1 = new SavingBankAccount("John", 50000, true);
	}

	@Test
	void testWithdraw() {
		assertEquals(45000.0, account.withdraw(5000), 0.04);
		assertEquals(38000.0, account.withdraw(7000), 0.04);
		assertEquals(33432.66, account.withdraw(4567.34), 0.04);
		assertEquals(33432.66, account.withdraw(120000), 0.04);
//		assertEquals(1, BankAccount.totalBankAccounts());
	}

//	@Test
//	void testDeposit() {
//		assertEquals(55000.0, account.deposit(5000));
//		assertEquals(59567.34, account.deposit(4567.34));
//		assertEquals(1, BankAccount.totalBankAccounts());
//	}
	@Test
	void totalBankAcounts() {
		assertEquals(2, BankAccount.totalBankAccounts());
	
	}

	@AfterEach
	void tearDown() {
		BankAccount.totalAccounts = 0;
	}
}