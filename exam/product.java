import java.util.Scanner;
public class product{
	int pcode;
	String pname;
	double price;
 public void getdata(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the product code:");
	pcode=sc.nextInt();
	System.out.println("Enter the product name:");
	pname =sc.next();
	System.out.println("Enter the price:");
	price=sc.nextInt();
}
void display(){
System.out.println(pcode+"  "+pname+"  "+price);
}			
public static void main(String [] args){
				
	System.out.println("Enter the  product details:");
	
	product p[]=new product[3];
	for(int i=0;i<3;i++){
		p[i]=new product();
		p[i].getdata();
	}
	System.out.println("Products");
	for(int i=0;i<3;i++){
		p[i].display();
	}
				
			if(p[0].price<=p[1].price && p[0].price<=p[2].price){
				System.out.println("product1 is of the lowest price");
			}
			else if(p[1].price<=p[2].price && p[0].price<=p[1].price){
				System.out.println("product2 is of lowest price");
			}
			else
				System.out.println("product3 is of lowest price");
			}	
}
	
