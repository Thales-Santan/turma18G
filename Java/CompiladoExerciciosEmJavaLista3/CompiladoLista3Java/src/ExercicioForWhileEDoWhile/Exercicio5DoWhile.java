package ExercicioForWhileEDoWhile;
import java.util.*;
public class Exercicio5DoWhile {
	/*Crie um programa que leia um número do teclado até que encontre um
	número igual a zero. No final, mostre a soma dos números
	digitados.(DO...WHILE)*/
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		double soma=0,numeroUser;
		
		do
		{
			System.out.println("Digite um número. O programa acaba quando o 0 for digitado. ");
				numeroUser = teclado.nextDouble();
			soma = soma + numeroUser;
		} while (numeroUser!=0);
		
		System.out.printf("A soma dos números digitados é %.1f.\n",soma);	
		System.out.println("FIM DO PROGRAMA!");
		teclado.close();
	}

}
