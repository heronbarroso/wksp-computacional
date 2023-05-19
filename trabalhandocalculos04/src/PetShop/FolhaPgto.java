package PetShop;

import java.util.Scanner;

/*
 * 
 * Você foi contratado para fazer o sistema de folha de pagamento da PetShop Fiap, 
 * o salário dos funcionários é calculado de acordo com a carga horária trabalhada no mês, 
 * por isso você deverá perguntar qual a quantidade de horas trabalhadas e multiplicar pelo valor da hora.
 * 
 * O funcionário pode realizar horas extras no mês, 
 * para calcular o valor da hora extra você deverá solicitar 
 * a quantidade de horas extras no mês e acrescentar 50% sobre o valor hora, por exemplo: 
 * Imagine que um funcionário tenha realizado 10 horas extras no mês, 
 * sabendo que o salário por hora é de R$ 10,00 o funcionário receberá:
 * 
 * adicional................: 10 * 0.5 (50%) = R$ 5,00
 * valor da hora extra......: 10 + 5 = R$ 15,00
 * Cálculo das horas extras = 10 * 15 = R$ 150,00
 */

public class FolhaPgto {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		boolean ok=true;
		String menu;
		
		Scanner leitorMenu = new Scanner(System.in);
		Scanner leitorNomeFuncionario = new Scanner(System.in);
		Scanner leitorValores = new Scanner(System.in);
		do {
			System.out.println("-------------------IMPUT DADOS-------------------------------");
			System.out.println("Folha de Pagamento dos Funcionarios");
			System.out.println("Informe o Nome:");
			funcionario.nome = leitorNomeFuncionario.nextLine();
			System.out.println("Informe o Valor da Hora/Mes: (ex.: 10,50): R$ ");
			funcionario.valorHoraMes = leitorValores.nextFloat();
			System.out.println("Informe a quantiade de horas trabalhadas (ex.: 160): ");
			funcionario.qtdHorasTrabalhadas = leitorValores.nextFloat();
			System.out.println("Informe a quantiade de horas Extras (ex.: 2,7): ");
			funcionario.qtdHorasExtras = leitorValores.nextFloat();
			System.out.println("------------------- FIM IMPUT DADOS--------------------------");

			InserirLinhas(3);
			
			System.out.println("Calculando folha de pagamento ....");
			funcionario.valorAdicional = funcionario.valorHoraMes * 0.5;
			funcionario.valorBaseHextra = funcionario.valorHoraMes + funcionario.valorAdicional;
			funcionario.valorCalculoHextra = funcionario.qtdHorasExtras * funcionario.valorBaseHextra;
			funcionario.valorTotalReceber = (funcionario.qtdHorasTrabalhadas* funcionario.valorHoraMes) + funcionario.valorCalculoHextra;
			
			
			InserirLinhas(3);
			System.out.println("| ------------ holerite do funcinario ------------------");
			System.out.println("|     nome: "+funcionario.nome);
			System.out.println("|     Valor Base Hora: "+funcionario.valorHoraMes);
			System.out.println("|     Percentual Hora Extra : 50% ");
			System.out.println("| ------------ Receitas adicionais ---------------------");
			System.out.println("|    Valor Adicional R$: "+ funcionario.valorAdicional);
			System.out.println("|    Valor base Hora Extra R$: "+ funcionario.valorBaseHextra);
			System.out.println("|    Valor Calculado da Hora Extra R$: "+ funcionario.valorCalculoHextra);
			System.out.println("|    Valor Total a receber R$: "+ funcionario.valorTotalReceber);
			System.out.println("| -------------------------------------------------------");
			
			InserirLinhas(3);
			
			System.out.println("Sair do programa? (s/n)");
			menu=leitorMenu.next();
			
			InserirLinhas(5);
			
			if(menu.equalsIgnoreCase("s") || menu.equalsIgnoreCase("y") ) ok = false;
			
		}while (ok);
		
		System.out.println("Bye!");


	}

	private static void InserirLinhas(int nlin) {
		for (int i=1; i<=nlin; i++) System.out.println();
	}

}

class Funcionario {
	 String nome;
	 double valorHoraMes;
	 double qtdHorasTrabalhadas;
	 double qtdHorasExtras;
	 double valorAdicional;
	 double valorBaseHextra;
	 double valorCalculoHextra;
	 double valorTotalReceber;
	 
}

