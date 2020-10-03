

import java.util.Scanner;

public class QuadraticEquations {
	public static void main(String args[] ){
		double r1,r2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a,b,c value:\t");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double D = b*b-4*a*c;
		if(D<0) {
			System.out.println("Imaginary root1: "+(-b/2*a)+"+ "+(Math.sqrt(-D)/2*a)+"i");
			System.out.println("Imaginary root2: "+(-b/2*a)+"- "+(Math.sqrt(-D)/2*a)+"i");
		}else {
			r1 = (-b+Math.sqrt(D))/2*a;
			r2 = (-b-Math.sqrt(D))/2*a;
			System.out.println("real root1: "+r1);
			System.out.println("real root2: "+r2);
		}
			
	}

}
