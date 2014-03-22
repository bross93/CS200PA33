import java.util.ArrayList;


public class Bank {
	public int _size;
	
	ArrayList<Account> accounts = new ArrayList<Account>();
	
	void add(Account account){
		accounts.add(account);
		_size++;
	}
	
	int size(){
		return _size;
	}
	
	Account find(String account){
		for (int i = 0; i< _size; i++){
		       Account current = accounts.get(i);
		            if (current.name.contains(account)){
		             return current;
		             
		}else{
			return null;
		}
		}
		return null;
	}
	
	void addToBalance(String string, double amount){
		Account toAdd = find("string");
			toAdd.balance = amount;
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
	
	
	public static void main(String args[]){

		ArrayList<Account> accounts = new ArrayList<Account>();
		String z = "checking";
		String b = "bill nye";
		String c = "pueeellllooo";
		double d = 100.00;
		Account a = new Account(z,b,c,d);
		accounts.add(a);
		
		System.out.println(a);
	}
	
	
	
}
