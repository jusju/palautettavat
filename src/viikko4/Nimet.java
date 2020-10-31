package viikko4;

import java.util.ArrayList;

public class Nimet {

	public static void main(String[] args) {
		// LISTAN LUONTI
		ArrayList<String> nimet = new ArrayList<String>();
		String nimi1 = "Matti";
		// SOLUN LISÄÄMINEN LISTAAN
		nimet.add(nimi1);
		String nimi2 = "Juha";
		nimet.add(nimi2);
		String nimi3 = "Jukka";
		nimet.add(nimi3);
		// SOLUN POISTAMINEN LISTASTA
		nimet.remove(1);
		// TULOSTETAAN INDEKSISSÄ 0 OLEVA ARVO
		System.out.println(nimet.get(0));
		System.out.println(nimet.get(1));
		System.out.println(nimet);
	}
}
