package zsgs.bankingapplication.login;

import java.util.Scanner;
import zsgs.bankingapplication.Dao.*;

import zsgs.bankingapplication.banking.BankAccount;
import zsgs.bankingapplication.banking.BankAccountView;
import zsgs.bankingapplication.banking.BankAccountController;

public class LoginView {
private LoginController logincontroller;
Scanner sc=new Scanner(System.in);
public LoginView()
{
	LoginController logincontroller=new LoginController(this);
}
public static void main(String[] args) {
	LoginView loginview=new LoginView();
	loginview.menu();
}
private void menu()
{
	boolean setup=true;
	do {
		System.out.println("welcome to login");
		System.out.println("1.signup\n2.login\n3.AdminLogin\n4.exit\n");
		System.out.println("Enter your choice ");
		int choice =sc.nextInt();
		switch(choice) {
		case 1:
			signup();
			break;
		case 2:
			Adminlogin();
		case 3:
		     userLogin();
		case 4:setup=false;
		break;}
		}while(setup);
}

private void userLogin() {
   System.out.println("Enter your AccountNo");
   long AccountNo=sc.nextLong();
   System.out.println("Enter Password");
	String password = sc.next();
	logincontroller.checkForLogin(AccountNo,password);
}
private void Adminlogin() {
	System.out.println("Enter UserName");
	String username = sc.next();
	System.out.println("Enter Password");
	String password = sc.next();
	logincontroller.checkForAdminlogin(username,password);
	
}

public void signup() {
	System.out.println("Enter Name");
	String name = sc.next();
	System.out.println("Enter UserName");
	String username = sc.next();
	System.out.println("Enter Password");
	String password = sc.next();
	
	logincontroller. checkForuserSignUp(name,username,password);
	BankAccountView Bv = new BankAccountView();
	Bv.displayMainMenu();
}	
public void adminloginSuccess(String username) {
	System.out.println("\nWelcome"+username);
	System.out.println("\nSucessfully Login!!!");

}

public void signupSuccess(String name) {
	System.out.println("\nWelcome"+name);
	System.out.println("\nSucessfully SignUP!!!");
}
public void signupfailed(String error) {
	System.out.println(error);
	signup();

}
public void adminloginFailure(String errormessage) {
	System.out.println("Failed to login");
	
}
}

