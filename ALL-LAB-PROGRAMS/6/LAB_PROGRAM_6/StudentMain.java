import cie.*;
import see.*;
import java.util.Scanner;
public class StudentMain
{
    public static void main(String args[])
    {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students:");
        n=sc.nextInt();
        cie.Student[] s=new cie.Student[n];
        cie.Internals[] io=new cie.Internals[n];
        see.Externals[] e=new see.Externals[n];
        float [][]final_marks=new float[n][5];
        for(i=0;i<n;i++)
        {
            s[i]=new cie.Student();
            io[i]=new cie.Internals();
            e[i]=new see.Externals();
            System.out.println("Enter Student details of student "+(i+1)+":\n----------------------------------");
            s[i].getdata();
            io[i].getdata();
            e[i].getdata();
        }
        System.out.println("Student details:\n*****************");
        for(i=0;i<n;i++)
        {
            System.out.println("NAME:"+s[i].name+"\nUSN:"+s[i].usn+"\nSEM:"+s[i].sem+"\nFINAL MARKS:");
            for(j=0;j<5;j++)
            {
                final_marks[i][j]=io[i].cie_marks[j]+(e[i].see_marks[j]/2);
                System.out.println("Subject"+(j+1)+": "+final_marks[i][j]);
            }
            System.out.println("--------");
        }
    }
}
