package ExercicioForWhileEDoWhile;
import java.util.*;
public class Exercicio5DoWhile {
	/*Crie um programa que leia um n�mero do teclado at� que encontre um
	n�mero igual a zero. No final, mostre a soma dos n�meros
	digitados.(DO...WHILE)*/
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		double soma=0,numeroUser;
		
		do
		{
			System.out.println("Digite um n�mero. O programa acaba quando o 0 for digitado. ");
				numeroUser = teclado.nextDouble();
			soma = soma + numeroUser;
		} while (numeroUser!=0);
		
		System.out.printf("A soma dos n�meros digitados � %.1f.\n",soma);	
		System.out.println("FIM DO PROGRAMA!");
		teclado.close();
	}

}
