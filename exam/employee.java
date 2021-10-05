import java.util.Scanner;
public class employee{
	int eno;
	String ename;
	int esalary;
void getdata(){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the employee number:");
	eno=sc.nextInt();
	System.out.println("enter the employee name:");
	ename=sc.next();
	System.out.println("enter the employee salary:");
	esalary=sc.nextInt();
}
void display(){
	System.out.println(eno+" "+ename+" "+esalary);
}
public static void main(String[]args){
	System.out.println("Enter the no of Employee details");
	Scanner sc1=new Scanner(System.in);
	int n=sc1.nextInt();
	employee emp[]=new employee[n];
	for(int i=0;i<n;i++){
		emp[i]=new employee();
		emp[i].getdata();
	}
	System.out.println("Employee Details");
	for(int i=0;i<n;i++){
		emp[i].display();
	}
	System.out.println("Enter the employee number to be searched:");
	int n1=sc1.nextInt();
	for(int i=0;i<n;i++){
		if(emp[i].eno==n1){
			emp[i].display();
		}
	}
}
}