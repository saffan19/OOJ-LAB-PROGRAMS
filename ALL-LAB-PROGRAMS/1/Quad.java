import java.util.Scanner;
import java.lang.Math;
public class Quad{
	public static void main(String args[])
	{
		System.out.println("Enter values of a,b and c of a quadratic equation:");
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		double d,x1,x2;
		d=b*b-4*a*c;
		if(d<0)
		{
			System.out.println("Equation does not have any real roots!");
		}
		else
		{
			x1=(-b+Math.sqrt(d))/(2*a);
			x2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("Roots are:\nx1="+x1+"\nx2="+x2);
		}
	}
}
			

