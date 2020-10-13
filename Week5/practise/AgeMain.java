import java.util.Scanner;
class Age
{
    int years;
    int months;
}
public class AgeMain
{
    public static void main(String args[])
    {
        Age p1=new Age();
        Age p2=new Age();
        System.out.println("Enter age of Person1:");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter years:");
        p1.years=sc.nextInt();
        System.out.println("Enter Months:");
        p1.months=sc.nextInt();
        
        System.out.println("Enter age of Person2:");
        System.out.println("Enter years:");
        p2.years=sc.nextInt();
        System.out.println("Enter Months:");
        p2.months=sc.nextInt();
        
        if(p1.years*12+p1.months>p2.years*12+p2.months)
        {
            System.out.println("Person 1 is elder!");
        }
        else
        {
            System.out.println("Person 2 is elder!");
        }
        
        
    }
}