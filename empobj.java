import java.util.*;
 
public class empobj {
 
 int eno;
 String ename;
 float esalary;
 
 public void read() {
 
  Scanner in = new Scanner(System.in);
  System.out.print("Enter the employee no :: ");
  eno = in.nextInt();
  System.out.print("Enter the name :: ");
  ename = in.next();
  System.out.print("Enter the salary :: ");
  esalary = in.nextFloat();
 }
 
 public void display() {
  
  System.out.println("Employee id = " + eno);
  System.out.println("Employee name = " + ename);
  System.out.println("Employee salary = " + esalary);
 }
 
 public static void main(String[] args) {
	int i,n=3;
	int No;
 
  empobj e[] = new empobj[n];
  
  for( i=0; i<n; i++) {
   
   e[i] = new empobj();
   e[i].read();
  }
   System.out.println("Search"); 
   while(true){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter ID : "); 
    No = Integer.parseInt(sc.nextLine());
    for(i=0;i<n;i++){
       if(e[i].eno == No){
           e[i].display();
            break;
			}
		    }
		}
   }
}			