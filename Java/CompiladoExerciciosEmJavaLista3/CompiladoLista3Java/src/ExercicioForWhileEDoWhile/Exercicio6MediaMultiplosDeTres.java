package ExercicioForWhileEDoWhile;
import java.util.Scanner;

public class Exercicio6MediaMultiplosDeTres {

	public static void main(String[] args) {
		/*Escrever um programa que receba vários números inteiros no teclado. E no
		  final imprimir a média dos números múltiplos de 3. Para sair digitar
		 0(zero).(DO...WHILE)*/ 
	Scanner teclado = new Scanner(System.in);
	int numeroUser,contadorMultiplos=0,soma=0;
	double media;
	
	System.out.println("Vamos calcular a média dos números múltiplos de 3 que você digitar.\n");
	do
	{
		System.out.println("Escreva um número inteiro. O programa acaba quando o 0 for digitado!");
			numeroUser = teclado.nextInt();
			if(numeroUser%3==0 && numeroUser!=0)
			{
				soma = soma+numeroUser;
				contadorMultiplos++;
			}
	}while(numeroUser!=0);
	if (soma == 0)
	{
		System.out.println("Você não digitou nenhum número múltiplo de 3. Portanto, não temos uma média para exibir!");
	}
	else
	{
		 media = soma / contadorMultiplos;
		 System.out.printf("A média dos números múltiplos de 3 digitados é %.2f.",media);
	}
	
	teclado.close();
	}

}
