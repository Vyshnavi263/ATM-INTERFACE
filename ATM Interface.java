package Atm;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args)
      {

		int Balance=80000,Withdraw=0,Deposit=01,choice,Account,Amount;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Welcome to ATM");
			System.out.println("Select 1 for WITHDRAWAL");
			System.out.println("Select 2 for DEPOSIT");
			System.out.println("Select 3 for TRANSFER");
			System.out.println("Select 4 for TRANSACTION HISTORY");
			System.out.println("Select 5 for EXIT");
			System.out.println("Select the appropriate operation:");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Please Enter the Withdrawal Amount:");
				Withdraw=sc.nextInt();
				if(Withdraw<=Balance)
				{
					Balance=Balance-Withdraw;
					System.out.println("Please collect the Cash");
					System.out.println("WITHDRAWAL IS SUCCESSFULL");
					System.out.println("Available balance:"+Balance);
				}
				else
				{
					System.out.println("YOUR ACCOUNT DOESNT HAVE A SUFFICIENT BALANCE");
				}
				System.out.println(" ");
				break;
			case 2:
				System.out.println("Enter the deposit amount:");
				Deposit=sc.nextInt();
				Balance=Balance+Deposit;
				System.out.println("YOU HAVE SUCCESSFULLY DEPOSITED THE AMOUNT");
				System.out.println(" ");
				break;
			case 3:
				System.out.println("Please enter your 'To Account Number': ");
				Account =sc.nextInt();
				System.out.println("Please enter the amount to transfer:");
				Amount =sc.nextInt();
				System.out.println("MONEY IS SUCCESSFULLY TRANSFERED");
				System.out.println(" ");
				break;
			case 4:
				System.out.println("Withdrawal Amount:"+Withdraw);
				System.out.println("Deposited Money:"+Deposit);
				System.out.println("Balance:"+Balance);
				System.out.println(" ");
				break;
			case 5:
				System.out.println("Exit");
				System.exit(0);
					
			}
			
		}

	}

}

