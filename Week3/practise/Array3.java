import java.util.Scanner;
public class Array3{
	public static void main(String args[])
	{
		int i,min,max,ce=-1,co=-1,n,sum=0;
		float avg;
		System.out.println("Enter the size of array A:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[]a=new int[n];
		int[]b=new int[100];
		int[]c=new int[100];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter element "+(i+1));
			a[i]=sc.nextInt();
			if(ce==0)
			{
				min=c[0];
				max=c[0];
			}
			if(a[i]%2==0)
			{
				ce=ce+1;
				c[ce]=a[i];
				sum=sum+a[i];
				if(ce>0)
				{
				if(a[i]<min)
				{min=a[i];}
				else
				{max=a[i];}
				}
			}
			else
			{
				co=co+1;
				b[co]=a[i];
			}
		}
		System.out.println("Sum="+sum+"\nAverage="+(sum/(ce+1))+"\nMax of C:"+max+"\nMin 0f C:"+min);
	}
} 
