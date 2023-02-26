package zsgs.bankingapplication.Dao;

public class Admin {
private  String username;
private  String password;
private  long AccountNo; 
private String Name;

public Admin(String username, String password, String name) {
	super();
	this.username = username;
	this.password = password;
	Name = name;
}

public String getName() {
	return Name;
}

public String getUsername() {
	return username;
}

public String getPassword() {
	return password;
	
}

public long getAccountNo() {
	return AccountNo;
}
public Admin(String password, long accountNo) {
	super();
	this.password = password;
	AccountNo = accountNo;
}

public Admin(String username, String password) {
	super();
	this.username = username;
	this.password = password;
}


}