package viikko2;

import java.time.LocalTime;

public class Tervehdys {

	public static void main(String[] args) {
		// KOMENTO, JOLLA SAADAAN AJAN NYKYHETKI
		LocalTime nykyHetki = LocalTime.now();
		// SAADAAN AIKA KYSEISEN TIETOKONEEN KELLOLTA
		// AJAN VOISI HAKEA INTERNETISTÄKIN
		int tunnit = nykyHetki.getHour();
		
		if(tunnit >= 7 && tunnit < 10) {
			System.out.println("Hyvää huomenta!");
		} else if(tunnit < 17 && tunnit >= 10) {
			System.out.println("Hyvää päivää!");
		} else if(tunnit >=17 && tunnit < 22) {
			System.out.println("Hyvää iltaa!");
		} else if(tunnit >= 22 && tunnit <=23) {
			System.out.println("Hyvää yötä!");
		} else if(tunnit >= 0 && tunnit < 7) {
			System.out.println("Hyvää yötä!");
		}
	}

}
