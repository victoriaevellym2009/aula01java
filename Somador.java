package aulaJPA.aula1;

import java.util.Scanner;

public class Somador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Variáveis
		double a,b ,som;
		//Instaciar classe Scanner (System.in);
		Scanner ler = new Scanner  (System.in);
		
		// Entrada de dados
		System.out.println("Informe valor 1: ");
		a = ler.nextDouble();
		
		System.out.println("Informe valor 2: ");
		b = ler.nextDouble();
		
		//Processamento
		som = a+b;
		//Sáida
		System.out.println("O resultado é :" + som);
		
		
	}

}
