package ExerciciosLista2;
import java.util.Scanner;
public class ParOuImparEx4 {

	public static void main(String[] args) {
		//Informa se o numero digitado é par ou impar, se par, calcula a raiz, se impar, eleva ao quadrado.
		int numeroUser;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número qualquer: ");
		 numeroUser = teclado.nextInt();
		
		 if(numeroUser%2 ==0) {
			 System.out.println("O número digitado é par!");
			 System.out.println("A raiz quadrada desse mesmo número é " + Math.sqrt(numeroUser));
		 }else {
			 System.out.println("O número digitado é impar!");
			 System.out.println("O valor do número elevado ao quadrado é " + Math.pow(numeroUser, 2));
		 }
		teclado.close();
	}

}
