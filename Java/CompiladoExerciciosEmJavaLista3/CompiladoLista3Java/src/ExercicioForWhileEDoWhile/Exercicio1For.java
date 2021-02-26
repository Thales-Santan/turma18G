package ExercicioForWhileEDoWhile;

public class Exercicio1For {

	public static void main(String[] args) {
		/*Informar todos os números de 1000 a 1999 que quando divididos por 11
		obtemos resto = 5*/
		
		for (int contador = 1000; contador<=1999;contador++)
		{
			if((contador%11==5))
			{
				System.out.println(contador);
			}
		}

	}

}
