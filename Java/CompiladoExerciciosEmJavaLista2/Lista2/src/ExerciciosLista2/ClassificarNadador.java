package ExerciciosLista2;
import java.util.Scanner;
public class ClassificarNadador
{

	public static void main(String[] args) 
	{
		Scanner tc = new Scanner(System.in);
		int idade;
		
		System.out.println("Escreva a idade do nadador: ");
			idade = tc.nextInt();
			
		if (idade>=5 && idade<=7)
		{
			System.out.println("Voce está na categoria INFANTIL A (Entre 5 e 7 anos)");
		} else if (idade>=8 && idade<=11) {
			System.out.println("Voce está na categoria INFANTIL B (Entre 8 e 11 anos)");
		}else if (idade>=12 && idade<=13) {
			System.out.println("Voce está na categoria JUVENIL A (Entre 12 e 13 anos)");
		}else if(idade>=14 && idade <=17) {
			System.out.println("Voce está na categoria JUVENIL B (Entre 14 e 17 anos)");
		} else if(idade>18) {
			System.out.println("Voce está na categoria ADULTOS (Maiores de 18)");
		}else {
			System.out.println("Voce não tem idade suficiente para participar!");
		}
		

	}

}