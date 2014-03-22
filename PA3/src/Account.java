
public class Account implements Comparable<Account> {
public String type;
public String name;
public String city;
public double balance;
public double intRate;
public boolean loan = false;


@Override
public String toString() {
	
	return String.format("\t %18s:    %20s   %15s  %10.2f\n",type,name,city,balance);
	
}

public Account(String t, String n, String c, double d){
	this.type = t;
	this.name = n;
	this.city = c;
	this.balance = d;
	
}




@Override
public int compareTo(Account blah) {
	// TODO Auto-generated method stub
	return 0;
}

}
