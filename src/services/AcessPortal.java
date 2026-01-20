package services;

public class AcessPortal {

	Autentication autentication;
	
	public void validationAcess(Autentication autentication, String user, String password) {
		if (autentication.autentication(user, password)) {
			System.out.println("Acesso liberado!...");
			System.out.println(user + " " + password);
		}
		else {
			System.out.println("Erro: Usuário ou senha incorretos.");
		}
	}
}
