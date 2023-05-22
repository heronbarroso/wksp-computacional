package consumo;

import java.util.Scanner;

public class ExercicioPreencherVetor {
	
	public static final int qtdVetor = 10;

	public static void main(String[] args) {
		/*
		 * preencha um vetor com 10 numeros
		 */
		int[] vetor = new int[qtdVetor];
		Scanner leitor = new Scanner(System.in);

		for (int i=0; i<vetor.length; i++) {
			System.out.println("Digite um valor para a posição["+(i+1)+"] do vetor : ");
			vetor[i]= leitor.nextInt();
		}
		
		for (int i=0; i<vetor.length; i++) 
			System.out.println("Vetor[" +(i+1)+ "]:"+ vetor[i]);
		
		leitor.close();


	}

}
