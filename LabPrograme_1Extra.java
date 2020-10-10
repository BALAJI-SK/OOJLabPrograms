Programe-1
import java.util.Scanner;

public class SumOfIndies {
public static void main (String [] args) {
	int esum=0,osum=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of elements :  ");
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int x=0; x<n;x++) {
		System.out.println("Enter the value: ");
		arr[x]= sc.nextInt();
		if(x%2==0) 
			esum +=arr[x];
		else
			osum +=arr[x];
	}
	System.out.println("Sum Of Even Indices : "+esum+"\nSum of Odd Indices: "+osum);
sc.close();
}
}


Programe-2
import java.util.Scanner;
public class FindNumbers {
	
	public static void main (String [] args) {
		int psum=0,nsum=0,zsum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements :  ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int x=0; x<n;x++) {
			System.out.println("Enter the value: ");
			arr[x]= sc.nextInt();
			if(arr[x]>0)
				psum++;
			else if(arr[x]<0)
				nsum++;
			else
				zsum++;
}System.out.println("Number of Positive Numbers in array: "+psum+"\nNegtive Numbers are: "+nsum+"\nZero Contain are: "+zsum);
}
}

Programe-3
import java.util.Scanner;
public class MarketBill {
	public static void main(String []args) {
	 double[] rate = new double[5];
	 Scanner input = new Scanner(System.in);
				 int[] quantity = new int[5];
				 for(int i=0;i<5;i++) {
					 System.out.println("Enter The Rate and Quantity per item: ");
				 	rate[i] = input.nextDouble();
				 	quantity[i] = input.nextInt();
				 }
				 double subtotal=0;
				 for(int j=0;j<5;j++) {
				 	subtotal+=(rate[j]*quantity[j]);
				 }
				 System.out.println("Sub-total: "+subtotal);
				 if(subtotal>=10000) {
				 	subtotal-=(0.05*subtotal);
				 }else if(subtotal>=7500) {
				 	subtotal-=(0.03*subtotal);
				 }else if(subtotal>=5000) {
				 	subtotal-=(0.02*subtotal);
				 }
				 System.out.println("Total: "+subtotal);
}}

Programe-4
import java.util.Scanner;
public class SumMinMaxAvg {
	public static void main (String [] args) {
		int e=0,o=0,esum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements :  ");
		int n = sc.nextInt();
		int[] A = new int[n];
		int[] B = new int[n];
		int[] C = new int[n];
		System.out.println("Enter the value: ");
		for(int x=0; x<n;x++) {
			A[x]= sc.nextInt();
			if(A[x]%2==0) {
				C[e]=A[x];
				esum+=C[e++];}
			else 
				B[o++]= A[x];
}
		int max = 0;
	     int min = C[0];
	      for(int i=0; i<C.length; i++ ) {
	         if(C[i]>max) 
	            max = C[i];
			 if(C[i]<min) {
	            min = C[i];
	         }
	      }
System.out.println("Sum of Elements in Aarry C: "+esum+"\nAverage Of Elements C: "+(esum/(e-1))+"\nMaxmium Value of C array: "+max+"\nMinimum Value of C array: "+min);
sc.close();}
}
