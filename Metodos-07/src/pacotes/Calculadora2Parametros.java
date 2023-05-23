package pacotes;

import java.util.Scanner;

public class Calculadora2Parametros {
	
	public static double resultado;//  , valor1 = 0, valor2=0;
	
	public static void exibirResultado(double valor )  {
		System.out.println("Metodo exibirResultado: O resultado foi "+ valor+"\n\n");
	}


	public static void exibirMenu(double v1 , double v2) {
		String mostraNumeros= "";
		if ((v1!=0) || (v2!=0) ) 
			mostraNumeros = "[ Valor1 : "+v1+" ; Valor2 : "+v2 + "]";
		System.out.println("PROGRAMA CALCULADORA PARAMETROS."+mostraNumeros);
		System.out.println("Escolha sua opção!");
		System.out.println("1 - Digitar valores");
		System.out.println("2 - Realizar soma");
		System.out.println("3 - Realizar subtração");
		System.out.println("4 - Realizar divisão");
		System.out.println("5 - Realizar multiplicação");
		System.out.println("6 - Sair");
	}
	
	public static void processoSomatoria(double v1, double v2) {
		System.out.println("\n\nRealizando a soma entre " + v1 + " e " + v2);
		exibirResultado(v1 + v2);
	}

	public static void processoSubtracao(double v1, double v2) {
		System.out.println("\n\nRealizando a subtração entre " + v1 + " e " + v2 );
		exibirResultado(v1 - v2);
	}


	public static void processoDivisao(double v1, double v2) {
		if (v2==0) {
			System.out.println("\n\nNão é possivel dividir " + v1 + " por " + v2 );
		}
		else
		{
			System.out.println("\n\nRealizando a divisão entre " + v1 + " e " + v2 );
			exibirResultado(v1 / v2);	
		}
		
	}

	public static void processoMultiplicacao(double v1, double v2) {
		System.out.println("\n\nRealizando a multiplicação entre " + v1 + " e " + v2 );
		exibirResultado(v1 * v2);
	}

	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int opcao = 0;
		double  valor1 = 0, valor2=0;
		while (opcao!=6) {
			
			exibirMenu(valor1, valor2);
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
				processoSomatoria(valor1, valor2);
				break;
			case 3:
				processoSubtracao(valor1, valor2);
				break;
			case 4:
				processoDivisao(valor1, valor2);
				break;
			case 5:
				processoMultiplicacao(valor1, valor2);				
				break;
			case 6:
				System.out.println("Saindo do sistema");
				break;
			}
			
		}
		leitor.close();
		

	}

}
