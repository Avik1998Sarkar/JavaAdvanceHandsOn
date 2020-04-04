import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EBBillTest {
	@Test
	public void calculateBillAmount_less_than_0() {
		EBBill eb = new EBBill(-20);
		assertEquals(0, eb.calculateBillAmount(), 0);
	}

	@Test
	public void calculateBillAmount_less_than_50() {
		EBBill eb = new EBBill(40);
		assertEquals(104.00, eb.calculateBillAmount(), 2);
	}

	@Test
	public void calculateBillAmount_less_than_100() {
		EBBill eb = new EBBill(70);
		assertEquals(195.00, eb.calculateBillAmount(), 2);
	}

	@Test
	public void calculateBillAmount_less_than_200() {
		EBBill eb = new EBBill(150);
		assertEquals(555.50, eb.calculateBillAmount(), 2);
	}

	@Test
	public void calculateBillAmount_less_than_1000() {
		EBBill eb = new EBBill(500);
		assertEquals(3143.50, eb.calculateBillAmount(), 2);
	}

	@Test
	public void calculateBillAmount_less_than_5000() {
		EBBill eb = new EBBill(1500);
		assertEquals(12018.50, eb.calculateBillAmount(), 2);
	}

	@Test
	public void calculateBillAmount_more_than_5000() {
		EBBill eb = new EBBill(5010);
		assertEquals(0, eb.calculateBillAmount(), 0);
	}
}