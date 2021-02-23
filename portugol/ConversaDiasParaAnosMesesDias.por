programa
{
	
	funcao inicio()
	{
		//Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 

		inteiro idadeDia, ano, mes, dia
		
		escreva("Qual sua idade em dias?")
			leia(idadeDia)
			
		ano = idadeDia/365
		idadeDia = idadeDia - ano * 365 // mes = (idadeDia % 365) / 30
		mes = idadeDia / 30 //mes = (idadeDia%365) / 30
		dia = idadeDia - mes * 30 //dia = (idadeDia%365) %30
		
		escreva ( "Anos: ", ano, "\n")
		escreva ( "Meses: " ,mes, "\n")
		escreva ("Dias: ", dia, "\n")
		
	}		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 523; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */