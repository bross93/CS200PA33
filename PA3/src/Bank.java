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
		String z1 = "checking";
		String b1 = "bill nye";
		String c1 = "pueeellllooo";
		double d1 = 100.00;
		String z11 = "retail";
		String b11 = "bill nye";
		String c11 = "pueeellllooo";
		double d11 = 100.00;
		Account a = new Account(z,b,c,d);
		Account s = new SavingsAccount(z1,b1,c1,d1);
		Account s1 = new CheckingAccount(z1,b1,c1,d1);
		Account bus = new RetailAccount(z11,b11,c11,"cool shit",d11);
		Account real = new RetailAccount(z11,b11,c11,"cool shit",d11);
		Account loan = new LoanAccount(z11,b11,c11,d11,.20);
		accounts.add(a);
		accounts.add(s);
		
		System.out.println(loan);
	}
	
	
	
}
