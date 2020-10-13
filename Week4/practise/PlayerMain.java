import java.util.Scanner;
class player
{
	int id;
	String name;
	int nm;
	int[] scores=new int[10];
	float avg;
	player(){
		id=1;
		name="abcd";
		nm=1;

	}
	void average()
	{	avg=0;
		for(int i=0;i<nm;i++)
		{
			avg=avg+scores[i];
		}
		avg=avg/nm;
	}
	void display()
	{
		System.out.println("Name :"+name+"\nID : "+id+"\nAverage: "+avg);
	}
	void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		name=sc.next();
		System.out.println("Enter id:");
		id=sc.nextInt();
		System.out.println("Enter number of matches:");
		nm=sc.nextInt();
		for(int i=0;i<nm;i++)
		{
			System.out.println("Enter score of match : "+(i+1));
			scores[i]=sc.nextInt();
		}
	}
}
class PlayerMain
{
	public static void main(String args[])
	{
		player p1=new player();
		player p2=new player();
		System.out.println("Player 1:");
		p1.getData();
		p1.average();

 		System.out.println("Player 2:");
		p2.getData();
		p2.average();
		System.out.println("Player 1 details:\n---------");
		p1.display();
		System.out.println("Player 2 details:\n---------");
		p2.display();
		if(p1.avg>p2.avg)
		{
			System.out.println("Player 1 has greater average!");
		}
		else
		{
			System.out.println("Player 2 has greater average!");
		}
	}
}		

