import java.io.*;
import java.util.*;
class account{
	int id,balance;
	String name;
	account(int i,int b,String n){
		id=i;
		balance=b;
		name=n;
	}
	String address;
	account(String n,String a,int b){
		address=a;
	}
	void withdraw(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to be withdraw:");
		int w=sc.nextInt();
		if(balance>1000){
			balance-=w;
			System.out.println("Amount withdraw sucessfully");
			System.out.println("Balance amount:"+balance);
		}
		else{
			System.out.println("Cannot be withdrawed");
		}
	}
	void deposit(){
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the amount to be deposited:");
		int d=sc1.nextInt();
		balance+=d;
		System.out.println("balance:"+balance);
	}
	void balance(){
		System.out.println("balance:"+balance);
	}
	public static void main(String[]args){
		Scanner sc2=new Scanner(System.in);
		System.out.println("enter the id:");
		int id=Integer.parseInt(sc2.nextLine());
		System.out.println("enter the name:");
		String name=sc2.next();
		System.out.println("enter the balance:");
		int balance=Integer.parseInt(sc2.nextLine());
		System.out.println("enter the address:");
		String address=sc2.next();
		account ac = new account(id, balance,name);
		ac.withdraw();
		ac.deposit();
		ac.balance();
		ac.display();
		account ab = new account( balance,name,address);
		ab.withdraw();
		ab.deposit();
		ab.balance();
		ab.display();
	}
	void display(){
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("address:"+address);
		System.out.println("balance:"+balance);
	}
}	
			


