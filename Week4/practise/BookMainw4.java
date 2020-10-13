import java.util.Scanner;
class Book
{
    int id;
    String title;
    String author;
    float price;
    int pages;
    int year;
    void getData()
    {
        System.out.println("Enter book id:");
        Scanner sc=new Scanner(System.in);
        id=sc.nextInt();
        System.out.println("Enter Book title:");
        title=sc.next();
        System.out.println("Enter Book author:");
        author=sc.next();
        System.out.println("Enter Book price:");
        price=sc.nextFloat();
        System.out.println("Enter number of pages:");
        pages=sc.nextInt();
        System.out.println("Enter year of publications:");
        year=sc.nextInt();
        
    }
    void display()
    {   System.out.println("BOOK DETAILS:\n-----------");
        System.out.println("BOOK ID"+id);
        System.out.println("BOOK NAME"+title);
        System.out.println("BOOK AUTHOR"+author);
        System.out.println("BOOK PRICE"+price);
        System.out.println("NO OF PAGES"+pages);
        System.out.println("YEAR OF PUBLICATION"+year);
    }
}
public class BookMainw4
{
    public static void main(String args[]){
    Book b1=new Book();
    Book b2=new Book();
    Book b3=new Book();
    b1.getData();
    b2.getData();
    b3.getData();
    b1.display();
    b2.display();
    b3.display();
    if(b1.price>b2.price && b1.price>b3.price)
    {
        System.out.println("Most expensive book :"+b1.title);
    }
    else if(b2.price>b1.price && b2.price>b3.price)
    {
        System.out.println("Most expensive book :"+b2.title);
    }
    else
    {
        System.out.println("Most expensive book :"+b3.title);
    }
    int c=0;
    if(b1.year==2020){c=c+1;}
    if(b2.year==2020){c=c+1;}
    if(b3.year==2020){c=c+1;}
    System.out.println("Number of books published in 2020: "+c);
}
    
}