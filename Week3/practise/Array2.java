import java.util.Scanner;
public class Array2{
	public static void main(String args[])
	{
		int n,even=0,odd=0,i;
		System.out.println("Enter n:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter element "+(i+1));
			a[i]=sc.nextInt();
			if(a[i]%2==0)
			{even=even+1;}
			else
			{odd=odd+1;}
		}
		System.out.println("Number of even terms:"+even+"\nNumber of odd terms:"+odd);
	}
}