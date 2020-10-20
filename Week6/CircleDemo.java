import java.util.Scanner;
class CircleDemo
{
    double radius;
    double area;
    double circum;
    void getData()
    {
        System.out.println("Enter radius:");
        Scanner sc=new Scanner(System.in);
        radius=sc.nextDouble();
    }
    void calc_area()
    {
        area=3.14*radius*radius;
    }
    void calc_circum()
    {
        circum=2*3.14*radius;
    }
    void display()
    {
        System.out.println("Radius : "+radius+"\nArea : "+area+"\nCircumference : "+circum);
    }


    public static void main(String args[])
    {
        CircleDemo ob=new CircleDemo();
        ob.getData();
        ob.calc_area();
        ob.calc_circum();
        ob.display();
    }
}