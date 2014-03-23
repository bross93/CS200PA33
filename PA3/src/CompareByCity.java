import java.util.Comparator;


public class CompareByCity  implements Comparator<Account>{
	public int compare(Account blah, Account blah2) {
		// TODO Auto-generated method stub
		return blah.city.compareTo(blah2.city);
	}	
}
