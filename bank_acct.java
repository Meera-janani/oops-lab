public class bank_acct{
	int bal=1000;
	public void credit (int amt){
		bal=bal+amt;
		System.out.println("Balance:"+bal);
	}
public void debit (int amt){
	if(bal-amt>=1000){
		bal=bal-amt;
		System.out.println("Balance:"+bal);
		}
	else{
		System.out.println("Withdrawal is not possible....minimum balaance should remain");
		}
	}
public static void main(String[]args){
	bank_acct acct_1=new bank_acct();
	acct_1.credit(1000);
	bank_acct acct_2=new bank_acct();
	acct_2.debit(1000);
	bank_acct acct_3=new bank_acct();
	acct_3 .credit(1000);
	acct_3.debit(500);
	}
}