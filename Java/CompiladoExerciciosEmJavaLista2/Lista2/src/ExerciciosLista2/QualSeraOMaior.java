package ExerciciosLista2;
import java.util.Scanner;
public class QualSeraOMaior {

	public static void main(String[] args) {
		
		//Informa qual dos 3 numeros digitados � maior.
		int num1,num2,num3,maior=0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Vamos descobrir juntos qual n�mero inteiro � o maior!");
		System.out.println("Digite o primeiro n�mero inteiro: ");
			num1 = teclado.nextInt();
			maior = num1;
		System.out.println("Digite o segundo n�mero inteiro: ");
			num2 = teclado.nextInt();
			if(maior<=num2)
			{
				maior=num2;
			}
		System.out.println("Digite o terceiro n�mero inteiro: ");
			num3 = teclado.nextInt();
			if(maior<num3)
			{
				maior=num3;
			}
			
			if (num1 == num2 && num2 == num3) {
				System.out.println("Os n�meros digitador foram iguais, portanto todos tem o mesmo valor.");
				System.out.printf("O numero repetido foi o n�mero %d!",maior);
			}else {
				System.out.printf("O maior n�mero � o %d!", maior);
			}
		
			
			teclado.close();
	}

}
