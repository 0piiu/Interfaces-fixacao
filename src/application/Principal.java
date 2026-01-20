package application;

import java.util.Scanner;

import services.AcessPortal;
import services.Autentication;
import services.User;

public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Autentication autentication = new User("Thales", "senha");
		
		System.out.print("Digite seu usuario: ");
		String userLogin = sc.next();
		
		System.out.print("Digite sua senha: ");
		String userPassword = sc.next();
		
		AcessPortal portal = new AcessPortal();
		
		portal.validationAcess(autentication, userLogin, userPassword);
		
		
		sc.close();
	}
}
