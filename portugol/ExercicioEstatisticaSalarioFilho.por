programa
{
	
	funcao inicio()
	{
/*A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. V
 * A prefeitura deseja saber:   
a) média do salário da população; V
b) média do número de filhos; V
c)mostrar maior salário; V
d) percentual de pessoas com salário até R$100,00
		 */
		 
		inteiro mediaNumFilhos,filho, somaFil=0 , salarioMenorCem = 0
		real maiorSalario =0 ,mediaSalario,percentualSal, salario, somaSal=0

		
		 para (inteiro p = 0; p<=19 ; p++)
		{
			escreva("Qual o valor do salário?\n")
				leia(salario)
			somaSal = salario + somaSal

			escreva("Quantos filhos?\n")
				leia(filho)
			somaFil = filho + somaFil
				limpa()
			se(maiorSalario < salario)
			{
				maiorSalario = salario
			}

			se (salario <=100)
			{
				salarioMenorCem++
			}
		}
		 	
		 	mediaSalario = somaSal / 20
		 	escreva("Media salario : ", mediaSalario)

		 	mediaNumFilhos = somaFil / 20
		 	escreva ("\nMedia de filhos: ", mediaNumFilhos)

		 	escreva("\nMaior salario: " , maiorSalario)
			escreva("\nO numero de pessoas com salario menor que R$100 é: " ,(salarioMenorCem/20.0)*100, "%")
			escreva ("\n",salarioMenorCem)
		 	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 344; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */