package newP;
class Book {
	String title;
	String author;
	double price;
	Book(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public void displayDetails() {
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Price: "+price);
	}
}
class Ebook extends Book{
	double fileSize;
	Ebook(String title,String author,double price,double fileSize){
		super(title,author,price);
		this.fileSize=fileSize;
		
  }
  public void displayDetails() {
		super.displayDetails();
		System.out.println("File size: "+fileSize);
	}
 
}
class PrintedBook extends Book{
	int noOfPages;
	PrintedBook(String title,String author,double price,double fileSize,int noOfPages){
		super(title,author,price);
		this.noOfPages=noOfPages;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("No. of pages: "+noOfPages);
	}
}
public class Inhert {
   public static void main(String[] args) {
	   Ebook ebook=new Ebook("Wing","apj",250.4,55.6);
	   PrintedBook printedBook=new PrintedBook("Laws","Newton",300.40,69.2,600);
	   printedBook.displayDetails();
	   System.out.println();
	   ebook.displayDetails();
	   
   }
}
