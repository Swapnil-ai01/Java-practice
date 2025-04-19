import java.util.Scanner;

class Publication{
    String title,authors;
    double price;
    void getdata(Scanner sc){
        System.out.print("Enter title: ");
        title = sc.nextLine();
        System.out.print("Enter auther name: ");
        authors = sc.nextLine();
        System.out.print("Enter price: ");
        price = sc.nextDouble();
        sc.nextLine();
    }
    void display(){
        System.out.println("Title: "+title);
        System.out.println("Authors: "+authors);
        System.out.println("Price: "+price);
    }
}
class Books extends Publication{
    int pcount;
    void getdata (Scanner sc){
        super.getdata(sc);
        System.out.print("Enter page count: ");
        pcount = sc.nextInt();
        sc.nextLine();
    }
    void display(){
        super.display();
        System.out.print("Page Count: "+pcount);
    }
}
class Ebooks  extends Publication{
    double ptime;
    void getdata(Scanner sc){
        super.getdata(sc);
        System.out.print("Enter playing in hours: ");
        ptime = sc.nextDouble();
        sc.nextLine();
    }
    void display(){
        super.display();
        System.out.println("Playing Time: "+ptime+" hours");
    }
}
public class Task33 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book Details");
        Books book =new Books();
        book.getdata(sc);
        System.out.println("Book Details");
        book.display();
        System.out.println("\nEnter Ebook Details");
        Ebooks ebook=new Ebooks();
        ebook.getdata(sc);
        System.out.println("Ebook Details: ");
        ebook.display();
        sc.close();
    }
}
