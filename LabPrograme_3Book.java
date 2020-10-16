
import java.util.Scanner;
 class TestBook {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number of Books:");
	int n = sc.nextInt();
	Book B[]= new Book[n];
	for(int i=0;i<n;i++) {
		B[i] = new Book();
	}
	for(int i=0;i<n;i++) {
		System.out.println(B[i]);
	System.out.println();}
}
}
class Book{
	String book_name,book_author ;
	int price,num_pages;
	Book(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Name of The book:\t");
		book_name = sc.nextLine();
		System.out.print("Enter the Author of book "+book_name+":\t");
		book_author = sc.nextLine();
		System.out.print("Enter the Price of book "+book_name+":\t");
		price = sc.nextInt();
		System.out.print("Enter the Number of pages:\t");
		num_pages = sc.nextInt();
		sc.nextLine();
		System.out.println();
	}
	public String toString() {
		return("Name of Book : "+this.book_name+"\nAuthor : "+this.book_author+"\nPrice : "+this.price+"\nNumber of Pages: "+this.num_pages);
	}
}
