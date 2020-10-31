package viikko6;

public class TiliOhjelma {

	public static void main(String[] args) {
		// OLION ELI MUUTTUJAN LUONTI LUOKASTA
		// KAYTETAAN PARAMETRITONTA KONSTRUKTORIA
		Tili tili = new Tili();
		// OLION LUONTI KAYTTAEN PARAMETRILLISTA KONSTRUKTORIA
		Tili saastotili = new Tili(2000000);
		tili.pano(200);
		// KUTSUTAAN TILI-LUOKAN SET-METODIA
		tili.setSaldo(4000000);
		// KUTSUTAAN TILI-LUOKAN GET-METODIA
		System.out.println(tili.getSaldo());
		System.out.println(tili);
	}

}
