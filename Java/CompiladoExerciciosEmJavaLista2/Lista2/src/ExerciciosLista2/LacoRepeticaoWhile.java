package ExerciciosLista2;
import java.util.*;
public class LacoRepeticaoWhile {

	public static void main(String[] args) {
		//Criar um laço de repetiçao para ler enquanto o numero for positivo e no final mostrar o maior.
		Scanner teclado = new Scanner(System.in);
		double numeroUser;
		double maior = 0;
		
		System.out.println("Vamos jogar um jogo! Descobriremos qual é o maior. O jogo encerra quando um número negativo é digitado!");
		do {
			System.out.println("Digite um número: ");
			numeroUser = teclado.nextDouble();
			if (numeroUser > maior)
			{
				maior = numeroUser;
			}
		} while (numeroUser >=0);
		
		System.out.println("O maior número é " + maior);
		
		
		
		
		teclado.close();


	}

}
