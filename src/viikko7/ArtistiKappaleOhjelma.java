package viikko7;

public class ArtistiKappaleOhjelma {

	public static void main(String[] args) {

		Artisti artisti = new Artisti("Rick Astley", 1966);
		System.out.println(artisti);
		Kappale kappale = new Kappale();
		kappale.setNimi("Never Gonna Give You Up");
		kappale.setVuosi(1987);
		kappale.setKesto(215);
		System.out.println(kappale);
		kappale.setArtisti(artisti);
		System.out.println(kappale);

	}

}
