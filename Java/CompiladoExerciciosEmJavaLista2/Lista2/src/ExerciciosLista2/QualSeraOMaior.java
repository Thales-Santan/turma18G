package ExerciciosLista2;
import java.util.Scanner;
public class QualSeraOMaior {

	public static void main(String[] args) {
		
		//Informa qual dos 3 numeros digitados é maior.
		int num1,num2,num3,maior=0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Vamos descobrir juntos qual número inteiro é o maior!");
		System.out.println("Digite o primeiro número inteiro: ");
			num1 = teclado.nextInt();
			maior = num1;
		System.out.println("Digite o segundo número inteiro: ");
			num2 = teclado.nextInt();
			if(maior<=num2)
			{
				maior=num2;
			}
		System.out.println("Digite o terceiro número inteiro: ");
			num3 = teclado.nextInt();
			if(maior<num3)
			{
				maior=num3;
			}
			
			if (num1 == num2 && num2 == num3) {
				System.out.println("Os números digitador foram iguais, portanto todos tem o mesmo valor.");
				System.out.printf("O numero repetido foi o número %d!",maior);
			}else {
				System.out.printf("O maior número é o %d!", maior);
			}
		
			
			teclado.close();
	}

}
