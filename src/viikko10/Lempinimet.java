package viikko10;

import java.util.Map;
import java.util.TreeMap;

public class Lempinimet {
	
	public static void main(String[] args) {
		Map<String, String> nimet = new TreeMap<String, String>();
		nimet.put("Teemu", "The Finnish Flash");
		nimet.put("Jari", "Litti");
		nimet.put("Kaisa-Leena", "Kappa");
		System.out.println(nimet);
	}
}
