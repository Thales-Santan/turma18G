package ExercicioForWhileEDoWhile;
import java.util.*;
public class Exercicio3WhileSobreIdades {

	public static void main(String[] args) {
		/*Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de
		 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		 idade for =-99 */
		Scanner teclado = new Scanner(System.in);
		int idade=0,menos21=0,mais50=0;
		
		System.out.println("Vamos jogar! Digite v�rias idades. Diremos quantos s�o menores que 21 e maiores que 50!");
		System.out.println("O jogo termina quando voc� digitar -99");
		
		while (idade!=-99)
		{	
			 System.out.println("Digite a idade: ");
			 idade = teclado.nextInt();
			if(idade<21 && idade!=-99) 
			{
				menos21++;
			}
			else if (idade>50) 
			{
				mais50++;
			}
				
		}

		System.out.printf("O n�mero de pessoas com menos de 21 anos �: %d. O de pessoas com mais de 50 �: %d",menos21,mais50);
		teclado.close();
	}

}
