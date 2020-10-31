package viikko8;

import java.util.ArrayList;
import java.util.List;

public class Leikkaus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listaA = new ArrayList<Integer>();
		List<Integer> listaB = new ArrayList<Integer>();
		Leikkaus leikkaus = new Leikkaus();
		listaA.add(2);
		listaA.add(3);
		listaA.add(22);
		listaA.add(3);
		listaA.add(25);

		listaB.add(2);
		listaB.add(4);
		listaB.add(25);
		listaB.add(3);
		listaB.add(21);

		System.out.println(listaA);
		System.out.println(listaB);
		System.out.println("Listojen A ja B leikkaus: " + leikkaus.laskeLeikkaus(listaA, listaB));

	}

	public static List<Integer> laskeLeikkaus(List<Integer> listaA, List<Integer> listaB) {
		List<Integer> uusiLista = new ArrayList<Integer>();
		for (int i = 0; i < listaA.size(); i++) {
			boolean onlistalla = listaA.contains(listaB.get(i));
			if (onlistalla) {
				uusiLista.add(listaB.get(i));
			}
		}

		return uusiLista;
	}

}