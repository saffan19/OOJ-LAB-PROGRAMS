class sum_odd extends Thread
{
    int sum=0;
    public void run(){
    for(int i=0;i<=100;i++)
    {
        if(i%2!=0)sum=sum+i;
    }
    System.out.println("SUM OF ODD:"+sum);
    }
}
public class threadMainex1
{
    public static void main(String args[])
    {
        sum_odd so=new sum_odd();
        so.start();
        int sum=0;
        for(int i=0;i<=100;i++)
        {
            if(i%2==0)sum=sum+i;
        }
        System.out.println("SUM OF EVEN:"+sum);
    }
}