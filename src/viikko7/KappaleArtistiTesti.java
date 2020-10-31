package viikko7;



public class KappaleArtistiTesti {

	public static void main(String[] args) {

		System.out.println("= Suoritetaan ohjelma =\n");

		System.out.println("Artisti artisti = new Artisti(\"Rick Astley\", 1966);\r\n"
				+ "System.out.println(artisti);\r\n" + "\r\n" + "Kappale kappale = new Kappale();\r\n"
				+ "kappale.setNimi(\"Never Gonna Give You Up\");\r\n" + "kappale.setVuosi(1987);\r\n"
				+ "kappale.setKesto(215);\r\n" + "System.out.println(kappale);\r\n" + "\r\n"
				+ "kappale.setArtisti(artisti);\r\n" + "System.out.println(kappale);");

		System.out.println("\n\n= Ohjelman tuloste =\n");
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

	private static void print(String text, Object... data) {
		System.out.printf(text + "\n", data);
	}
}

