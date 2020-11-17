package cie;
import java.util.Scanner;
public class Internals extends cie.Student
{
    public float[] cie_marks=new float[5];
    public void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter CIE marks:");
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter marks in subject "+(i+1)+"(out of 50):");
            cie_marks[i]=sc.nextFloat();
        }
    }
}