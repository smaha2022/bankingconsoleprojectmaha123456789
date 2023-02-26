package zsgs.bankingapplication.banking;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import zsgs.bankingapplication.login.LoginModel;

public class BankAccount {
    
	public BankAccount(BankAccountController bankAccountController) {
	}
	
		ArrayList <BankAccount> accountCredentials = new ArrayList<>();
	
    public BankAccount(String name, String gender, String address, int phoneNo, long aadharNo, String accountType,
			String branchname) {
		
	}

    public void CheckBalance(long accountNo) {
		
		
	}
    public void checkWithDrawFund(long accountNo,int Amount, String branchname, Date dateInput) {
		
	}

	public void CheckTransactionHistory(long accountNo, String branchname) {

		
	}

	public void checkDeposit(long accountNo,int Amount, String branchname, String ifsc) {
		
		
	}
	public void newAccount(String name, String gender, String address, int phoneNo, long aadharNo, String accountType,
			String branchname) {
		if( accountCredentials.add(new BankAccount(name,gender,address,phoneNo,aadharNo,accountType,branchname)))
    	{
			BankAccountController.createdSuccessfully();
			Random rm=new Random();
			int accountno= rm.nextInt(999999);
			}
          else BankAccountController.accountFailed("Failed!!!!");
		
 
	}
		
	}

	
	    
