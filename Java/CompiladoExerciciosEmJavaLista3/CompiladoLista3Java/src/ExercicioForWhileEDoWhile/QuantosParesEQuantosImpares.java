package ExercicioForWhileEDoWhile;
import java.util.*;
public class QuantosParesEQuantosImpares {

	public static void main(String[] args) {
		//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
		Scanner teclado = new Scanner(System.in);
		double numeroUser;
		int par=0,impar=0,neutro=0;
		
		for (int contador=0;contador<=9;contador++)
		{
			System.out.printf("Digite o %d n�mero: \n",(contador+1));
				numeroUser = teclado.nextDouble();
			if(numeroUser%2==0 && numeroUser!=0)
			{
				par =par+1;
			} else if (numeroUser%2!=0) {
				impar = impar+1;
			 }else {
				 neutro = neutro+1;
			 }
		}
		 System.out.printf("Voc� digitou %d n�meros pares , %d n�meros �mpares e digitou o zero [n�mero neutro] %d vezes!",par,impar,neutro);
		
		
		
		teclado.close();
	}

}
