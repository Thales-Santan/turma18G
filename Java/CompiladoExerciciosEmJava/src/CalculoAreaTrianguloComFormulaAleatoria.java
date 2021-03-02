import java.util.Scanner;

public class CalculoAreaTrianguloComFormulaAleatoria {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		double areaT1,areaT2,areaT3,ladoT1,ladoT2,ladoT3,baseT1,baseT2,baseT3,maior=0;
		
		System.out.println("Lado triangulo 1: ");
			ladoT1 = teclado.nextDouble();
		System.out.println("Base triangulo 1: ");
			baseT1 = teclado.nextDouble();
		System.out.println("Lado triangulo 2: ");
			ladoT2 = teclado.nextDouble();
		System.out.println("Base triangulo 2: ");
			baseT2 = teclado.nextDouble();
		System.out.println("Lado triangulo 3: ");
			ladoT3 = teclado.nextDouble();
		System.out.println("Base triangulo 3: ");
			baseT3 = teclado.nextDouble();
			
		areaT1 =  (baseT1*ladoT1)/2;
		areaT2 =  (baseT2*ladoT2)/2;
		areaT3 =  (baseT3*ladoT3)/2;
		
		if (areaT1 > areaT2 && areaT1 > areaT3 )
		{
			maior = areaT1;
		}
		
		else if (areaT2 > areaT1 && areaT2 > areaT3 )
		{
			maior = areaT2;
		}
		else if (areaT3 > areaT2 && areaT3 > areaT1 )
		{
			maior = areaT3;
		}
		
		System.out.printf("A base do 1° triangulo é %.2f e sua altura é %f. Sua area é: %.2f%n",baseT1,ladoT1,areaT1);
		System.out.printf("A base do 2° triangulo é %.2f e sua altura é %f. Sua area é: %.2f%n",baseT2,ladoT2,areaT2);
		System.out.printf("A base do 3° triangulo é %.2f e sua altura é %f. Sua area é: %.2f%n ",baseT3 ,ladoT3,areaT3);
		System.out.println("A maior area é " + maior);
		teclado.close();
	}

}
