import java.util.Scanner;
public class IdadeEmAnosMesesDiasParaDias {

	public static void main(String[] args) {
	
		int anos, meses, dias, resul;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite quantos anos inteiros voc� tem: ");
		anos=ler.nextInt();
		System.out.println("Digite quantos meses (Sem contar os anos digitado acima) voc� tem: ");
		meses = ler.nextInt();
		System.out.println("Digite quantos dias sobraram (Sem contar anos e meses): ");
		dias = ler.nextInt();
		
		resul = (anos * 365) + (meses*30) + dias;
		
		System.out.println("Sua idade em dias � " + resul);

		
		
		ler.close();

	}

}