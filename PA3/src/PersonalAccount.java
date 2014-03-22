
public class PersonalAccount extends Account{
	public String type;
	public String name;
	public String city;
	public double balance;


	public PersonalAccount(String t, String n, String c, double d){
		super(t,n,c,d);	
		
	}	
	
	public String toString(){
		return super.toString();	
}
}
