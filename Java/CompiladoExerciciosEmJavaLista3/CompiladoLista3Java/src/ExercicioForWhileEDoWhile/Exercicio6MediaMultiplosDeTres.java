package ExercicioForWhileEDoWhile;
import java.util.Scanner;

public class Exercicio6MediaMultiplosDeTres {

	public static void main(String[] args) {
		/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
		  final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
		 0(zero).(DO...WHILE)*/ 
	Scanner teclado = new Scanner(System.in);
	int numeroUser,contadorMultiplos=0,soma=0;
	double media;
	
	System.out.println("Vamos calcular a m�dia dos n�meros m�ltiplos de 3 que voc� digitar.\n");
	do
	{
		System.out.println("Escreva um n�mero inteiro. O programa acaba quando o 0 for digitado!");
			numeroUser = teclado.nextInt();
			if(numeroUser%3==0 && numeroUser!=0)
			{
				soma = soma+numeroUser;
				contadorMultiplos++;
			}
	}while(numeroUser!=0);
	if (soma == 0)
	{
		System.out.println("Voc� n�o digitou nenhum n�mero m�ltiplo de 3. Portanto, n�o temos uma m�dia para exibir!");
	}
	else
	{
		 media = soma / contadorMultiplos;
		 System.out.printf("A m�dia dos n�meros m�ltiplos de 3 digitados � %.2f.",media);
	}
	
	teclado.close();
	}

}
