package ExercicioForWhileEDoWhile;
import java.util.*;
public class QuantosParesEQuantosImpares {

	public static void main(String[] args) {
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares.
		Scanner teclado = new Scanner(System.in);
		double numeroUser;
		int par=0,impar=0,neutro=0;
		
		for (int contador=0;contador<=9;contador++)
		{
			System.out.printf("Digite o %d número: \n",(contador+1));
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
		 System.out.printf("Você digitou %d números pares , %d números ímpares e digitou o zero [número neutro] %d vezes!",par,impar,neutro);
		
		
		
		teclado.close();
	}

}
