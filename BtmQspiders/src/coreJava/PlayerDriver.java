package coreJava;
class Player
{
	private String pName;
	private int pAge;
	private String gameType;
	Player(int pAge)
	{
		this.pAge=pAge;
	}
	Player(int pAge,String gameType)
{
	this(pAge);
	this.gameType=gameType;
}
	Player(String pName,int pAge,String gameType)
	{
		this(pAge,gameType);
		this.pName=pName;
		
	}
	public String getPname()
	{
		return pName;
	
	}
	public String getType()
	{
		return gameType;
	
	}
	public long getAge()
	{
		return pAge;
	
	}

}
public class PlayerDriver extends Player{
	 PlayerDriver(String pName,int pAge,String gameType)
	 {
		 
		 super(pName,pAge,gameType);
		 System.out.println("dis const is working");
	 }

	public static void main(String[] args) {
Player d=new PlayerDriver("virat kohli",34,"cricket");
		//Player p=new Player("virat kohli",34,"cricket");
		System.out.println(d.getAge());
	}

}
