package viikko10;

import java.util.List;
import java.util.HashMap;

public class EtunimiTilasto {

	public static void main(String[] args) {

		TiedostonLukija reader = new TiedostonLukija("etunimet.csv");
		List<String> rivit = reader.lueRivit();
		
		HashMap<String, Integer> Etunimet = new HashMap<>();
		
		for (String eka : rivit) {
			String[] osat = eka.split(";");

			String nimi = osat[0];
			
			String lkm = osat[1];
			lkm = lkm.replaceAll(" ", "");
			int maara = Integer.parseInt(lkm);
			
			int edellinen = Etunimet.getOrDefault(nimi,0);
			Etunimet.put(nimi, edellinen + maara);
			
		}
		
		
		
		
		System.out.println(Etunimet);
	}

}
