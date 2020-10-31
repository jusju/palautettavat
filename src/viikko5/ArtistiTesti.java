package viikko5;

public class ArtistiTesti {

    public static void main(String[] args) {

        System.out.println("= Suoritetaan koodi =");
        System.out.println("Artisti rick = new Artisti(\"Rick\", 1966);\r\n" + "System.out.println(rick.getNimi());\r\n"
                + "System.out.println(rick.getSyntymaVuosi());\r\n" + "\r\n" + "rick.setNimi(\"Rick Astley\");\r\n"
                + "System.out.println(rick.getNimi());\r\n" + "");

        System.out.println("\n= Ohjelman tuloste =");
        Artisti rick = new Artisti("Rick", 1966);
        System.out.println(rick.getNimi());
        System.out.println(rick.getSyntymavuosi());

        rick.setNimi("Rick Astley");
        System.out.println(rick.getNimi());
    }
}


