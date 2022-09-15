package _12_circle_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double r, area;

	    System.out.print("Digite o valor do raio do circulo: ");
	    r = sc.nextDouble();

	    area = 3.14159 * r * r;

	    System.out.printf("AREA = %.3f\n", area);

		sc.close();
	}
}