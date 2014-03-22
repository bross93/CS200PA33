
public class LoanAccount extends Account{
	public String type;
	public String name;
	public String city;
	public double balance;
	public double interestRate;

	public LoanAccount(String t, String n, String c, double d,  double b){
		super(t,n,c,d);	
		setInt(b);
	}	
	
	public void setInt(double b){
		interestRate = b;
	}
	
	public String toString(){
		return null;	
}
	
}
