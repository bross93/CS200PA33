
public class BusinessAccount extends Account {
	public String type;
	public String name;
	public String city;
	public String businessType;
	public double balance;
	public String nameAndType = name+"("+businessType+")";


	public BusinessAccount(String t, String n, String c, String b, double d){
		super(t,n+"("+b+")",c,d);	
		businessType = b;
	}	
	
	public void setBus(String bType){
		businessType = bType;
	}
	
	public String toString(){
		//return String.format("\t %18s:    %20s(%s)   %15s  %10.2f\n",type,name,businessType,city,balance);
		return super.toString();

}
}
