package com.Bank.BankApplication;

import java.util.Scanner;

public class Admincontroller {
	
	public static void main(String[] args) {
		ServiceI serviceI = new ServiceImpl();

		boolean flag = true;
		while (flag) {

		System.out.println("*****WELCOME TO SBI BANK**********");
		System.out.println("Press 1 for create Account");
		System.out.println("Press 2 for view Account");
		System.out.println("Press 3 for withdraw money");
		System.out.println("Press 4 for deposit money");
		System.out.println("Press 5 for update Account");
		System.out.println("Press 6 for exit");

		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
				switch (ch) {
		case 1:
			
			serviceI.createAccount();
			break;
		case 2:
			
			serviceI.viewAccount();
			break;
		case 3:
			
			serviceI.withdrawMoney();
			break;
		case 4:
			
			serviceI.depositMoney();
			break;
		case 5:
			
			serviceI.updateAccount();
			break;
		case 6:
			System.out.println("Logic to exit");
			break;
		default:
			System.out.println("Invalid choice");
			break;

		}
		}
		}

	}
