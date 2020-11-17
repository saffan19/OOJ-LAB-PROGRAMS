package see;
import cie.*;
import java.util.Scanner;
public class Externals extends cie.Student
{
    public float[] see_marks=new float[5];
    public void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter SEE marks:(out of 100)");
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter marks in subject "+(i+1)+":");
            see_marks[i]=sc.nextFloat();
        }
    }

}