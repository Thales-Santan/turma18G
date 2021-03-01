package ARRAYS;

import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3,
		 *  e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal
		 *  , ou seja, diagonal principal.
		 */
		int matriz[][]= new int [3][3];
		int soma = 0;
		
		for (int l = 0;l<3;l++)
		{
			for (int c = 0; c<3;c++)
			{
				System.out.printf("Entre com o valor da linha %d - coluna %d:%n",(l+1),(c+1));
				matriz [c][l] = input.nextInt();
			}
		}
		for (int l = 0;l<3;l++)
		{
			for (int c =0;c<3;c++)
			{
				soma = soma + matriz[c][l];
			}
		}
		System.out.printf("A soma dos números da Matriz é: %d.%n",soma);
		System.out.printf("A soma da diagonal principal é: %d.",(matriz[0][0] + matriz[1][1] + matriz[2][2]));
	}

}
