
public class LoanAccount extends Account{
	public double _intRate;
	public LoanAccount(String t, String n, String c, double d, double intRate) {
		super(t, n, c, d);
		_intRate = intRate;
		
		// TODO Auto-generated constructor stub
	}
	
	public String toString(){
		return String.format("\t %18s:    %20s   %15s  %10.2f (%f)\n",type,name,city,balance,_intRate);
	}
	
	
}
