import java.io.*;
import java.util.Scanner;

 class PrimeNumber{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the inital element : ");
		int n = sc.nextInt();
		System.out.println("Enter last Number");
		int l = sc.nextInt();
		System.out.println("Prime Numbers are :");
		for(int i = n; i<=l;i++) {
			if(i==0 || i==1) {
				continue;}
			 if(i==2) {
				System.out.println(i);	
				continue;
			}
			else  {
				boolean f= true;
				for(int j = 2;j<=i/2;j++) {
					if(i%j==0) {
						f=false;
						break;
					}
				}
				 if(f==true  ) {
					  System.out.println(i);
				}	
			}
		}
	}
	}
