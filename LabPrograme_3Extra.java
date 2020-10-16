PROGRAME_1

import java.util.Scanner;
public class employee {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of Employee : ");
	int n = sc.nextInt();
	double[] gross = new double[n];
	TestEmployee[] E = new TestEmployee[n];
	for(int i =0;i<n;i++) {
	E[i] = new TestEmployee();
	E[i].accept();
	gross[i] = E[i].calculation();
	gross[i] = E[i].overtime();
	}System.out.println("**OUTPUT**");
	for(int i=0;i<n;i++)
		E[i].display();
}
}
class TestEmployee{
	String empid,empname;
	double empnohrs,emphra,empbasic,empda,empit,empgross;
	void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Name of Employee :\t ");
		this.empname = sc.nextLine();
		System.out.print("Enter the Id of Employee:\t");
		this.empid = sc.nextLine();
		System.out.print("Enter the Basic salary:\t");
		this.empbasic = sc.nextDouble();
		System.out.print("Enter the HRA(%):\t");
		this.emphra = sc.nextDouble();
		System.out.print("Enter the DA(%):\t");
		this.empda = sc.nextDouble();
		System.out.print("Enter the IT(%):\t");
		this.empit = sc.nextDouble();
		System.out.print("Enter the Overtime amount in Hours:\t");
		this.empnohrs = sc.nextDouble();
	}
	double calculation()
{ empgross= empbasic + empbasic*emphra + empbasic*empda - empbasic*empit;
		return empgross;}
	double overtime() {
		if(empnohrs>=200) 
			empgross +=((empnohrs-200)*100);
		else
			empgross -=((200-empnohrs)*100);
		return empgross;
		
	}
	void display() {
		System.out.println("Name of Employee:\t"+empname+"\nID:\t"+empid+"\nBasic:\t"+empbasic+"\nGross Salary:"+empgross);
	}
}

PROGRAME_2

import java.util.Scanner;

public class Age {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The Age Of Person1(in years):");
	int y1 = sc.nextInt();
	System.out.println("Enter The Age Of Person2(in months):");
	int m1 = sc.nextInt();
	System.out.println("Enter The Age of Person1(in years):");
	int y2 = sc.nextInt();
	System.out.println("Enter The Age of Person2(in months):");
	int m2 = sc.nextInt();
	aget a[]= new aget[2];
	a[0] = new aget(y1,m1);
	a[1] = new aget(y2,m2);
	int s = a[0].cal(a[1]);
	System.out.println("Person"+(s+1)+" Is eldest of them both");
}
}
class aget{
	int year,months;
	aget(int year,int months){
		this.year = year;
		this.months = months;
	}
	int cal(aget a) {
		int s;
		if(this.year >=a.year &&this.months>=a.months)
			s=0;
		else
			s=1;
		return s;
	}
}
