import java.io.*;
public class CmdArray
{
    public static void main(String a[])
    {
        int n=a.length;
        double[] b=new double[n];
        int i,j;
        for(i=0;i<n;i++)
        {
            b[i]=Double.parseDouble(a[i]);
        }
        System.out.println("The array is :");
        for(i=0;i<n;i++)
        {
            System.out.print(b[i]+" ");
        }
        System.out.println("");
        double[] c=new double[n];
        double temp;
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                if(b[i]>b[j])
                {
                    temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for(i=0;i<n;i++)
        {
            System.out.print(b[i]+" ");
        }

    }
}