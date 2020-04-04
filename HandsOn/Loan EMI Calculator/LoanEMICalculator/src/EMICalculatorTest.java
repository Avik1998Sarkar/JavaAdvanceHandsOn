import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


public class EMICalculatorTest {
	@Test
	public void testCalculateEMI_1() {
		EMICalculator emiCalculator = new EMICalculator();
		double expected = emiCalculator.calculateEMI(10000, "Housing Loan", 15);
		double rate = 0.12;
		rate = rate / (12 * 100);
		double durationInYears = 15 * 12;
		double actual = (10000 * rate * Math.pow(1 + rate, durationInYears))
				/ (Math.pow(1 + rate, durationInYears) - 1);
		boolean state = false;
		if(expected == actual) {
			state = true;
		}
		assertTrue(state);
	}
	@Test
	public void testCalculateEMI_2() {
		EMICalculator emiCalculator = new EMICalculator();
		double expected = emiCalculator.calculateEMI(10000, "Vehicle Loan", 15);
		double rate = 0.11;
		rate = rate / (12 * 100);
		double durationInYears = 15 * 12;
		double actual = (10000 * rate * Math.pow(1 + rate, durationInYears))
				/ (Math.pow(1 + rate, durationInYears) - 1);
		boolean state = false;
		if(expected == actual) {
			state = true;
		}
		assertTrue(state);
	}
	@Test
	public void testCalculateEMI_3() {
		EMICalculator emiCalculator = new EMICalculator();
		double expected = emiCalculator.calculateEMI(10000, "Personal Loan", 15);
		double rate = 0.10;
		rate = rate / (12 * 100);
		double durationInYears = 15 * 12;
		double actual = (10000 * rate * Math.pow(1 + rate, durationInYears))
				/ (Math.pow(1 + rate, durationInYears) - 1);
		boolean state = false;
		if(expected == actual) {
			state = true;
		}
		assertTrue(state);
	}
	@Test
	public void testCalculateEMI_4() {
		EMICalculator emiCalculator = new EMICalculator();
		double expected = emiCalculator.calculateEMI(9999, "Personal Loan", 25);
		double rate = 0.10;
		rate = rate / (12 * 100);
		double durationInYears = 25 * 12;
		double actual = (9999 * rate * Math.pow(1 + rate, durationInYears))
				/ (Math.pow(1 + rate, durationInYears) - 1);
		boolean state = false;
		if(expected == actual) {
			state = true;
		}
		assertFalse(state);
	}
}
