import java.util.Comparator;

public class CompareByBalance implements Comparator<Account>{
	public int compare(Account blah, Account blah2) {
		// TODO Auto-generated method stub
		return Double.compare(blah.balance, blah2.balance);
	}	
}