package programació;

import java.util.Scanner;

public class BEB_ej1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int cantidad = 0;
		int num = 0;
		int mayor_0 = 0;
		int menor_0 = 0;
		int igual_0 = 0;

		System.out.println("Cuántos números quieres introducir?");
		cantidad = scan.nextInt();

		for (cantidad = cantidad; cantidad != 0; cantidad--) {
			if (cantidad > 0) {
				System.out.println("introduce el número: ");
				num = scan.nextInt();
				if (num > 0) {
					mayor_0++;
				} else if (num == 0) {
					igual_0++;
				} else {
					menor_0++;
				}
			} else {
				System.out.println("Introduce un número en positivo: ");
				cantidad = scan.nextInt();
			}

		}
		System.out.println("Números mayores a 0: " + mayor_0);
		System.out.println("Números menores a 0: " + menor_0);
		System.out.println("Números iguales a 0: " + igual_0);

		scan.close();
	}

}
