import java.util.ArrayList;
import java.util.Scanner;


public class BankApp {

	/**Dope stuff to do:
	 * 
	 * 	This class is must a main method that creates a Bank object and interacts with it based on a user's input. The valid user commands and results are
new checking: Ask user for name, city, balance and add account.
new savings: Ask user for name, city, balance and add account.
new loan: Ask user for name, city, balance and interest rate and add account.
new retail: Ask user for name, city, balance and business type and add account.
new realestate: Ask user for name, city, balance and business type and add account.
find: Ask user for name. Search accounts for one that matches string in name and return it. Throw an AccountNotFoundException if not found. (Define this class.)
add: Ask user for name and amount. Add the amount to thebalance of the account given by name.
sort name: Designate that accounts are to be sorted by name when printed.
sort city: Designate that accounts are to be sorted by city when printed.
sort balance: Designate that accounts are to be sorted by balance when printed.
sort type: Designate that accounts are to be sorted by type in addition to name, city, or balance.
sort notype: Designate that accounts are not to be sorted by type in addition to name, city, or balance.
show: Print accounts.
To sort your ArrayList<Account> accounts, use
Collections.sort(accounts) if no sort method has been specified, or
Collections.sort(accounts,comparator) if a sort method had been specified.
	 */
	
	
	public static void main(String args[]){
		
		String newChecking = "new checking";
		String name,city,businessType,type;
		double balance, interest;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Bank:");
		System.out.println("Enter command: ");
		String command = keyboard.nextLine();
		
		if(command.equalsIgnoreCase(newChecking));{
			ArrayList<Account> accounts = new ArrayList<Account>();
			type = "checking";
			System.out.println(" Enter the name: ");
			name = keyboard.nextLine();
			System.out.println(" Enter the city: ");
			city = keyboard.nextLine();
			System.out.println(" Enter the initial balance: ");
			balance = keyboard.nextDouble();
			Account check = new CheckingAccount(type,name,city,balance);
			accounts.add(check);
			accounts.add(check);
			System.out.println(accounts);
		}
	}
	
	
}
