import java.util.Scanner;
public class EquaçaoPreDefinida2 {

	public static void main(String[] args) {
	//Calcula o valor das expressoes x= (ce-bf)/(ae-bd) e a expressão y=(af-cd)/(ae-bd)
	double a,b,c,d,e,f,x,y;
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Escreva o valor de A: ");
		a = ler.nextDouble();
	System.out.println("Escreva o valor de B: ");
		b = ler.nextDouble();
	System.out.println("Escreva o valor de C: ");
		c = ler.nextDouble();
	System.out.println("Escreva o valor de D: ");
		d = ler.nextDouble();
	System.out.println("Escreva o valor de E: ");
		e = ler.nextDouble();
	System.out.println("Escreva o valor de F: ");
		f = ler.nextDouble();
		
	x = (c*e - b*f) / (a*e - b*d);
	y = (a*f - c*d)/ (a*e - b*d);
	
	System.out.printf("O valor de X é: %.2f",x);
	System.out.printf("\nO valor de Y é: %.2f",y);
	

	}

}
