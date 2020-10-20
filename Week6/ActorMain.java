import java.util.Scanner;
class Actor
{
    int id;
    String name;
    int nmovies;
    int nexp;
    float avg;
    static float highavg;
    void getData()
    {
        System.out.println("Enter the id of actor:");
        Scanner sc=new Scanner(System.in);
        id=sc.nextInt();
        System.out.println("Enter name :");
        name=sc.next();
        System.out.println("Enter number of movies:");
        nmovies=sc.nextInt();
        System.out.println("Enter years of experience");
        nexp=sc.nextInt();
    }
    void calc()
    {
        avg=nmovies/nexp;
    }

}
public class ActorMain
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of actors:");
        int n,i;
        int p=-1;
        n=sc.nextInt();
        Actor[] obj=new Actor[n];
        Actor.highavg=0;
        for(i=0;i<n;i++)
        {
            obj[i]=new Actor();
            System.out.println("Enter details of actor"+(i+1));
            obj[i].getData();
            obj[i].calc();
            if(obj[i].avg>Actor.highavg)
            {
                Actor.highavg=obj[i].avg;
                p=i;
            }
        }

        System.out.println("Actor with the highest average is "+obj[p].name+" with the average of : "+obj[p].avg);
    }
}