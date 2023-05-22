package consumo;
import java.util.Scanner;

public class TesteVetores {

	public static final int qdtAluno = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double total = 0;
		Scanner leitor = new Scanner(System.in);
		
		double[] alunos = new double[qdtAluno];
		String[] nomeAlunos = {"joao", "jose", "andre", "marcos", "ruivo", "ryan", "fernando", "francis", "rafael", "hugo"};
		
		int i;
		for (i=0; i<alunos.length; i++) {
			System.out.println("Por favor, digite o consumo do "+(i+1)+" .Aluno - "+nomeAlunos[i]+": ");
			alunos[i] = leitor.nextDouble();
			total = total + alunos[i];
		}
		for (i=0; i<alunos.length; i++) 
			System.out.println("O aluno "+i+"-"+nomeAlunos[i]+" consumiu : R$ "+alunos[i]);

				
		System.out.println("O total consumidos pelos aluno: "+total );
		leitor.close();

	}

}
