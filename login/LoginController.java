package zsgs.bankingapplication.login;

import zsgs.bankingapplication.banking.BankAccountView;

public class LoginController {
	private LoginModel loginmodel;
	private LoginView loginview;
	public LoginController(LoginView loginView2) {
		
		this.loginview=loginview;
		LoginModel loginmodel=new LoginModel(this);
	
	}public void CheckUserValid(String name, String email, String password,String address) {
		loginmodel.checkUserValid(name,email,password,address);
	}
	public void signupSuccess(String name) {
		loginview.signupSuccess(name);
	}
	
	public void checkAdminValid(String username, String password) {
		loginmodel.checkAdminValid(username,password);	
	}
	public void adminloginSuccess(String username) {
		loginview.adminloginSuccess(username);
	}
	public void adminloginFailure(String errormessage) {
		loginview.adminloginFailure(errormessage);
	}
	public void signupfailed(String error) {
		loginview.signupfailed(error);
	}
	public void checkForuserSignUp(String name, String username, String password) {
		
		
	}
	public void checkForLogin(long AccountNo, String password) {
		
		
	}
	public void checkForAdminlogin(String username, String password) {
		
		
	}
	

}



