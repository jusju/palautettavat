package viikko7;

public class Asunto {

	private String tyyppi;
	private String osoite;
	private double ala;
	private double hinta;
	private String kuvaus;

	public Asunto() {

	}

	public Asunto(String tyyppi, String osoite, double ala, double hinta, String kuvaus) {

		this.tyyppi = tyyppi;
		this.osoite = osoite;
		this.ala = ala;
		this.hinta = hinta;
		this.kuvaus = kuvaus;

	}

	public String getTyyppi() {
		return tyyppi;
	}

	public void setTyyppi(String tyyppi) {
		this.tyyppi = tyyppi;
	}

	public String getOsoite() {
		return osoite;
	}

	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}

	public double getAla() {
		return ala;
	}

	public void setAla(double ala) {
		this.ala = ala;
	}

	public double getHinta() {
		return hinta;
	}

	public void setHinta(double hinta) {
		this.hinta = hinta;
	}

	public String getKuvaus() {
		return kuvaus;
	}

	public void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}

	@Override
	public String toString() {
		return "Asunto [tyyppi=" + tyyppi + ", osoite=" + osoite + ", ala=" + ala + ", hinta=" + hinta + ", kuvaus="
				+ kuvaus + "]";
	}

}
