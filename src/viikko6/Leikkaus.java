package viikko6;

import java.util.ArrayList;
import java.util.List;

public class Leikkaus {

	public static void main(String[] args) {
		List<Integer> omatNumerot = new ArrayList<Integer>();
		omatNumerot.add(1);
		omatNumerot.add(2);
		omatNumerot.add(3);
		omatNumerot.add(4);
		omatNumerot.add(5);
		omatNumerot.add(6);
		omatNumerot.add(7);
		List<Integer> oikeaLottoRivi = new ArrayList<Integer>();
		oikeaLottoRivi.add(7);
		oikeaLottoRivi.add(8);
		oikeaLottoRivi.add(9);
		oikeaLottoRivi.add(10);
		oikeaLottoRivi.add(11);
		oikeaLottoRivi.add(12);
		oikeaLottoRivi.add(13);
		
		List<Integer> oikeinSinullaOli = laskeLeikkaus(oikeaLottoRivi, omatNumerot);
		System.out.println(oikeinSinullaOli);
	}
	
	public static List<Integer> laskeLeikkaus(List<Integer> oikeaLottoRivi,
			List<Integer> omatNumerot) {
		List<Integer> oikeatNumerot = new ArrayList<Integer>();
		// PITÄISI SELVITTÄÄ, MITKÄ LOTTONUMEROT ON MINULLA OIKEIN
		for (int i = 0; i < omatNumerot.size(); i++) {
			int omaNumero = omatNumerot.get(i);
			for (int j = 0; j < oikeaLottoRivi.size(); j++) {
				if(omaNumero == oikeaLottoRivi.get(j)) {
					oikeatNumerot.add(omaNumero);
				}
			}
		}
		return oikeatNumerot;
	}
}
