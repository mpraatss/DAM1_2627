package programació;

import java.util.Scanner;

public class BEB_ej3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce el primer número: ");
		int a = scan.nextInt();
		System.out.print("Introduce el segundo número: ");
		int b = scan.nextInt();

		if (a > b) {
			int cambio = a;
			a = b;
			b = cambio;
		}

		System.out.println("Números pares entre " + a + " y " + b + ":");
		for (int i = a; i <= b; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		scan.close();
	}

}
