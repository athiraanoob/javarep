package iteration;
import java.util.Scanner;

public class CreditLimitCalculator {
	public int newbal(int bal,int cha,int cred)
	{
		int newba=bal+cha-cred;
		return newba;
	}
	public boolean checking(int bal,int limit)
	{
		if(bal>limit)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		int acno,i=1;
		int balance,charges,credits,allowLimit;
		CreditLimitCalculator cr=new CreditLimitCalculator();
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number of customers");
		int n=scn.nextInt();
		while(i<=n)
		{
		 System.out.println("Enter the "+i+"th customer details");
		 System.out.println("enter the customer Account number");
		 acno=scn.nextInt();
		 System.out.println("Enter the balance");
		 balance=scn.nextInt();
		 System.out.println("enter the charges");
		 charges=scn.nextInt();
		 System.out.println("enter the credits");
		 credits=scn.nextInt();
		 System.out.println("Enter the allowable limit");
		 allowLimit=scn.nextInt();
		 int newbalance=cr.newbal(balance,charges,credits);
		 System.out.println("The new balance of account with account number "+acno+" is "+newbalance);
		 boolean b=cr.checking(newbalance,allowLimit);
		 if (b==true)
		 {
			 System.out.println("Credit Limit Exceeded");
		 }
		 else
		 {
			 System.out.println("There is no change in credit limit");
		 }
		 i++;
		}
	
		

	}

}
