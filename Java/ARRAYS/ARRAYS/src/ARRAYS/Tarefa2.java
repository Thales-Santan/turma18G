package ARRAYS;

import java.util.Scanner;

public class Tarefa2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lancamentos [] = new int [10];
		double somaValores=0.00, mediaAritmetica=0.00;
		int maiorPontuacao = 0,contadorMaiorPontuacao =0;
		
		for (int x=0;x<lancamentos.length;x++)
		{
			//System.out.printf("Digite o %d° lançamento: ",(x+1));
			//lancamentos[x] = input.nextInt();
			lancamentos[x] = (int)(Math.random()*6)+1;
		}
		for(int x=0;x<lancamentos.length;x++)
		{
			System.out.printf("O valor do %d° lançamento foi: %d%n",(x+1),lancamentos[x]);
			somaValores = somaValores + lancamentos[x];
			if(lancamentos[x] >= maiorPontuacao)
			{	if (lancamentos[x]>maiorPontuacao) {
				contadorMaiorPontuacao = 0;
				}
				maiorPontuacao = lancamentos[x];
				contadorMaiorPontuacao++;
			}
		}
		mediaAritmetica = somaValores / lancamentos.length;
		
		System.out.printf("O maior valor foi: %d%n",maiorPontuacao);
		System.out.printf("O maior valor apareceu %d vez(es).%n",contadorMaiorPontuacao);
		System.out.printf("A média aritmética é %.2f%n",mediaAritmetica);
		input.close();
	}
}
