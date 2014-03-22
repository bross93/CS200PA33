
public class Account implements Comparable<Account> {
public String type;
public String name;
public String city;
public double balance;


@Override
public String toString() {
	return "Account [type=" + type + ", name=" + name + ", city=" + city
			+ ", balance=" + balance + "]";
}

public Account(String t, String n, String c, double d){
	setType(t);
	setName(n);
	setCity(c);
	setBalance(d);
	
}


@Override
public int compareTo(Account blah) {
	// TODO Auto-generated method stub
	return 0;
}

public void setType(String _type){
	type = _type;
}

public void setName(String _name){
	name= _name;
}

public void setCity(String _city){
	city = _city;
}

public void setBalance(double _balance){
	balance = _balance;
}





}
