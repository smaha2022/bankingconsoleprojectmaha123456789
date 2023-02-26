package zsgs.bankingapplication.login;

import java.util.ArrayList;
import java.util.List;

public class LoginModel {
	private LoginController logincontroller;
	
	public LoginModel(LoginController loginController2) {
		this.logincontroller=logincontroller;
	}
	 
		public LoginModel(String name, String email, String password, String address) {
		}
		List <LoginModel> UserCredentials = new ArrayList<>();
		
		
		public void checkUserValid(String name, String email, String password,String address) {
			
			if(UserCredentials.add(new LoginModel(name,email,password,address))){
				logincontroller.signupSuccess(name);
				}
	          else logincontroller.signupfailed("Failed!!!!");
	 
		}
		
		
		public void checkAdminValid(String username, String password) {
			boolean login = false;
			if(username.equals("MAHA") && password.equals("1998")) {
				logincontroller.adminloginSuccess(username);
			}else
				logincontroller.adminloginFailure("Invalid");			
		}
		public void checkForLogin(long AccountNo, String password) {
			boolean login = false;
			if(AccountNo.equals() && password.equals(login)) {
				logincontroller.adminloginSuccess(username);
			}else
				logincontroller.adminloginFailure("Invalid");			
		}
	}
