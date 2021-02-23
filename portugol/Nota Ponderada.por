programa
{
	
	funcao inicio()
	{
		/*Faça um sistema que leia as 3 notas de um aluno e calcule a média 
		 * final deste aluno. Considerar que a média é ponderada 
		 * e que o peso das notas é: 2,3 e 5, respectivamente. 
		 */
		 real nota1, nota2, nota3 , media1,media2,media3
		 escreva("Qual o valor da primeira nota?\n")
		 	leia(nota1)
		 escreva("Qual o valor da segunda nota?\n")
		  	leia(nota2)
		 escreva("Qual o valor da terceira nota?\n")
		 	leia(nota3)

		 media1 = nota1 * 2/10
		 media2 = nota2 * 3/10
		 media3 = nota3 * 5/10

		 escreva("Sua media é " , media1+media2+media3)
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 553; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */