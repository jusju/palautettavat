package viikko9;

public class SaastoTili extends Tili {
	private int sallitutNostojenMaaraVuodessa;

	public SaastoTili() {
		super();
	}

	public SaastoTili(int sallitutNostojenMaaraVuodessa) {
		super();
		this.sallitutNostojenMaaraVuodessa = sallitutNostojenMaaraVuodessa;
	}

	@Override
	public String toString() {
		return "SaastoTili [sallitutNostojenMaaraVuodessa=" + sallitutNostojenMaaraVuodessa + "]";
	}

}
