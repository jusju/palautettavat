package viikko4;

import java.net.URL;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class KaupungitVerkosta {

    public static void main(String[] args) throws Exception {
        URL csvTiedosto = new URL("https://git.io/Jv3N3");

        // Luetaan Scannerin avulla netistä ladattua tietovirtaa System.in sijasta:
        Scanner lukija = new Scanner(csvTiedosto.openStream(), "utf-8");
        // 	ESITELLÄÄN LISTA, JOKA VOI SISÄLTÄÄ KAUPUNKIEN NIMET
        List<String> lista = new ArrayList<String>();
        
        // Tiedoston ensimmäinen rivi sisältää vain otsikkotiedot. Niitä ei tarvita.
        String ekaRivi = lukija.nextLine();

        // Käydään läpi rivejä, kunnes Scanner kertoo rivien loppuneen:
        while (lukija.hasNextLine()) {
            String rivi = lukija.nextLine();

            // Katkaistaan rivi pilkun kohdalta:
            int loppuindeksi = rivi.indexOf(",");
            String kaupunki = rivi.substring(0, loppuindeksi);
            String vakilukuString = rivi.substring(loppuindeksi + 1);

            int vakiluku = Integer.parseInt(vakilukuString);

            if (vakiluku >= 10000) {
                // System.out.println(kaupunki + ", väkiluku: " + vakiluku);
                // LISÄTÄÄN ENSIMMÄINEN KAUPUNKI LISTAAN
                lista.add(kaupunki);
            }
        }
        Collections.sort(lista);
        // TULOSTUS KONSOLIIN RIVI RIVILLE
        for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
        lukija.close(); // sulkee yhteyden
    }
}