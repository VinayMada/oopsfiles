import java.util.*;
class account{
	double balance;
	account(double b){
		balance=b;
	}
	String acct_name,acct_address;
	int acct_no,acct_bal;
	void credit(double amount){
		balance+=amount;
		return;
	}
	void debit(double amount){
		if(amount>balance){
			System.out.println("Balance is less than the entered amount");
		}
		balance-=amount;
	}
	double getbalance(){
		return balance;
	}
}
class bank{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the initial balance: ");
	double balance=sc.nextDouble();
		account a=new account(balance);
		System.out.println("Enter the amount to b credited: ");
	double amount_c=sc.nextDouble();
	a.credit(amount_c);
	System.out.println("Enter the amount to be deducted: ");
	double amount_d=sc.nextDouble();
	a.debit(amount_d);
	System.out.println("balance amount:"+a.getbalance());
	}
}
