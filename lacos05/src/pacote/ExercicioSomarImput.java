package pacote;

import java.util.Scanner;

public class ExercicioSomarImput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner leitor = new Scanner(System.in);
		int contador = 1, numerodigitado, soma=0;
		
		do{
			System.out.println(contador+"o. Digite qualquer numero:");
			numerodigitado = leitor.nextInt();
			soma = soma + numerodigitado;
			contador++;
			
			
		}while(contador <=5);
		
		System.out.println("Soma dos numeros digitados : "+soma );
		
		
		
		

	}

}
