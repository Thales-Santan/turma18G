import java.util.Scanner;

public class CalculoDeExpressaoPreDefinida {

	public static void main(String[] args) {
		int A, B, C, R, S, D;
		Scanner ler = new Scanner(System.in);

		System.out.println("Escreva o valor inteiro de A: ");
			A = ler.nextInt();
		System.out.println("Escreva o valor inteiro de B: ");
			B = ler.nextInt();
		System.out.println("Escreva o valor inteiro de C: ");
			C = ler.nextInt();

		R = (int) Math.pow(A + B, 2);
		S = (int) Math.pow(B + C, 2);
		D = (R + S) / 2;

		System.out.println("O resultado é " + D);

		ler.close();
	}

}