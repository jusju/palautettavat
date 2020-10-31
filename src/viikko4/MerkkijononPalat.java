package viikko4;

import java.util.Scanner;

public class MerkkijononPalat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Kirjoita lause: ");
		String lause = input.nextLine();
		// LUODAAN TAULUKKO SOLUT, JOHON SPLITATAAN LAUSEEN SANAT
		// KÄYTTÄEN SPACEA EROTINKOHTANA
		String[] sanat = lause.split(" ");
		// TYHJÄ SYSO TEKEE TYHJÄN RIVIN
		System.out.println();
		// SEURAAVAKSI TULOSTETAAN TAULUKON ARVOT NÄYTÖLLE
		for (int i = 0; i < sanat.length; i++) {
			System.out.println(sanat[i]);
		}
	}
}
