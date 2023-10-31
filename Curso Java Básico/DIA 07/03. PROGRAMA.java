package nome;

import java.util.Scanner;
import entidade.Triangulo;
import java.util.Locale;

public class Programa {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		
		System.out.println("Coloque as medidas de x");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Coloque as medidas de y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.areaOLHE();
		double areaY = y.areaOLHE();
		
		if (areaX > areaY) {
			System.out.println("A é maior. ");
		} else {
			System.out.println("B é maior. ");
		}
		
		
	}
}
