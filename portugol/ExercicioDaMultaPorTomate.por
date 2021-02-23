programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real  P = 0.0 , E = 0.0, M =0.0//Sendo E o excesso , P o peso e M a multa
		escreva ("Boas vindas ao Centro de Pesagens Agrícolas!\n")
		escreva ("Quantos quilos de tomate o senhor trouxe?\n")
			leia(P)

		limpa()
		
		se (P > 50.99)
		{
			E = P-50
			M = E*4
			
			escreva("O senhor pagará o valor de R$", M, " pelo excesso de ", E, "kg.")
			
		} 
		senao {
			escreva("O peso excedido é de ", E,  "kg e a multa é de R$" , M)
			}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 198; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */