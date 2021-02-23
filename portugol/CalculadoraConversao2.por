programa
{ inclua biblioteca Matematica -->Mat
	
	funcao inicio()
	{
		real dolar, realb 
		inteiro numeroUser , contador =0

		escreva("Quantas vezes iremos realizar conversões?\n")
			leia(numeroUser)
		escreva("Qual o valor atual do dolar?\n")
			leia(dolar)

		enquanto ( contador < numeroUser)
		{
			escreva("\nQuantos reais iremos converter em dolar?\n")
				leia(realb)
			escreva ("Voce terá ",Mat.arredondar((realb/dolar), 2), " em dolares!\n")

			contador++
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 444; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */