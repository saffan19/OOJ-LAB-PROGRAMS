import java.io.*;
public class CmdArray
{
    public static void main(String a[])
    {
        int n=5;
        double[] b=new double[n];
        int i;
        for(i=0;i<n;i++)
        {
            b[i]=Double.parseDouble(a[i]);
        }
        System.out.println("The array is :");
        for(i=0;i<n;i++)
        {
            System.out.println(b[i]);
        }
    }
}