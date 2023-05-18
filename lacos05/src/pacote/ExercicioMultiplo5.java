package pacote;

public class ExercicioMultiplo5 {

	public static void main(String[] args) {
		int i=1, multiplo=5, contador=0;
		
		while (contador <10) {
			
			if (i % multiplo == 0) {
				System.out.print(i+" ");
				contador ++;
			}
			i++; 
		}
	}
}