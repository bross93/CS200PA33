import java.util.ArrayList;


public class Bank {
	public int _size;
	
	ArrayList<Account> accounts = new ArrayList<Account>();
	
	void add(Account account){
		
	}
	
	int size(){
		return _size;
	}
	
	Account find(String account){
		return null;		
	}
	
	void addToBalance(String string, double amount){
		
	}
	
	//Name, city, and balance assign the comparater memeber variable to be an instance of an appropriate class that implements Comparator<Account>
	void sortByName(){
		//Sets sorting method to by name, sets comparator
	}
	
	void sortByCity(){
		//Sets comparater to city, duhhhhhh
	}
	
	void sortByBalance(){
		//Sets comparater to balance, I would hate to be at the bottom of this list :0
	}
	
	void sortByType(boolean type){
		//Sets comparater to comparaterbytype
	}
	
	
}
