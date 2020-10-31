package viikko6;

public class AutoOhjelma {

	public static void main(String[] args) {
		// 1. LUO TESLA-MERKKINEN AUTO
		Auto tesla = new Auto("Tesla");
		// 2. LUO BMW-MERKKINEN AUTO JA LAITA TÄMÄ MUUTTUJAAN
		Auto bmw = new Auto("BMW");
		// 3. Kutsu Teslan aja-metodia arvolla 100
		tesla.aja(100);
		// 4. Kutsu BMW:n aja-metodia arvolla 98
		bmw.aja(98);
		// 5. Kutsu Teslan aja-metodia-arvolla 23
		tesla.aja(23);
		// 6. Tulosta Teslan merkkijonoesitys
		System.out.println(tesla.toString());
		// 7. Tulosta BMW:n merkkijonoesitys
		System.out.println(bmw.toString());
		
	}

}
