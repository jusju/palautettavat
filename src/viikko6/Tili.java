package viikko6;

// KOHDELUOKKA. AINA TEHTÄESSÄ SEURAAVAT ASIAT TULEVAT TÄSSÄ JÄRJESTYKSESSÄ
public class Tili {
	
	// 1. ATTRIBUUTTIEN TAI ATTRIBUUTIN MÄÄRITYS
	private double saldo;
	
	// 2. PARAMETRITÖN KONSTRUKTORI, SANOTAAN JOSKUS OLETUSKONSTRUKTORIKSI
	public Tili() {
		saldo = 10.0;
	}
	// PARAMETRILLINEN KONSTRUKTORI
	public Tili(double saldo) {
		this.saldo = saldo;
	}
	
	public void pano(double maara) {
		saldo = saldo + maara;
	}
	// 3. GET ja SET-METODIT
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	// 4. TOSTRING-METODI
	public String toString() {
		return "Tili [saldo=" + saldo + "]";
	}
}
