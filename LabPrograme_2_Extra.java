Programe-1

import java.util.Scanner;
class TestPlayer{
	public static void main(String args[]) {
	int y;
		Scanner sc = new Scanner(System.in);
	String id[] = new String[2];
	String name[]= new String[2];
	double avg []= new double[2];
	int  scores [] = new int[2];
	int no_matches_played[] = new int[2];
	for(int i=0;i<2;i++) {
		System.out.println("Enter The Name, Id, Scores & No Matches Played");
		name[i] = sc.nextLine();
		id[i] = sc.nextLine();
		scores[i] = sc.nextInt();
		no_matches_played[i] = sc.nextInt();
		sc.nextLine();
	}
		Player p1 = new Player(id[0],name[0],no_matches_played[0],scores[0]);
		Player p2 = new Player(id[1],name[1],no_matches_played[1],scores[1]);
          avg[0] = p1.calculates();		
          avg[1] = p2.calculates();
          if(avg[0]> avg[1])
        	  y=0;
          else
        	  y=1;
          System.out.println("Player with Greatest Average Score:\n Name: "+name[y]+"\nId: "+id[y]+"\nScores: "+scores[y]+"\nNo Matches Played: "+no_matches_played[y]+"\nAverage Score: "+avg[0]);
          sc.close();
        	  
	}
}
class Player {
String id,name;
int scores,no_matches_played;
Player(String id,String name,int no_matches_played,int scores){
	this.id =id;
	this.name = name;
	this.no_matches_played= no_matches_played;
	this.scores = scores;
}
double calculates() {
	double avg = scores/(double)no_matches_played;
	System.out.println("Player: Name: "+name+"\tAverage Score: "+avg);
	return avg;
}
}

Programe-2
import java.util.*;
public class TestBook {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Book[] b = new Book[3];
		for(int i=0;i<b.length;i++) {
			b[i] = new Book();
			System.out.println("Enter the Id");
			b[i].setId(input.nextInt());
			input.nextLine();
			System.out.println("Enter the title");
			b[i].setTitle(input.nextLine());
			System.out.println("Enter the Author");
			b[i].setAuthor(input.nextLine());
			System.out.println("Enter the Year of publishing");
			b[i].setYear(input.nextLine());
			System.out.println("Enter the No. of pages");
			b[i].setNoOfPages(input.nextInt());
			System.out.println("Enter the Price of the book");
			b[i].setPrice(input.nextDouble());
		}
		System.out.println("\nShowing  based on year 2020:\n");
		Book.YearDisplay(b);
		System.out.println("\nShowing based on Expensive Book:\n");
		Book.Expensive(b);
		System.out.println("\nShowing  based on least no. of pages:\n");
		Book.leastPages(b);
		System.out.println("\nShowing  based on author-name :\n Enter the Author Name:");
		input.nextLine();
		String Ar = input.nextLine();
		Book.AuthorDisplay(b, Ar);
	}

}
class Book{
	int id=0;
	String title=null;
	int noOfPages=0;
	String year=null;
	String author=null;
	double price=0;
	public void setId(int id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void display() {
		System.out.println("Book Id: "+id);
		System.out.println("Book Name: "+title);
		System.out.println("Book NoOfPages: "+noOfPages);
		System.out.println("Year of publishing: "+year);
		System.out.println("Book Author: "+author);
		System.out.println("Book Price: "+price);
	}
	
	public static void AuthorDisplay(Book[] b,String author) {
		System.out.println();
		for(int i=0;i<b.length;i++) {
			if(b[i].author.equals(author)) {
				b[i].display();
			}
		}
	}
	
	public static void YearDisplay(Book[] b) {
		System.out.println();
		int a=0;
		for(int i=0;i<b.length;i++) {
			if(b[i].year.equals("2020")) {
				a++;
			}
		}
		System.out.println("Total Count of Books :"+a);
	}
		
	public static void Expensive(Book[] b) {
		double max = b[0].price;int y=0;
		System.out.println();
		for(int i=0;i<b.length;i++) {
			if(max<b[i].price) {
				max = b[i].price;
				y=i;
			}
		}b[y].display();
	}
	public static void leastPages(Book[] b) {
		int small = b[0].noOfPages;
		int value=0;
		System.out.println();
		for(int i=0;i<b.length;i++) {
			if(small>b[i].noOfPages) {
				small = b[i].noOfPages;
				value = i;
			}		}
			b[value].display();
	}
		
		
	}

