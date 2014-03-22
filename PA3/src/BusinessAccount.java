
public class BusinessAccount extends Account {
	public String type;
	public String name;
	public String city;
	public String businessType;
	public double balance;


	public BusinessAccount(String t, String n, String c, String b, double d){
		super(t,n,c,d);	
		setBus(b);
	}	
	
	public void setBus(String bType){
		businessType = bType;
	}
	
	public String toString(){
		return null;	
}
}
