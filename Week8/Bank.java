import java.util.Scanner;
import java.lang.Math;
class Account{
	String name;
	int acc_num;
	int type;
	double balance=0;
	void accept_deposit()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to be deposited");
		float depo;
		depo=sc.nextFloat();
		balance=balance+depo;
	}
	void withdraw()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to be withdrawn");
		float wd;
		wd=sc.nextFloat();
		balance=balance-wd;
	}
	void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of customer:");
		name=sc.next();
		System.out.println("Enter Account number:");
		acc_num=sc.nextInt();
		System.out.println("Press 1 for Savings account\nPress 2 for Curent Account");
		type=sc.nextInt();
	}
}
class Savings_acc extends Account{
	void calc_ci(float t)
	{
		double r=0.05;
		int n=12;
		double temp=balance;
		balance=balance*Math.pow((1+r/n),n*t);
		System.out.println("CI added:"+(balance-temp));

	}
	void display()
	{
		System.out.println("Balance:"+balance);
	}


}
class Curr_acc extends Account{

	void calc_penalty()
	{

			balance=balance-500;
	}
	void display()
	{	if(balance>5000)
		{
		System.out.println("Balance: "+balance);
		}
		else
		{
			System.out.println("Your account does not have minimum balance of rs5000,hence penalty rs500 is being charged");
			calc_penalty();
			System.out.println("Balance: "+balance);
		}
	}
}
public class Bank{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Account a=new Account();
		Curr_acc ca=new Curr_acc();
		Savings_acc s=new Savings_acc();
		a.getData();


		int c,choice;
		float t;
		c=a.type;
		if(c==1)
		{
			while(c==1)
			{
				System.out.println("Enter code of your choice of action:\n1)View Balance\n2)Deposit Amount\n3)Withdraw\n4)Exit");
				choice=sc.nextInt();
				switch(choice)
				{
					case 1:System.out.println("Enter the number of years after which balance is being checked(to calculate compound interest):");
							t=sc.nextFloat();
							s.calc_ci(t);
							s.display();
							break;
					case 2:s.accept_deposit();break;
					case 3:s.withdraw();break;
					default:c=0;
				}


			}
		}
		if(c==2)
		{
			while(c==2)
			{
				System.out.println("Enter code of your choice of action:\n1)View Balance\n2)Deposit Amount\n3)Withdraw\n4)Exit");
				choice=sc.nextInt();
				switch(choice)
				{
					case 1:ca.display();break;
					case 2:ca.accept_deposit();break;
					case 3:ca.withdraw();break;
					default:c=0;
				}


			}
		}
	}
}