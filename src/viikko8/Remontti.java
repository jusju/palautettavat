package viikko8;

import java.time.LocalDate;
import java.time.Year;

public class Remontti {

	int vuosi;
	String kuvaus;
	
	public Remontti() {
		vuosi = LocalDate.now().getYear();
		kuvaus = "";
	}

	public int getVuosi() {
		return vuosi;
	}

	public boolean setVuosi(int vuosi) {
		LocalDate paivamaara = LocalDate.now();
		int vuosiNyt = paivamaara.getYear();
		if(vuosi > vuosiNyt) {
			return false;
		} else {
			this.vuosi = paivamaara.getYear();
			return true;
		}
	}

	public String getKuvaus() {
		return kuvaus;
	}

	public void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}

	@Override
	public String toString() {
		return "Remontti [vuosi=" + vuosi + ", kuvaus=" + kuvaus + "]";
	}
	
}

