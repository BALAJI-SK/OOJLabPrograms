

public class interthreadingdemo {
public static void main(String args[]) {

	 Car ca = new Car();

	 new CarOwner(ca);

	 new CarMechanic(ca);

	 }
}

 class Car {

	 int n;

	 boolean valueSet = false;

	 synchronized int get() {

	 while(!valueSet)

	 try {

	 wait();

	 } catch(InterruptedException e) {

	 System.out.println("InterruptedException caught");

	 }

	 System.out.println("Car mechanic  accepted request to repair " );

	 valueSet = false;

	 notify();

	 return n;

	 }synchronized void put(int n) {

while(valueSet)

try {

wait();

} catch(InterruptedException e) {

System.out.println("InterruptedException caught");

}

this.n = n;

valueSet = true;

System.out.println("Car Owner  requesting to accept his car for meachinc  ");

notify();

}

}
		 class CarOwner implements Runnable {

			 Car ca;

			 CarOwner(Car ca) {

			 this.ca = ca;

			 new Thread(this, "CarOwner").start();

			 }

			 public void run() {

			 int i = 0;

			 while(i<10) {

			 ca.put(i++); } }}

			 class CarMechanic implements Runnable {

				 Car ca;

				 CarMechanic(Car ca) {

				 this.ca = ca;

				 new Thread(this, "CarMechanic").start();

				 }

				 public void run() {

				 while(true) {

				 ca.get();

				 }

				 }

				 }
