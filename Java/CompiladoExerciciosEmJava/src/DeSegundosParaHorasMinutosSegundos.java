import java.util.Scanner;
public class DeSegundosParaHorasMinutosSegundos {

	public static void main(String[] args) {
		int numeroUser, horas, minutos, segundos;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a duração do evento em segundos: ");
		numeroUser = ler.nextInt();
		
		horas = numeroUser/3600;
		minutos = (numeroUser - (horas*3600))/60;
		segundos = numeroUser - (horas*3600 + minutos*60);
		
		System.out.printf("A duração do evento foi %d hora(s), %d minuto(s) e %d segundo(s)!",horas,minutos,segundos);
		
		ler.close();

	}

}