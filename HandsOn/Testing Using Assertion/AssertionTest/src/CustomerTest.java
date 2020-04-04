import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CustomerTest {
	@Test
	public void isValidAadharNo_test1() {
		assertTrue(Customer.isValidAadharNo("298765432101"));
	}
	@Test
	public void isValidAadharNo_test2() {
		assertFalse(Customer.isValidAadharNo("2123498765432101"));
	}
	@Test
	public void notNullEmail_test1() {
		Customer customer = new Customer("298765432101", "AVIK", "SARKAR", "MIDNAPORE", 9876543210L, "851500@cognizant.com");
		assertNotNull(customer.getEmailId());
	}
	@Test
	public void notNullEmail_test2() {
		Customer customer = new Customer("298765432101", "AVIK", "SARKAR", "MIDNAPORE", 9876543210L, null);
		assertNull(customer.getEmailId());
	}
}
