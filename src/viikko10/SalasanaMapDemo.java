package viikko10;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Properties;

public class SalasanaMapDemo {

	public static void main(String[] args) {

		try {
			Properties properties = new Properties();
			FileInputStream in = new FileInputStream("kayttajatunnukset.properties");
			properties.load(in);
			in.close();

			// HASHMAPIN LUONTI
			HashMap<String, String> tunnukset = new HashMap<String, String>();
			// ARVON LAITTAMINEN HASHMAPPIIN
			tunnukset.put("kayttajatunnus", properties.getProperty("kayttajatunnus"));
			tunnukset.put("salasana", properties.getProperty("salasana"));
			System.out.println(tunnukset);
			
		} catch (Exception ex) {
			System.out.println("Käyttäjätunnustiedostoa ei saada avattua.");
		}

	}

}
