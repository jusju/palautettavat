package viikko6;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		List<Integer> oikeaLottoRivi = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.print("Anna oikea rivi (7 numeroa + lisänumero): ");
		for (int i = 0; i < 8; i++) {
			int numero = input.nextInt();
			oikeaLottoRivi.add(numero);			
		}

		List<Integer> omatLottoNumerot = new ArrayList<Integer>();		
		System.out.print("Anna tarkastettava rivi (7 numeroa): ");
		for (int i = 0; i < 7; i++) {
			int numero = input.nextInt();
			omatLottoNumerot.add(numero);			
		}
		List<Integer> loppuTulos = new ArrayList<Integer>();
		loppuTulos = Leikkaus.laskeLeikkaus(oikeaLottoRivi, omatLottoNumerot);

		if(loppuTulos.contains(oikeaLottoRivi.get(7))) {
			System.out.println(loppuTulos.size() - 1 + " oikein ja lisänumero.");
		} else {
			System.out.println(loppuTulos.size() + " oikein.");
		}
		
		//Anna oikea rivi (7 numeroa + lisänumero): 4 12 14 17 23 33 35 8
		//Anna tarkastettava rivi (7 numeroa): 4 6 7 8 12 16 28
		//2 oikein ja lisänumero.

	}

}
