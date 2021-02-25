package ExerciciosLista2;
import java.util.*;

public class ColocarEmOrdemCrescente {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int listaDeNumeros[] = new int[3];   //reservou 3 espaço de memoria;
		
		// Preenche o Array a partir da 1°posição
		for (int i = 0; i < listaDeNumeros.length; i++) {
			System.out.print("Digite " + (i+1) + "° numero: ");
			listaDeNumeros[i] = ler.nextInt();
			//ler.nextLine();
		}
		// Coloca o Array em ordem crescente
		Arrays.sort(listaDeNumeros);

		// Lista o Array em ordem crescente
		System.out.println("Ordem crescente:");
		
		for (int numero : listaDeNumeros) { 
			System.out.println(numero);
		}
		
		ler.close();
	}
}