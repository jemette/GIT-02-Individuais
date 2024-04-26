package aula;

import java.util.Scanner;

public class exercicioDois {
	  public static void main (String [] args) {
		  Scanner scan = new Scanner(System.in);
			String name;
		  String email;
      
			System.out.println("Exercício 02 Online");
      
			System.out.println("Escreva seu nome: ");
			name = scan.next();
      
      System.out.println("Escreva seu email: ");
		  email = scan.next();

			System.out.println(name);
		  System.out.println(email);
		}
}