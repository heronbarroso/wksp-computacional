package pacote;

import java.util.Scanner;

public class ForNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		
		double soma=0, nota;
		int i=1;
		
		while(i<=5) {
			System.out.print("Digite uma nota:");
			nota = leitor.nextDouble();
			System.out.println("computando...");
			soma = soma + nota;
			i++;
		}
		
		System.out.println("Média : " + soma /5);
		

	}

}
