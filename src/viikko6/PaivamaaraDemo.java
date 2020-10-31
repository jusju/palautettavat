package viikko6;

import java.time.LocalDate;
import java.util.Scanner;

public class PaivamaaraDemo {

	public static void main(String[] args) {
		// KOMENTORIVILTÄ ON MAHDOLLISTA LUKEA PARAMETREJÄ
		// NE ON TAULUKOSSA NIMELTÄÄN ARGS
		if(args[0] != null) {
			// LAITETAAN OHJELMA SULKEUTUMAAN, JOS ON VUOSI 2020
			if(args[0].equals("2020")) {
				System.out.println("Ihan paska vuosi.");
				System.out.println("Lopetan tähän.");
				System.exit(0);				
			}
		}
		
		LocalDate spaiva;
		String paiva;
		Scanner input = new Scanner(System.in);
		System.out.print("Anna syntymäpäiväsi (vvvv-kk-pp): ");
		paiva = input.nextLine();
		try {
			spaiva = LocalDate.parse(paiva);
			// LISÄTÄÄN PÄIVIÄ
			spaiva = spaiva.plusDays(10);
			int vuosi = spaiva.getYear();
			int nytVuosi = LocalDate.now().getYear();
			if (vuosi > nytVuosi) {
				System.out.println("Syntymävuosi ei voi olla tulevaisuudessa ");
			} else {
				System.out.println("Syntymävuosi on " + vuosi);
				System.out.println(spaiva.getMonthValue());
			}
		} catch (Exception error) {
			System.out.println("Syntymäpäivä on virheellinen");
		}
	}

}
