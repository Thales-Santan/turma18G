programa
{
	
	funcao inicio()
	{
		/*Faça um sistema que leia um número inteiro *
		 * e mostre uma mensagem indicando se este número é par ou ímpar, 
		 * e se é positivo ou negativo.
		 */
		 inteiro numUser
		 escreva("Escreva um número inteiro qualquer e vamos dizer o que ele é: \n")
		 	leia(numUser)
		 	

		 se (numUser > 0 e numUser %2 ==0)
		 {
		 	escreva("O número digitado é Positivo e Par!!") 
		 }
		 senao se (numUser < 0 e numUser % 2 ==0)
		 {
		 	escreva("O número digitado é Negativo e Par!!")
		 }
		 senao se (numUser > 0 e numUser %2 !=0)
		 {
		 	escreva("O número digitado é Positivo e Impar!!")
		 }
		 senao se (numUser < 0 e numUser % 2 !=0)
		 {
		 	escreva("O número digitado é Negativo e Impar!!")
		 } 
		 senao
		 {
		 	escreva("O número 0 é neutro")
		 }
		 
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 808; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */