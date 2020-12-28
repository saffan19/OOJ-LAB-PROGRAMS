package cie;
import java.util.Scanner;

public class Student
{
    public String usn;
    public String name;
    public int sem;

    public void getdata()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter name:");
        name=sc.next();
        System.out.println("Enter usn:");
        usn=sc.next();
        System.out.println("Enter sem:");
        sem=sc.nextInt();
    }
}