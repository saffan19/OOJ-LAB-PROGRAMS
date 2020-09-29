import java.util.Scanner;
public class Array{
	public static void main(String args[])
	{
		int n,sume=0,sumo=0,i;
		System.out.println("Enter size of array:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] a=new int[n];		
		for(i=0;i<n;i++)
		{	
			System.out.println("Enter the array element "+i+1);
			a[i]=sc.nextInt();
			if(i%2==0)
			{
				sume=sume+a[i];
			}
			else
			{
				sumo=sumo+a[i];
			}
		}
		
		System.out.println("Sum of even terms:"+sume);
		System.out.println("Sum of odd terms:"+sumo);
	}
}