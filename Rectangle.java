import java.io.*;
import java.util.*;
public class Rectangle{
	Double length;
	Double width;
	String color;
	Double area;
	public void Rectangle(Double l,Double w,Double a,String color)
	{
		length=l;
		width=w;
		area=l*w;
		color=color;
	}
public Double getlength(){
	return length;
}
public void setlength(Double length){
	this.length=length;
}
public Double getwidth(){
	return width;
}
public void setwidth(Double width){
	this.width=width;
}
public Double getarea(){
	return area;
}
public void setarea(Double area){
	this.area=area;
}
public String getcolor(){
	return color;
}
public void setcolor(){
	this.color=color;
}
	Scanner S= new Scanner(System.in);
	Rectangle(){
	System.out.println("Enter the color:");
	 String color=S.nextLine();
	System.out.println("Enter the length:");
	 Double length=S.nextDouble();
	System.out.println("Enter the width:");
	 Double width=S.nextDouble();
	area=length*width;
	System.out.println("Area:"+area);
	}
	public static void main(String args[]){
	Rectangle R1=new Rectangle();
	Rectangle R2=new Rectangle();
	if(R1.area==R2.area&&R1.color==R2.color){
		System.out.println("Matching rectangles");
	}
	else{
		System.out.println("Non-matching rectangles");
		}
	}
}
	
	

	