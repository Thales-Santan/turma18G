package ExercicioForWhileEDoWhile;
import java.util.Scanner;
public class Exercicio4PesquisaUsandoWhile {

	public static void main(String[] args) {
		/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.*/
		
		//Exercício resolvido pelo professor. Foi copiado até a parte dos If's, revisado e testado por mim.
		Scanner teclado = new Scanner(System.in);
		
		int idade;
		char sexo,humor;
		char opcao = 'S';
		int contador =1;
		int pessoaCalma = 0,mulherNervosa=0,homemAgressivo=0,outrosCalmos=0,pessoaNervosaMais40=0,pessoaCalmaMenos18=0;
		
		
		while(opcao == 'S' || contador<=150)
		{
		System.out.printf("Digite a idade da %d° pessoa: \n",contador);
			idade = teclado.nextInt();
		System.out.println("Digite sexo: 1-Feminino, 2-Masculino, 3-Outros");
			sexo = teclado.next().charAt(0);
		System.out.println("A pessoa é: 1-calma, 2-Nervosa, 3-Agressiva");
			humor = teclado.next().charAt(0);
			
		if(humor=='1')
		{
			pessoaCalma++;
		}
		if(humor=='2' && sexo =='1')
		{
			mulherNervosa++;
		}
		if(humor=='3'&& sexo=='2')
		{
			homemAgressivo++;
		}
		if(humor =='1'&& sexo=='3')
		{
			outrosCalmos++;
		}
		if (humor=='2'&& idade>=40)
		{
			pessoaNervosaMais40++;
		}
		if(humor=='1' && idade<18)
		{
			pessoaCalmaMenos18++;
		}		
		System.out.println("Continua S-sim ou N-nao");
			opcao = teclado.next().toUpperCase().charAt(0);
		if (opcao!='S') 
		{
			break;
		}

	}
			System.out.println("O número total de pessoas calmas é: " +pessoaCalma );
			System.out.println("O número de mulheres nervosas é: "+mulherNervosa );
			System.out.println("O número de homens agressivos é: " +homemAgressivo );
			System.out.println("O número de outros calmos é: " +outrosCalmos );
			System.out.println("O número de pessoas nervosas com mais de 40 anos é: " +pessoaNervosaMais40 );
			System.out.println("O número de pessoas calmas com menos de 18 anos é: " +pessoaCalmaMenos18 );
			System.out.println("FIM DA PESQUISA");
			teclado.close();
	}
}
