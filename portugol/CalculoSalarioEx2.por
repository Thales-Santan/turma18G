programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		
		inteiro C , N , E =0.0 //C é o codigo do funcionário , N numero de horas trabalhadas, E é o excesso de horas trabalhadas

		escreva ("Digite por favor o seu código de funcionário: \n")
			leia(C)
		escreva ("Digite o número de horas trabalhadas pelo funcionário de código " , C, "\n")
			leia(N)
		limpa()
		se (N <=50) 
		{	E=0.0
			escreva("Você não tem horas extras no seu banco de horas.\n")
			escreva("Seu salário é R$" , Mat.arredondar((10*N),2))
		}
		senao 
		{
			E = N - 50
			escreva("Voce tem " , E, " hora(s) extra(s) no seu banco de horas\n")
			escreva("Seu salário é R$" , Mat.arredondar((10*N),2))
			escreva("\nSeu salario excedente por banco de horas é: " , Mat.arredondar((20*E), 2))
			escreva ("\nTotalizando R$", Mat.arredondar((10*N) + (20*E), 2))
		}
		 
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 381; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */