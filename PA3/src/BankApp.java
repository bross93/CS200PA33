import java.util.ArrayList;
import java.util.Collections;
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
		ArrayList<Account> accounts = new ArrayList<Account>();
		String newChecking = "new checking";
		String name,city,businessType,type;
		double balance, interest;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Bank:");
		
		
		boolean exit = false;
		
		while(!exit){
			System.out.print("Enter command: ");
			String command = keyboard.nextLine();
			
			if(command.equalsIgnoreCase(newChecking)){
				type = "checking";
				System.out.println(" Enter the name: ");
				name = keyboard.nextLine();
				System.out.println(" Enter the city: ");
				city = keyboard.nextLine();
				System.out.println(" Enter the initial balance: ");
				balance = keyboard.nextDouble();
				Account check = new CheckingAccount(type,name,city,balance);
				accounts.add(check);
				
				
				//System.out.println(accounts);
			}
			
			else if(command.equalsIgnoreCase("new savings")){
				type = "savings";
				System.out.println(" Enter the name: ");
				name = keyboard.nextLine();
				System.out.println(" Enter the city: ");
				city = keyboard.nextLine();
				System.out.println(" Enter the initial balance: ");
				balance = keyboard.nextDouble();
				Account check = new SavingsAccount(type,name,city,balance);
				accounts.add(check);
				
			}
			
			else if(command.equalsIgnoreCase("new retail")){
				String typee;
				type = "retail";
				System.out.print(" Enter the name: ");
				name = keyboard.nextLine();
				System.out.print(" Enter the city: ");
				city = keyboard.nextLine();
				System.out.print(" Enter the initial balance: ");
				balance = keyboard.nextDouble();
				System.out.print(" Enter the business type: ");
				typee = keyboard.next();
				Account check = new RetailAccount(type,name,city, typee, balance);
				accounts.add(check);
				
			}
			
			else if(command.equalsIgnoreCase("new realestate")){
				String typee;
				type = "realestate";
				System.out.print(" Enter the name: ");
				name = keyboard.nextLine();
				System.out.print(" Enter the city: ");
				city = keyboard.nextLine();
				System.out.print(" Enter the initial balance: ");
				balance = keyboard.nextDouble();
				System.out.print(" Enter the business type: ");
				typee = keyboard.next();
				Account check = new RealestateAccount(type,name,city, typee, balance);
				accounts.add(check);
				
			}
			
			else if(command.equalsIgnoreCase("new loan")){
				String typee;
				type = "realestate";
				System.out.print(" Enter the name: ");
				name = keyboard.nextLine();
				System.out.print(" Enter the city: ");
				city = keyboard.nextLine();
				System.out.print(" Enter the initial balance: ");
				balance = keyboard.nextDouble();
				System.out.print(" Enter the interest rate: ");
				interest = keyboard.nextDouble();
				Account check = new LoanAccount(type,name,city, balance,interest);
				accounts.add(check);
				
			}
			
			else if(command.equalsIgnoreCase("help")){
				
				System.out.println(" Valid commands are");
				System.out.print("  new checking\n  new savings\n  new loan\n  new retail\n  new realestate\n  fnd\n  add\n  sort name\n  sort city\n  sort balance\n  sort type\n  sort notype\n  show\n  quit\n");
				
				
			}
			
			
			else if(command.equalsIgnoreCase("sort name")){
				
				Collections.sort(accounts);
				
				
			}
			
			else if(command.equalsIgnoreCase("sort city")){
				
				Collections.sort(accounts,new CompareByCity());
				
				
			}
			
				else if(command.equalsIgnoreCase("sort balance")){
				
				Collections.sort(accounts,new CompareByBalance());
				
				
			}
			
				else if(command.equalsIgnoreCase("sort type")){
					
					Collections.sort(accounts,new CompareByType());
					
					
				}
			
			else if(command.equalsIgnoreCase("show")){				
				System.out.println("Bank:");
				System.out.println(accounts);
			}
			
			else if(command.equalsIgnoreCase("quit")){				
				exit = true;
				System.exit(0);
			}
			
			else{
				
				System.out.println(" Valid commands are");
				System.out.print("  new checking\n  new savings\n  new loan\n  new retail\n  new realestate\n  fnd\n  add\n  sort name\n  sort city\n  sort balance\n  sort type\n  sort notype\n  show\n  quit\n");
				
				
			}
			
	}
		
	}
	
	
}
