import java.util.*;
class Grades{
public static  void main(String args[]){
int  total ; 
Scanner in  = new Scanner(System.in); 
System.out.println("Enter the CIE marks (out of 50)");
int  CIE= in.nextInt(); 
  System.out.println("Enter the SEE marks (out of 100):"); 
int SEE = in.nextInt();
total = (CIE +(SEE/2));
if(total>=89){
System.out.println(" Your grade is A.");
}
else if (total>=80){
System.out.println(" Your grade is B.");
}
else if (total>=60){
System.out.println(" Your grade is C.");
}
else if (total>=40)

System.out.println(" Your grade is D.");
else
System.out.println(" Your grade is E.");
}
}

