import java.util.Scanner;
class WrongAge extends Exception
{
    String err_msg;
    WrongAge(String str)
    {
        err_msg=str;
    }
    public String toString()
    { 
        return ("Exception Occurred: "+err_msg) ;
    }
}
class Father
{
    int fage;
}
class Son extends Father{
    int sage;
    Son(int son_age,int f_age)
    {
        this.sage=son_age;
        super.fage=f_age;
        try
        {
            if(this.sage>=super.fage)
            {   
                throw new WrongAge("Age of Son can't be more than or equal to that of father!!");
            }
        }
        catch(WrongAge exp)
        {
            System.out.println(exp);
        }
    }

}
public class exMain{
    public static void main(String args[])
   {    
        int fage,sage;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter father's age:");
        fage=sc.nextInt();
        System.out.println("Enter Son's age:");
        sage=sc.nextInt();
        Father f=new Father();
        Son s=new Son(sage,fage);
    }
}