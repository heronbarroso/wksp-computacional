package pacote;

import java.util.Scanner;

public class ExercicioFatorial4 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um numero:" );
		int i, fat=1, num = leitor.nextInt();
		
		for (i=1; i<=num; i++) {
			fat = fat * i;
		}
		System.out.println(num+"!= " + fat);


	}

}
