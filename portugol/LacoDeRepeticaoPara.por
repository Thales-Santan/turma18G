programa
{
	
	funcao inicio()
	{
		inteiro numeroUser , tab =0 , resposta 

		escreva ("Informe de qual número iremos calcular a tabuada: ")
			leia(numeroUser)
		limpa()

		para (tab = 0; tab <= 10; tab++)
		{
			resposta = numeroUser * tab
			
			escreva ("\n",numeroUser, " X ", tab, " = ", resposta)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 175; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */