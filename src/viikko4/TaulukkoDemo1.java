package viikko4;

public class TaulukkoDemo1 {

	public static void main(String[] args) {
		// LUODAAN INT TYYPPISIÄ ARVOJA SISÄLTÄVÄ TAULUKKO
		// JONKA MAKSIMIKOKO ON 5, TAULUKON NIMI ON ARVOSANAT
		int[] arvosanat = new int[5];
		// TALLENNETAAN TAULUKON INDEKSIIN 0 ARVO 5
		//arvosanat[0] = 5;
		// TAULUKKOA EI SAA TULOSTETUA NÄIN
		System.out.println(arvosanat);
		// TAULUKON LÄPIKÄYNTI FOR-SILMUKALLA - TYYPILLISIN TAPA KÄSITELLÄ TAULUKKOA
		for (int i = 0; i < arvosanat.length; i++) {
			// YHDEN ARVON HAKEMINEN TAULUKOSTA
			int korotettu = arvosanat[i] + 1;
			arvosanat[i] = korotettu;
			System.out.println(korotettu);
		}
	}
}
