programa
{
	
	funcao inicio()
	{
		
		real baseTri, ladoTri
		escreva("Qual o valor da base do triangulo?\n")
			leia(baseTri)
		escreva("Qual o altura do triangulo?\n")
			leia(ladoTri)

		limpa()

		se(baseTri > 0 e ladoTri > 0)
		{
		 	escreva("A área do triangulo é " , (baseTri * ladoTri)/2)
		} 
		senao
		{
			escreva("Os valores digitados não são válidos. Por favor tente novamente digitando valores positivos maiores que 0!")
		}
		
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 445; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */