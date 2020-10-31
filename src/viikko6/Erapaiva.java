package viikko6;

import java.time.LocalDate;
import java.util.Scanner;

public class Erapaiva {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna laskun päivämäärä (vvvv-kk-pp): ");
		String paivamaaraString = input.nextLine();
		// MUUTETAAN MERKKIJONO PÄIVÄMÄÄRÄ TYYPPISEKSI
		LocalDate paivamaara = LocalDate.parse(paivamaaraString);
		// LISÄTÄÄN 14 PÄIVÄÄ PÄIVÄMÄÄRÄÄN
		paivamaara = paivamaara.plusDays(14);
		System.out.println(
				"Eräpäivä on " + paivamaara);

	}

}
