package viikko10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class LemppariNimet {

	public static void main(String[] args) {
		HashMap<String, List<String>> nimet = new HashMap<>(); 
		List<String> lempinimet = new ArrayList<String>();
		lempinimet.add("Bill Gates");
		lempinimet.add("JJ");
		lempinimet.add("heihei");
		
		nimet.put("Jukka", lempinimet);
		System.out.println(lempinimet);

	}

}
