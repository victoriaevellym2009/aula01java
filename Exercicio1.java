package aulaJPA.aula1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Varáveis
		String nome;
		int idade;
		//Instaciar classe Scanner (System.in);
		Scanner ler = new Scanner  (System.in);
		
		// Entrada de dados
		System.out.println("Informe o seu nome: ");
		nome = ler.next();
		
		System.out.println("Informe a sua idade" + "");
		idade = ler.nextInt();
		
		//Sáida
		System.out.println(" O seu nome é : " + nome + " e sua idade é " + idade);
		
		
		
				

	}

}
