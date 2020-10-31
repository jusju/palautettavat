package viikko5;

public class LaskuoperaatiotTest {
	public static void main(String[] args) {
		double eka = 9.0;
		double toka = 3.0;

		System.out.println("Suoritetaan testi arvoilla " + eka + " ja " + toka + ":\n");

		double summa = Laskuoperaatiot.summa(eka, toka);
		System.out.println(eka + " + " + toka + " = " + summa);

		double erotus = Laskuoperaatiot.erotus(eka, toka);
		System.out.println(eka + " - " + toka + " = " + erotus);
	}
}
class Laskuoperaatiot {

	public static double summa(double eka, double toka) {
		double summa = 0;
		summa = (eka + toka);
		return summa;
	}

	public static double erotus(double eka, double toka) {
		double erotus = 0;
		erotus = (eka - toka);
		return erotus;
	}
}


