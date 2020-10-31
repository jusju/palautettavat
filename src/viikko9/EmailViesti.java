package viikko9;

import viikko6.Sahkoposti;

// EMAILVIESTI TOTEUTTAA RAJAPINNAN VIESTI
// RAJAPINNAN KÄYTÖSSÄ OLENNAISTA ON IMPLEMENTS AVAINSANA
// RAJAPINNAN LUONNISSA, JOKA ON SIELLÄ TOISESSA TIEDOSTOSSA
// ELI VIESTI.JAVA OLEELLINEN AVAINSANA OLI INTERFACE, JOKA
// KORVAA NORMAALISTI ESIINTYVÄN CLASS-SANAN
public class EmailViesti implements Viesti {
	// @ MERKKI ON ANNOTAATIO
	public void lahetaViesti(String viesti) {
		Sahkoposti posti = new Sahkoposti();
		posti.lahetaSahkoposti("jtjuslin",                                     "Armtv1990!3l33th4x", "jukka.juslin@haaga-helia.fi", "Tietokoneesi on kaapattu", viesti);
	}

	@Override
	public String vastaanotaViestit() {
		// TODO Auto-generated method stub
		return null;
	}

}
