package pacote;

import java.util.Scanner;

public class ExercicioImputParImpar {

	public static void main(String[] args) {
		/*Dados diversos números pelo usuário, 
		 * contá-los até que seja digitado um numero impar.
		 * Numeros: 4 8 6 2 2 5
		 * >> Voce digitou 5 numeros pares*/
		int cont=0, i=0;
		boolean par = true;
		Scanner leitor = new Scanner(System.in);
		
		while (par) 
		{
			System.out.println("Contador digitacao pares: "+cont);
			System.out.println("Digite numeros pares pra contar e impar pra sair:");
			i = leitor.nextInt();
			par = ((i%2)==0);
			
		
		}
		System.out.println("Total pares: "+cont);
	}

}
