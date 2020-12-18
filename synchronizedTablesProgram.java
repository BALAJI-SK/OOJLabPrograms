
import java.util.Scanner;

public class tables {
public static void main(String args[]) {
	cal c = new cal();
	Scanner sc = new Scanner(System.in);
	System.out.println("input the number of elements");
	int n = sc.nextInt();
	table obj = new table(n,c,5);
	table obj1 = new table(n,c,100);
	try {
		obj.t.join();
		obj1.t.join();
	}catch(Exception e) {
		System.out.println("exception occured");
	}
	System.out.println("thank you");
	sc.close();
}
}
class table implements Runnable {
	int n,tabl;
	Thread t;
	cal tar;
	table(int n,cal c,int tab){
		tabl =tab;
		tar=c;
		this.n=n;
		t=new Thread(this);t.start();
	}
	public void run() {
		synchronized(tar) {
			tar.cals(n, tabl);
		}
	}
}
class cal{
void cals(int n,int ta) {
	for(int i=1;i<=n;i++) {
		System.out.println(ta+" x "+i+" = "+(ta*i));
	}
	}
}
