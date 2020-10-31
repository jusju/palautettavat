package viikko9;

public class Opiskelija extends Henkilo {

    private int opintopisteet = 0;

    public Opiskelija(String nimi, String osoite) {
        super(nimi, osoite);
    }

    public void opiskele() {
        opintopisteet++;
    }

    public int opintopisteita() {
        return opintopisteet;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  opintopisteitä " + opintopisteet;
    }
}
