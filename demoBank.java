import java.util.*;
class BankAccount
{
	String Acno;int bal;int IR;int Amountdepo;
	BankAccount(String Acno,int bal,int IR,int Amountdepo)
	{
		this.Acno=Acno
		this.bal=bal
		this.IR=IR
		this.Amountdepo=Amountdepo
	}
	int deposit()
	{
		bal=bal+Amountdepo;	
		return bal;
	}
}
class SavingAccount extends BankAccount
{
	int amt_with;
	SavingAccount(String a,int b,int c,int d,int e)
	{
		super(a,b,c,d);
		amt_with=e
	int withdraw()
	{
		return (bal-amt_with);
	}
}
class demoBank
{
	public static void main(String args[])
	{
		BankAccount B1=new BankAccount("6859",8000,5,5000);
		SavingAccount B2=new SavingAccount("6859",8000,5,5000,3000);
		B1.deposit();
		B2.withdraw;
	}
}
		