programa
{
	
	funcao inicio()
	{

	/*
	 * Faça um sistema que leia o 
	 * tempo de duração de um evento em uma fábrica expressa 
	 * em segundos e mostre-o expresso em horas, minutos e segundos. 
	 */
		inteiro horas, minutos, segundos, duracaoEvento

		escreva("Qual a duraçao do evento em segundos?\n")
			leia(duracaoEvento)

		horas = duracaoEvento / 3600
		duracaoEvento = duracaoEvento - horas * 3600
		minutos = duracaoEvento / 60
		segundos = duracaoEvento - minutos * 60

		escreva (horas , "h ",minutos, "m ", segundos, "s")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */