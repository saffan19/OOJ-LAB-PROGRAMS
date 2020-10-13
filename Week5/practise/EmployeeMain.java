import java.util.Scanner;
class Employee
{
    int id;
    String name;
    int hrs;
    double basic,hra,da,it;
    double gross;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ID:");
        id=sc.nextInt();
        System.out.println("Enter NAME:");
        name=sc.next();
        System.out.println("Enter number of working hours:");
        hrs=sc.nextInt();
        System.out.println("Enter basic salary:");
        basic=sc.nextFloat();
        System.out.println("Enter HRA:");
        hra=sc.nextFloat();
        System.out.println("Enter DA:");
        da=sc.nextFloat();
        System.out.println("Enter IT:");
        it=sc.nextFloat();
    }
    void calc()
    {
        gross=basic+basic*hra*0.01+basic*da*0.01-basic*it*0.01;
        gross=gross+(hrs-200)*100;	
        
    }
    void disp()
    {
        System.out.println("Salary : "+gross);
    }
}
public class EmployeeMain
{
    public static void main(String args[])
    {
        Employee e=new Employee();
        e.getData();
        e.calc();
        e.disp();
    }
}