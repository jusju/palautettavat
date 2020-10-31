package viikko7;

public class SoittolistaOhjelma {

	public static void main(String[] args) {
		Soittolista soittolista = new Soittolista();

		Artisti artisti = new Artisti("Rick Astley", 1966);
		Kappale kappale = new Kappale();
		kappale.setNimi("Never Gonna Give You Up");
		kappale.setVuosi(1987);
		kappale.setKesto(215);
		kappale.setArtisti(artisti);
		soittolista.lisaaKappale(kappale);
		System.out.println(soittolista);
		System.out.println(soittolista.haeKokonaispituus());
		Artisti artisti2 = new Artisti("David Hasselhoff", 1952);
		Kappale kappale2 = new Kappale();
		kappale2.setNimi("Hooked on a Feeling");
		kappale2.setVuosi(1997);
		kappale2.setKesto(211);
		kappale.setArtisti(artisti2);
		soittolista.lisaaKappale(kappale2);
		System.out.println(soittolista);
		System.out.println(soittolista.haeKokonaispituus());
	}

}
