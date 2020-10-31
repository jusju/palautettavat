package viikko5;

public class SoittolistaTestaaja {

    public static void main(String[] args) {

        System.out.println("= Suoritetaan ohjelma =\n");

        System.out.println("Soittolista soittolista = new Soittolista();\r\n" + "\r\n"
                + "Artisti artisti = new Artisti(\"Rick Astley\", 1966);\r\n" + "\r\n" + "Kappale kappale = new Kappale();\r\n"
                + "kappale.setNimi(\"Never Gonna Give You Up\");\r\n" + "kappale.setVuosi(1987);\r\n"
                + "kappale.setKesto(215);\r\n" + "kappale.setArtisti(artisti);\r\n" + "\r\n" + "soittolista.lisaaKappale(kappale);\r\n"
                + "\r\n" + "System.out.println(soittolista);\r\n" + "System.out.println(soittolista.haeKokonaispituus());\r\n"
                + "\r\n" + "Artisti artisti2 = new Artisti(\"David Hasselhoff\", 1952);\r\n" + "\r\n"
                + "Kappale kappale2 = new Kappale();\r\n" + "kappale2.setNimi(\"Hooked on a Feeling\");\r\n"
                + "kappale2.setVuosi(1997);\r\n" + "kappale2.setKesto(211);\r\n" + "kappale.setArtisti(artisti2);\r\n" + "\r\n"
                + "soittolista.lisaaKappale(kappale2);\r\n" + "\r\n" + "System.out.println(soittolista);\r\n"
                + "System.out.println(soittolista.haeKokonaispituus());");

        System.out.println("\n\n= Ohjelman tuloste =\n");
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
        kappale2.setArtisti(artisti2);
        
        soittolista.lisaaKappale(kappale2);

        System.out.println(soittolista);
        System.out.println(soittolista.haeKokonaispituus());

    }
}
