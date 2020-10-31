package viikko1;

import java.util.Scanner;

public class HeiEtunimi {

	public static void main(String[] args) {
		// SCANNERIN LUONTI
		// ECLIPSESSÄ CTRL+SPACE ON TÄRKEÄ
		Scanner input = new Scanner(System.in);
		// TULOSTETAAN NÄYTÖLLE JOKATAPAUKSESSA
		System.out.print("Syötä etunimi: ");
		// LUETAAN ETUNIMI MERKKIJONO NÄPPÄIMISTÖLTÄ
		String nimi;
		nimi = input.nextLine();
		// TULOSTETAAN NÄYTÖLLE SANA HEI JA SEN JÄLKEEN NIMI
		System.out.println("Hei " + nimi + "!");

	}

}
