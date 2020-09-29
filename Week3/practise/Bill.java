import java.util.Scanner;
public class Bill{
	public static void main(String args[])
	{
		int x,i;
		double total=0;
		System.out.println("Enter the number pf items:");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		int[]q=new int[x];
		double[]a=new double[x];
		for(i=0;i<x;i++)
		{
			System.out.println("Enter the price and quantity of item "+(i+1));
			a[i]=sc.nextDouble();
			q[i]=sc.nextInt();
			total=total+(a[i]*q[i]);
		}
		System.out.println("Total : "+total);
		if(total>=10000)
		{
			total=total-0.05*total;
		}
		if(total>=7500 && total<10000)
		{
			total=total-0.03*total;
		}
		if(total>=5000 && total<7500)
		{
			total=total-0.02*total;
		}
		System.out.println("Total after discount(if applicable): "+total);
		
	}
}



		
		