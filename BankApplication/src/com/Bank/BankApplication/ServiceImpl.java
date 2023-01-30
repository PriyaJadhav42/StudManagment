package com.Bank.BankApplication;

import java.util.Scanner;

public class ServiceImpl implements ServiceI {
	Scanner sc= new Scanner(System.in);
	Account acc= new Account();
	@Override
	public void createAccount() {
				
		System.out.println("Enter your account Number");
		int accno = sc.nextInt();
		acc.setAccNo(accno);
		
		System.out.println("Enter your Name");
		String name = sc.next();
		acc.setAccName(name);

		System.out.println("Enter your address");
		String addr = sc.next();
		acc.setAccAddr(addr);

		System.out.println("Enter your pan no");
		String panno = sc.next();
		acc.setAccPan(panno);

		System.out.println("Enter amount you want to deposit");

		double amt = sc.nextDouble();
		acc.setAccamt(amt);

		System.out.println("Account created successfully");

	}
	

	@Override
	public void viewAccount() {
		System.out.println("=========User Account Details========");
		System.out.println("AccNo: "+ acc.getAccNo());
		System.out.println("AccName: "+acc.getAccName());
		System.out.println("AccAddress: "+acc.getAccAddr());
		System.out.println("AccPan : "+acc.getAccPan());
		System.out.println("AccBalance: "+acc.getAccamt());

		//System.out.println("By using toString Method");
		System.out.println(acc);
		
	}

	@Override
	public void withdrawMoney() {
		System.out.println("Enter account Number");

		int userAcc = sc.nextInt();

		if (userAcc == acc.getAccNo()) {
			System.out.println("Enter amount that you want to withdraw");
			double userAmt = sc.nextDouble();
			if (userAmt < acc.getAccamt()) {

				double remainingAmount = acc.getAccamt() - userAmt;

				acc.setAccamt(remainingAmount);
				System.out.println("Withdraw Successful");
			System.out.println("Your current balance is:" + acc.getAccamt());
			} else {
				System.out.println("Insufficient Amount");
			}

		} else {
			System.out.println("Invalid account Number");
		}

	}
		

	@Override
	public void depositMoney() {
		System.out.println("Enter account Number");

		int userAcc = sc.nextInt();

		if (userAcc == acc.getAccNo()) {
			System.out.println("Enter amount that you want to Deposite");
			double userAmt = sc.nextDouble();
			
			double remainingAmount = acc.getAccamt() + userAmt;

				acc.setAccamt(remainingAmount);
				System.out.println("=======Deposite Money Is Successful=======");
			System.out.println("Your current balance is:" + acc.getAccamt());
			} 
	
else {
			System.out.println("Invalid account Number");
		}
	}

	@Override
	public void updateAccount() {
		System.out.println("Enter account number");
		int userAcc = sc.nextInt();
		boolean flag=true;
		if(userAcc==acc.getAccNo()) {
		while(flag) {
		System.out.println("Press 1 for update Name");
		System.out.println("Press 2 for update Address");
		System.out.println("Press 3 for update Pan");
		System.out.println("Press 4 for Exit");
		
		int ch = sc.nextInt();

		switch (ch) {

	case 1:
			System.out.println("Enter name you want to update");
			String name = sc.next();
			acc.setAccName(name);
			System.out.println("Your update Name is :"+ acc.getAccName());
			break;
			
	case 2:System.out.println("Enter Adress you want to update");
		String add = sc.next();
		acc.setAccAddr(add);
		System.out.println("Your update Adress is :"+ acc.getAccAddr());
			break;
			
	case 3:System.out.println("Enter pan no. You want to update");
		String pno = sc.next();
		acc.setAccPan(pno);
		System.out.println("Your update Your pan no. is :"+ acc.getAccPan());
			break;
			
	case 4: flag= false;
			break;
		default:System.out.println("Invalid Choice");
			break;
		}
		}
	}
		else
		{
			System.out.println("Invalid Account Number");
		}	
	}
	
}