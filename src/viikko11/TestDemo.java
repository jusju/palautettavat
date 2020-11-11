package viikko11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestDemo {

	@Test
	public void testSumOfIntegers() {
		// LUODAAN LASKIJA-OLIO
		Laskija laskija = new Laskija();
		assertEquals(7, laskija.laskeSumma(3, 4));
	}
	// VÄHENNYSOMINAISUUS TDD:LLÄ
	@Test
	public void testDeductionOfIntegers() {
		Laskija laskija = new Laskija();
		assertEquals(3, laskija.laskeErotus(7,4));
	}

}
