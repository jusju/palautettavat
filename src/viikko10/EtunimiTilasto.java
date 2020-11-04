package viikko10;

import java.util.List;
import java.util.Scanner;
import java.util.HashMap;

public class EtunimiTilasto {

	public static void main(String[] args) {

		TiedostonLukija reader = new TiedostonLukija("etunimet.csv");
		List<String> rivit = reader.lueRivit();

		/*
		 * Testi, että lista saatiin luettua ohjelmaan for (int i = 0; i < rivit.size();
		 * i++) { System.out.println(rivit.get(i)); }
		 */

		HashMap<String, Integer> etunimet = new HashMap<>();

		// RIVIT PITÄISI KÄYDÄ LÄPI

		for (String rivi : rivit) {
			String[] osat = rivi.split(";");

			String nimi = osat[0];

			String lkm = osat[1];
			lkm = lkm.replaceAll(" ", "");
			int maara = Integer.parseInt(lkm);

			int edellinen = etunimet.getOrDefault(nimi, 0);
			etunimet.put(nimi, edellinen + maara);

		}

		Scanner input = new Scanner(System.in);
		String etunimi = "";
		while (!etunimi.equals("lopeta")) {
			System.out.print("Anna etunimi: ");
			etunimi = input.nextLine();
			if(etunimi.equals("lopeta")) {
				break;				
			}
			System.out.print(etunimi + ":" + " ");
			System.out.println(etunimet.getOrDefault(etunimi, 0) + " kappaletta");
			System.out.println();
		}
	}

}
