package viikko9;

// AINA KUN KYSEESSA KOHDELUOKKA - ELI ENTITY, MUISTA KOHDAT 1-4	
public class Tili {
	// 1. OLIOMUUTTUJAT ELI ATTRIBUUTIT
	private String tilinumero;
	private double saldo;
	private String omistaja;

	// 2. KONSTRUKTORIT
	public Tili() {
		super();
	}

	public Tili(String tilinumero, double saldo, String omistaja) {
		super();
		this.tilinumero = tilinumero;
		this.saldo = saldo;
		this.omistaja = omistaja;
	}

	// 3. GET/SET METODIT
	public String getTilinumero() {
		return tilinumero;
	}

	public void setTilinumero(String tilinumero) {
		this.tilinumero = tilinumero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getOmistaja() {
		return omistaja;
	}

	public void setOmistaja(String omistaja) {
		this.omistaja = omistaja;
	}

	// 4. TOSTRING-METODI
	@Override
	public String toString() {
		return "Tili [tilinumero=" + tilinumero + ", saldo=" + saldo + ", omistaja=" + omistaja + "]";
	}

}
