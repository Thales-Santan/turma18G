import java.util.Scanner;
public class MediaPonderada {
	public static void main(String[] args) {
		double nota1,nota2,nota3,media;
		//Notas com pesos 2,3 e 5 respectivamente
		Scanner ler = new Scanner (System.in);
		
	System.out.println("Digite a primeira nota: ");
		nota1 = ler.nextInt();
	System.out.println("Digite a segunda nota: ");
		nota2 = ler.nextInt();
	System.out.println("Digite a terceira e última nota: ");
		nota3 = ler.nextInt();
		
	media = (nota1 * 2/10) + (nota2 * 3/10)+(nota3*5/10);
	
	System.out.println("Sua média final foi: " + media);
		
	ler.close();
	}
}