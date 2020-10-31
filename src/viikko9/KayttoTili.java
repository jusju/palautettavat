package viikko9;

public class KayttoTili extends Tili  {
	private double kateisNostonRaja;

	public KayttoTili() {
		super();
	}

	public KayttoTili(double kateisNostonRaja) {
		super();
		this.kateisNostonRaja = kateisNostonRaja;
	}

	public double getKateisNostonRaja() {

		return kateisNostonRaja;
	}

	// DEMO SIITÄ MITEN PERIYTYMINEN VAIKUTTAA JA TUO KAYTTOON
	// YLILUOKAN METODEJA
	public void setKateisNostonRaja(double kateisNostonRaja) {
		if(getSaldo() < kateisNostonRaja) {
			System.out.println("Ei ole rahaa edes senverran");
		} else {
			this.kateisNostonRaja = kateisNostonRaja;	
		}
	}

	@Override
	public String toString() {
		return "KayttoTili [kateisNostonRaja=" + kateisNostonRaja + "]";
	}
	
}
