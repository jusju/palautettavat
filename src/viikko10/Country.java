package viikko10;

public class Country implements Comparable<Country> {

    private final String name;
    private final int population;

    // RAJAPINNAN TOTEUTTAVAN LUOKAN ON TOTEUTETTAVA METODI COMPARETO JA
    // SILLÄ ON OLTAVA JOKIN TOTEUTUS ELI KOODI SISÄLLÄ, TOISIN KUIN
    // INTERFACE-TIEDOSTOSSA LUKEE VAIN public int compareTo(Country country);	
	@Override
	public int compareTo(Country country) {
		int verrattavanMaanVakiluku = country.getPopulation();
		// COMPARE TO LAITETAAN VERTAAMAAN OLIOON ITSEENSA THIS-AVAINSANALLA,
		// SEURAAVASSA HAETAAN TAMAN OLION VÄKILUKU
		int tamanMaanVakiluku = this.getPopulation();
		// TÄSSÄ VAIHEESSA PITÄISI TEHDÄ VERTAILUT JA PALAUTTAA JOKO
		// -1, 1 TAI O
		if(tamanMaanVakiluku < verrattavanMaanVakiluku) {
			return -1;
		} else if(tamanMaanVakiluku > verrattavanMaanVakiluku) {
			return 1;
		}
		return 0;
	}
    
    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return this.name + ", population: " + this.population;
    }


}
