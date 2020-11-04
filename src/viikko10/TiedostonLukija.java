package viikko10;

import java.io.IOException;

import java.nio.charset.Charset;

import java.nio.file.Files;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TiedostonLukija {

	private final Path polku; // polku, josta tiedosto l�ytyy

	/**
	 * 
	 * Luo uuden TiedostonLukija olion, joka pystyy lukemaan annetun tiedoston
	 * 
	 * 
	 * 
	 * @param tiedostonNimi
	 * 
	 *                      Luettavan tiedoston nimi (tiedoston sijaittava projektin
	 *                      juureessa)
	 * 
	 */
	public TiedostonLukija(String tiedostonNimi) {
		polku = Paths.get(tiedostonNimi);
		// Tarkastetaan, ett� annettu tiedosto varmasti l�ytyy
		if (!Files.exists(polku)) {
			throw new RuntimeException("Tiedostoa " + polku.toAbsolutePath() + " ei l�ydy!");
		}
	}

	/**
	 * 
	 * Lukee lukijalle asetetun tiedoston riveitt�in ja muodostaa listan, jossa
	 * 
	 * kukin tiedoston rivi on listalla erikseen.
	 * 
	 * 
	 * 
	 * @return Tiedoston sis�lt� listana
	 * 
	 */
	public List<String> lueRivit() {
		try {

			return Files.readAllLines(polku, Charset.forName("UTF-8"));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
