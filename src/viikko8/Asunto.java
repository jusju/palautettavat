package viikko8;

import java.text.DecimalFormat;

public class Asunto {
	// 1. ATTRIBUUTIT
	private String tyyppi;
	private String osoite;
	private double pintaAla;
	private double hinta;
	private String kuvaus;
	// 2. KONSTRUKTORIT (PARAMETRITÖN JA PARAMETRILLINEN)
	public Asunto() {

	}
	public Asunto(String tyyppi, String osoite, double pintaAla, double hinta, String kuvaus) {
		this.tyyppi = tyyppi;
		this.osoite = osoite;
		this.pintaAla = pintaAla;
		this.hinta = hinta;
		this.kuvaus = kuvaus;
	}
	// 3. SET- JA GET-METODIT
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
	public double getPintaAla() {
		return pintaAla;
	}
	public void setPintaAla(double pintaAla) {
		this.pintaAla = pintaAla;
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
	// 4. TOSTRING-METODI
	@Override
	public String toString() {
		DecimalFormat formaatteri = new DecimalFormat("0.00");
		String palautettava = "";
		palautettava = palautettava + "Tyyppi: " + tyyppi + "\n";
		palautettava = palautettava + "Osoite: " + osoite + "\n";
		palautettava = palautettava + "Pinta-ala: " + formaatteri.format(pintaAla) + "\n";
		palautettava = palautettava + "Hinta: " + formaatteri.format(hinta) + " euroa\n";
		palautettava = palautettava + "Kuvaus: " + kuvaus + "\n";		
		return palautettava;
	}

}
