package coreJava;
class DataHiding
{
	private String stdName;
	private int phy;
	private int che;
	private int bio;
	public String getName() {
		return stdName;
	}
	public int getPhy() {
		return phy;
	}
	public int getChem() {
		return che;
	}
	public int getBio() {
		return bio;
	}
	public void printVal()
	{
		System.out.println("bio is:"+bio);
		System.out.println("bio is:"+phy);
		System.out.println("bio is:"+che);
		float perc=(phy+che+bio)/300.0f*100;
		System.out.println(stdName+" scored percentage "+perc);
	}
	public void setVal(String stdName,int phy,int che,int bio)
	{
		this.stdName=stdName;
		this.phy=phy;
		this.che=che;
		this.bio=bio;
	}
}
public class DriverDataHiding {

	public static void main(String[] args) {
		DataHiding d=new DataHiding();
d.setVal("ramesh", 56, 77, 88);
d.printVal();
	}

}
