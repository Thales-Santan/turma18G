package ExerciciosLista2;
import java.util.Scanner;
public class ParOuImparEx4 {

	public static void main(String[] args) {
		//Informa se o numero digitado � par ou impar, se par, calcula a raiz, se impar, eleva ao quadrado.
		int numeroUser;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um n�mero qualquer: ");
		 numeroUser = teclado.nextInt();
		
		 if(numeroUser%2 ==0) {
			 System.out.println("O n�mero digitado � par!");
			 System.out.println("A raiz quadrada desse mesmo n�mero � " + Math.sqrt(numeroUser));
		 }else {
			 System.out.println("O n�mero digitado � impar!");
			 System.out.println("O valor do n�mero elevado ao quadrado � " + Math.pow(numeroUser, 2));
		 }
		teclado.close();
	}

}
