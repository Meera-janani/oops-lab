import java.util.Scanner;
public class area{
	int a1,b1,c1;
//area(int l,int b,int s1, int r){
	//a1=l;
	//b1=b;
	//r1=r;
	//s1=s;
//}
void getdata(int r1){
	double area_circle=3.14*r1*r1;
	System.out.println("Area of circle:"+area_circle);
}
void getdata(int a1,int b1){
	double area_rec=a1*b1;
	System.out.println("Area of rectangle:"+area_rec);
}
//void getdata(int s1){
//	double area_sq=s1;
//	System.out.println("Area of square:"+area_sq);
//}
public static void main(String []args){
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the length:");
	int l=sc.nextInt();
	System.out.println("Enter the breadth:");
	int b=sc.nextInt();
	//System.out.println("Enter the side:");
	//int s=sc.nextInt();
	System.out.println("Enter the radius:");
	int r=sc.nextInt();
	area shape= new area();
	shape.getdata(r);
	shape.getdata(l,b);
	//shape.getdata(s);
}
}
