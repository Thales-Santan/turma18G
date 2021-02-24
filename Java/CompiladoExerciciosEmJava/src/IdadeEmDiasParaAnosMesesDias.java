import java.util.Scanner;

public class IdadeEmDiasParaAnosMesesDias {

	public static void main(String[] args) {
		
		int idadeUser, anos, meses, dias;
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite sua idade em dias: ");
		idadeUser = ler.nextInt();
		
		anos = idadeUser / 365;
		idadeUser = idadeUser - anos*365;
		meses = idadeUser / 30;
		dias = idadeUser - meses*30;
		
		System.out.printf("Você tem %d ano(s), %d mese(s),e %d dia(s)!", anos,meses,dias);
		
		ler.close();
	}

}