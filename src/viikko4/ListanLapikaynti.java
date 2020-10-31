package viikko4;

import java.util.ArrayList;

public class ListanLapikaynti {
	public static void main(String[] args) {
		ArrayList<String> nimet = new ArrayList<String>();
		nimet.add("Jukka");
		nimet.add("Pekka");
		for (int i = 0; i < nimet.size(); i++) {
			System.out.println(nimet.get(i));
		}
	}
}
