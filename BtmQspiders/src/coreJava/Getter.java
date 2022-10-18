package coreJava;

public class Getter 
{
	private double balance;
	private int pwd;
	public void setBal(double balance)
	{
		this.balance=balance;
	}
	public void setPwd(int pwd)
	{
		this.pwd=pwd;
	}
	public double getBal()
	{
		return balance;
	}
	public int getPwd()
	{
		return pwd;
	}
	 Getter(double balance,int pwd)
	 {
	 this.balance=balance;
	 this.pwd=pwd;
	 }

}
class Account
{
	public static void main(String[] args)
	{
Getter g=new Getter(10000d,109);
g.setBal(98000d);
g.setPwd(102);
System.out.println(g.getBal());
System.out.println(g.getPwd());
}
}