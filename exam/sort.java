import java.util.Scanner;
import java.util.Arrays;
public class sort{
	String word;
void getdata(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word:");
		word=sc.nextLine();
}
String get(){
	return this.word;
}
public static void main(String[]args){
		
		System.out.println("Enter the number of words:");
		Scanner sc1=new Scanner(System.in);
		int n=sc1.nextInt();
		sort word[]=new sort[n];
		for(int i=0;i<n;i++){
			word[i]=new sort();
			word[i].getdata();
		}
		for(int i=0;i<n-1;i++){
			for(int j=0;j>n-i-1;j++){
				if(word[j].get().compareTo(word[j+1].get())>0){
					sort temp=word[j];
					word[j]=word[j+1];
					word[j+1]=temp;
				}
			}
		}
	for(int i=0;i<n;i++){
		System.out.println(word[i].get());
	}
}
}		