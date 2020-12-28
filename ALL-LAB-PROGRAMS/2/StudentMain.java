import java.util.Scanner;
class Student
{
	private String usn;
	private String name;
	private int[] credits=new int[5];
	private int[] marks=new int[5];
	void getData()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter student usn");
		usn=s1.next();
		System.out.println("Enter student name");
		name=s1.next();
		int i;
		for(i=0;i<5;i++)
		{
		System.out.println("Enter credits of subject"+(i+1));
		credits[i]=s1.nextInt();
		System.out.println("Enter marks of subject"+(i+1));
		marks[i]=s1.nextInt();
		}
	}
	float calculate()
	{
		int i=0,gpa;
		float total=0,td=0;
		for(i=0;i<5;i++)
		{	if(marks[i]>=90)
				gpa=10;
			else if(marks[i]>=80)
				gpa=9;
			else if(marks[i]>=70)
				gpa=8;
			else if(marks[i]>=60)
				gpa=7;
			else if(marks[i]>=50)
				gpa=6;
			else if(marks[i]>=40)
				gpa=5;
			else
				gpa=3;
			total=total+credits[i]*gpa;
			td=td+credits[i];
		}
		return (total/td);
	}
	void display()
	{
		System.out.println("USN :"+usn);
		System.out.println("Name :"+name);
		System.out.println("Sgpa :"+calculate());
	}

}
public class StudentMain
{
	public static void main(String args[])
	{
		Student s=new Student();
		s.getData();
		s.display();
	}
}
		
		
