package services;

public class User implements Autentication {

	protected String userLogin;
	protected String passwordLogin;

	public User() {

	}

	public User(String login, String password) {
		this.userLogin = login;
		this.passwordLogin = password;
	}

	@Override
	public boolean autentication(String enteredLogin, String enteredPassword) {
		if (this.userLogin.equals(enteredLogin) && this.passwordLogin.equals(enteredPassword)) {
			return true;
		}
		return false;
	}
}