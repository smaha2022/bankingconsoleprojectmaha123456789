package zsgs.bankingapplication.banking;

import java.util.Date;

import zsgs.bankingapplication.login.LoginModel;
import zsgs.bankingapplication.login.LoginView;

public class BankAccountController {
        private BankAccount bankaccount;
		public BankAccountView bankaccountview;
		public BankAccountController(BankAccountView bankaccountview) 
		{
			
			this.bankaccountview=bankaccountview;
			
		     BankAccount bankaccount=new BankAccount(this);
		}
		
		public void checkBalance(long accountNo) {
			bankaccount.CheckBalance(accountNo);
			
		}

		
		public void newAccount(String name, String gender, String address, int phoneNo, long aadharNo,
				String accountType, String branchname) {
			bankaccount.newAccount(name,gender,address,phoneNo,aadharNo,accountType,branchname);
			
		}

		public void checkWithDrawFund(long  accountNo,int Amount, String branchname, Date dateInput) {
			bankaccount.checkWithDrawFund(accountNo,Amount,branchname,dateInput);
			
		}

		public void checkTrasactionHistory(long  accountNo, String branchname) {
			bankaccount.CheckTransactionHistory(accountNo,branchname);
			
		}

		public void checkDeposit(long accountNo,int Amount, String branchname, String ifsc) {
			bankaccount.checkDeposit(accountNo,Amount,branchname,ifsc);
			
		}

		public static void createdSuccessfully() {
			BankAccountView.createdSuccessfully();
			
		}

		public static void accountFailed(String string) {
			
			
		}

}
	 