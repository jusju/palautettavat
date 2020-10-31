package viikko7;

public class Kappale {
	// 1. ATTRIBUUTIT
	private String nimi;
	// HUOMAA, ETTÄ ATTRIBUUTIN TIETOTYYPIN EI TARVITSE OLLA VAIN STRING...
	private Artisti artisti;
	private int vuosi;
	private int kesto;
	
	// 2. KONSTRUKTORI(T)
	public Kappale() {
		
	}

	// 3. GET- SET-METODIT
	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public Artisti getArtisti() {
		return artisti;
	}

	public void setArtisti(Artisti artisti) {
		this.artisti = artisti;
	}

	public int getVuosi() {
		return vuosi;
	}

	public void setVuosi(int vuosi) {
		this.vuosi = vuosi;
	}

	public int getKesto() {
		return kesto;
	}

	public void setKesto(int kesto) {
		this.kesto = kesto;
	}

	// 4. TOSTRING-METODI
	public String toString() {
		if(artisti == null) {
			return this.nimi;
		} else {
			return this.nimi + " by " + this.artisti;
		}
	}
}
