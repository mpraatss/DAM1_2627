package programació;

import java.util.Scanner;

public class BEB_ej2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] vocales = { "a", "e", "i", "o", "u" };
		boolean espacio = true;

		while (espacio == true) {
			System.out.println("introduce un carácter");
			String entrada = scan.nextLine();
			char letra = entrada.charAt(0);

			if (letra == ' ') {
				espacio = false;

			}
		}

	}

}
