import static org.junit.Assert.*;

import org.junit.Test;

public class CookieOrderTest {

	@Test
	public void shouldBeABleToCreateACokkieOrder() {
		CookieOrder underTest = new CookieOrder(" ", 0); //0 boxes of null
		assertNotNull(underTest); //not null will pass the test
	
	}
	
	@Test
	public void assertThatGetNumBoxesReturnsOne() {
		CookieOrder underTest = new CookieOrder(" ", 1);	
		int check = underTest.getNumBoxes();
		assertEquals(1, check);
	}
	
	@Test
	public void assertThatGetVarietyMatchesUp() {
		CookieOrder underTest = new CookieOrder("test", 1);
		String check = underTest.getVariety();
		assertEquals("test", check);
	}
	
	@Test
	public void assertThatGetTotalBoxesReturnsOne() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("test", 1));
		int check = underTest.getTotalBoxes();
		assertEquals(check, 1);
	}
	
	@Test
	public void assertThatGetTotalBoxesReturnsTwo() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("test1", 1));
		underTest.addOrder(new CookieOrder("test2", 1));
		int check = underTest.getTotalBoxes();
		assertEquals(check, 2);
	}
	@Test
	public void assertThatRemoveVarietyRemovesAnItem() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("test1", 1));
		underTest.addOrder(new CookieOrder("test2", 1));
		underTest.removeVariety("test2");
		int check = underTest.getSize();
		assertEquals(check, 1);
	}
	
	

}
