package ExerciciosLista2;
import java.util.Scanner;
public class TesteCriacaoNovoMetodo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numLinha=0;
		
		System.out.println("Digite qual será o tamanho da linha: ");
			numLinha = leia.nextInt();
		Linha(numLinha);
		leia.close();	
	}
	
	public static void Linha (int numLinha)
	{
		for(int i = 0;i<numLinha;i++)
		{
			System.out.print("-");
		}
	}
}
