import java.util.Scanner;
abstract class Shapes{
	int a;
	int b;
	abstract void printArea();
}
class Rectangle extends Shapes{
	void printArea()
	{
		System.out.println("Area of Rectangle: "+a*b);
	}
}
class Circle extends Shapes{
	void printArea()
	{
		System.out.println("Area of Circle: "+3.14*a*a);
	}

}
class Triangle extends Shapes{
	void printArea()
	{
		System.out.println("Area of Triangle: "+0.5*a*b);
	}

}
public class ShapesMain{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Rectangle r=new Rectangle();
		Circle c=new Circle();
		Triangle t=new Triangle();
		int check=1,choice;
		while(check==1)
		{
			System.out.println("Enter choice:\n1)Rectangle\n2)Circle\n3)Triangle\n4)Exit");
			choice=sc.nextInt();
			switch(choice)
			{
			    case 1:	System.out.println("Enter length and breadth of Rectangle:");
						r.a=sc.nextInt();
						r.b=sc.nextInt();
						r.printArea();
				case 2: System.out.println("Enter radius of Circle:");
						c.a=sc.nextInt();
						c.printArea();
				case 3: System.out.println("Enter height and base of triangle:");
						t.a=sc.nextInt();
						t.b=sc.nextInt();
						t.printArea();
				default:check=0;
		
		
		
	    }
	    }
	}
}