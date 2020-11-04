package viikko10;

import java.util.HashMap;

public class Sanakirja {
	private HashMap<String, String> sanat = new HashMap<String, String>();

	public String kaanna(String sana) {
		String kaannos = sanat.get(sana);
		return kaannos;
	}
	public void lisaa(String sana, String kaannos) {
		sanat.put(sana, kaannos);
	}
}
