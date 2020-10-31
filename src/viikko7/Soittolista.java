package viikko7;

import java.util.ArrayList;

// KOHDELUOKKA
public class Soittolista {
	// 1. YKSITYINEN OLIOMUUTTUJA ELI ATTRIBUUTIT
	private ArrayList<Kappale> kappaleet;
	
	// 2. KONSTRUKTORI(T)
	public Soittolista() {
		// TÄSSÄ VAIHEESSA KUN SOITTOLISTAOHJELMASSA LUODAAN
		// SOITTOLISTA, NIIN ONGELMAKSI TULEE SE, ETTÄ
		// KAPPALEET LISTAA EI OLE VIELÄKÄÄN LUOTU KOSKAAN
		// NEW AVAINSANALLA. 
		kappaleet = new ArrayList<Kappale>();
	}

	// MUITA METODEITA
	public void lisaaKappale(Kappale kappale) {
		kappaleet.add(kappale);
	}
	public Kappale getKappale(int indeksi) {
		// YKSI TAPA TEHDÄ ON TARKISTAA ENSIN ONKO HAETTAVA
		// INDEKSI LIIAN SUURI ELI ETTÄ LISTALLA EI OLE NIIN
		// MONTAA KAPPALETTA
		if(indeksi <= (kappaleet.size()-1)) {
			return null;
		} else {
			Kappale kappale = kappaleet.get(indeksi);
			return kappale;
		}
	}
	
	public int haeKokonaispituus() {
		// SOITTOLISTAN KOKONAISPITUUS PITÄISI LASKEA
		// TEHDÄÄN KERRYTYSROOLINEN MUUTTUJA KOKONAISPITUUS
		int kokonaispituus=0;
		for (int i = 0; i < kappaleet.size(); i++) {
			// ENSIN HAETAAN KAPPALE
			Kappale kappale = kappaleet.get(i);
			// SITTEN SEN PITUUS
			kokonaispituus = kokonaispituus + kappale.getKesto();
		}
		return kokonaispituus;
	}
	
	
	// 4. TOSTRING
	public String toString() {
		int indeksi = 1;
		// KERRYTYSTYYPPINEN MUUTTUJA	
		String paluuArvo = "";
		for (int i = 0; i < kappaleet.size(); i++) {
			paluuArvo = paluuArvo + indeksi + ": " + kappaleet.get(i) +"\n";
			indeksi++;
		}
		return paluuArvo;
	}
		
}
