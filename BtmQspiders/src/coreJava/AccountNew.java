
package coreJava;
import java.util.Scanner;
public class AccountNew
{
	static
	{
			System.out.println("welcome to the banking app");
	}
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
		System.out.println("set the pwd");
		int pwd=s.nextInt();
		System.out.println("enter the balance in your new account");
		double balance=s.nextDouble();
	GettingPwd g=new GettingPwd(pwd,balance);
	System.out.println("if you want to update password enter the new Password");
	int pass=s.nextInt();
	g.setPwd(pwd,pass);
	System.out.println("new Password is"+g.getPwd());
	System.out.println("enter the balance you want to add" );
	double ba=s.nextDouble();
	g.setBal(ba,pass);
	System.out.println("new updated balance is"+g.getBal());
	}
}
 class GettingPwd 
{
	private int pwd;
	private double balance;


	{
		System.out.println("object is cretaed after taking the value");
	}
GettingPwd(int pwd,double balance)
{
	System.out.println("object is creted and initial value will be assigned");
	System.out.println("");
	this.pwd=pwd;
	this.balance=balance;
}
public void setPwd(int pwd,int pass)
{
if(pwd==this.pwd)
{
this.pwd=pass;
}
else
System.out.println("incorrect existing password");
}
public void setBal(double bal,int pwd)
{
if(pwd==this.pwd)
{
this.balance=balance+bal;
}
else
System.out.println("incorrect existing password");
}
public double getBal()
{
	return balance;
}
public int getPwd()
{
	return pwd;
}
}

