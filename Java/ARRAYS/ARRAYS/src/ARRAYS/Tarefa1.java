package ARRAYS;

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valores[] = new int[5];
		int maiorNumero =0;
		for(int x = 0; x<valores.length;x++)
		{
			System.out.printf("Digite o número %d: ", (x+1));
			valores[x] = input.nextInt();
		}
		for (int x= 0; x <valores.length;x++) 
		{
			System.out.printf("O  %dº número digitado foi: %d%n",(x+1),valores[x]);
			if(valores[x] > maiorNumero)
			{
				maiorNumero = valores[x];
			}
		}
		System.out.printf("A maior pontuação foi %d!",maiorNumero);
		input.close();
	}

}
