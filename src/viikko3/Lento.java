package viikko3;

import java.util.Scanner;

public class Lento {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Anna lennon numero: ");
		String lennonTunnus = input.nextLine();
		// SELVITETÄÄN ONKO KYSEESSÄ FINNAIRIN LENTO
		// AY105
		// OTETAAN MERKIT 1 JA 2 JA VERTAILLAAN
		if (lennonTunnus.substring(0, 2).equals("AY")) {
			// OTETAAN KOLMAS MERKKI
			String lennonNumeronKolmasMerkki = lennonTunnus.substring(2, 3);
			// MUUTETAAN KOLMAS MERKKI STRINGISTÄ NUMEROKSI
			int numero = Integer.parseInt(lennonNumeronKolmasMerkki);
			// LOPPU KOODI ELI IFFIT JA ELSET TÄHÄN VÄLIIN

			if (numero == 1) {
				System.out.println("Kaukolento");
			} else if (numero >= 2 && numero <= 6) {
				System.out.println("Kotimaan lento");
			} else if (numero == 7) {
				System.out.println("Venäjän lento");
			}
		} else {
			System.out.println("Ei ole Finnairin lento");
		}
	}
}
