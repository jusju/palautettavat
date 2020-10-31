package viikko5;

import java.util.ArrayList;
import java.util.List;

public class Soittolista {

    private List<Kappale> kappaleet;

    public Soittolista() {
        kappaleet = new ArrayList<Kappale>();
    }

    public void lisaaKappale(Kappale uusiKappale) {
        kappaleet.add(uusiKappale);
    }

    public Kappale haeKappale(int indeksi) {
        if (indeksi < kappaleet.size()) {
            return kappaleet.get(indeksi);
        } else {
            return null;
        }
    }

    public int haeKokonaispituus() {
        int summa = 0;
        for (Kappale k : kappaleet) {
            if (k != null) {
                summa += k.getKesto();
            }
        }
        return summa;
    }

    @Override
    public String toString() {
        StringBuilder builderi = new StringBuilder();
        int laskuri = 0;
        for (Kappale k : kappaleet) {
            if (k != null) {
                String rivi = String.format("%d: %s\n", ++laskuri, k.toString());
                builderi.append(rivi);
            }
        }
        return builderi.toString().trim();
    }
}