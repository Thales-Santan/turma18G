package ExerciciosLista2;
import java.util.*;
public class LacoRepeticaoWhile {

	public static void main(String[] args) {
		//Criar um la�o de repeti�ao para ler enquanto o numero for positivo e no final mostrar o maior.
		Scanner teclado = new Scanner(System.in);
		double numeroUser;
		double maior = 0;
		
		System.out.println("Vamos jogar um jogo! Descobriremos qual � o maior. O jogo encerra quando um n�mero negativo � digitado!");
		do {
			System.out.println("Digite um n�mero: ");
			numeroUser = teclado.nextDouble();
			if (numeroUser > maior)
			{
				maior = numeroUser;
			}
		} while (numeroUser >=0);
		
		System.out.println("O maior n�mero � " + maior);
		
		
		
		
		teclado.close();


	}

}
