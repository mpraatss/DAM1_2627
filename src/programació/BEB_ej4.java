package programació;

import java.util.Scanner;

public class BEB_ej4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int resultado = 0;

		System.out.print("Introduce el primer número:");
		int a = scan.nextInt();
		System.out.print("Introduce el segundo número:");
		int b = scan.nextInt();

		for (int i = 0; i < b; i++) {

			System.out.print(a);
			resultado = resultado + a;

			if (i < b - 1) {
				System.out.print("+");
			}
		}

		System.out.println("=" + resultado);

		scan.close();

	}

}
