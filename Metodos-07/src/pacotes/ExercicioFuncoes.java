package pacotes;

import java.util.Scanner;

/*Faça uma função que recebe por parâmetro os valores necessários para o

        cálculo da fórmula de báskara e retorna, também por parâmetro, as suas raízes,

        caso seja possível calcular.

        d = b² -4ac

        d = 0 => 2 raizes iguais

        d > 0 => 2 raizes diferentes

        d < 0 => não existe raiz        
        

         r = (-b +/- raiz(delta))2*a

        */

public class ExercicioFuncoes {
	
	
	public static double retornaCalculoDelta(double a, double b , double c) {
		
		System.out.println("calculando delta");
		
		return 1; 
		
	}

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double va , vb, vc, resuldado;
		System.out.println("Valor A :");
		va = leitor.nextDouble();
		System.out.println("Valor B :");
		vb = leitor.nextDouble();
		System.out.println("Valor C :");
		vc = leitor.nextDouble();
		
		
		resuldado = retornaCalculoDelta(va,vb,vc);
		
		leitor.close();
	}

}
