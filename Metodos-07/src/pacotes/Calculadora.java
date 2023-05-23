package pacotes;

import java.util.Scanner;

public class Calculadora {
	
	public static double resultado, valor1 = 0, valor2=0;
	
	public static void exibirResultado() {
		System.out.println("Metodo exibirResultado : O resultado foi "+ resultado);
	}

	//metodo void
	public static void exibirMenu() {
		String mostraNumeros= "";
		if ((valor1!=0) || (valor2!=0) ) 
			mostraNumeros = "[ Valor1 : "+valor1+" ; Valor2 : "+valor2 + "]";
		System.out.println("PROGRAMA CALCULADORA ."+mostraNumeros);
		System.out.println("Escolha sua opção!");
		System.out.println("1 - Digitar valores");
		System.out.println("2 - Realizar soma");
		System.out.println("3 - Realizar subtração");
		System.out.println("4 - Realizar divisão");
		System.out.println("5 - Realizar multiplicação");
		System.out.println("6 - Sair");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int opcao = 0;
		
		while (opcao!=6) {
			
			exibirMenu();

			opcao = leitor.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("\n\nDigite o 1º valor:");
				valor1 = leitor.nextDouble();
				System.out.println("\n\nDigite o 2º valor:");
				valor2 = leitor.nextDouble();				
				System.out.println("Os valores " + valor1 + " e " + valor2 + " foram armazenados\n\n");
				break;
			case 2:
				System.out.println("\n\nRealizando a soma entre " + valor1 + " e " + valor2);
				resultado = valor1 + valor2;
				exibirResultado();				
				break;
			case 3:
				System.out.println("\n\nRealizando a subtração entre " + valor1 + " e " + valor2);
				resultado = valor1 - valor2;				
				exibirResultado();
				break;
			case 4:
				System.out.println("\n\nRealizando a divisão entre " + valor1 + " e " + valor2);
				resultado = valor1 / valor2;
				exibirResultado();
				break;
			case 5:
				System.out.println("\n\nRealizando a multiplicação entre " + valor1 + " e " + valor2);
				resultado = valor1 * valor2 ;
				exibirResultado();
				break;
			case 6:
				System.out.println("Saindo do sistema");
				break;
			}
			
		}
		leitor.close();
		

	}

}
