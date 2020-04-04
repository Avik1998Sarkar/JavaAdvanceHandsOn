import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LoginTest {
	@Test
	public void addLoginTest() {
		Login login = new Login("root", "root");
		LoginDAO loginDAO = new LoginDAO();
		assertTrue(loginDAO.addLogin(login));
	}
	@Test
	public void addLoginTest_2() {
		LoginDAO loginDAO = new LoginDAO();
		assertFalse(loginDAO.addLogin(null));
	}
	@Test
	public void deleteLoginTest() {
		Login login = new Login("root", "root");
		LoginDAO loginDAO = new LoginDAO();
		loginDAO.addLogin(login);
		assertTrue(loginDAO.deleteLogin(login));
	}
	@Test
	public void deleteLoginTest_2() {
		LoginDAO loginDAO = new LoginDAO();
		assertFalse(loginDAO.deleteLogin(null));
	}
	@Test
	public void deleteLoginTest_3() {
		Login login = new Login("root", "root");
		LoginDAO loginDAO = new LoginDAO();
		assertFalse(loginDAO.deleteLogin(login));
	}
	@Test
	public void deleteLoginTest_4() {
		Login login = new Login("root", "root");
		login.setPassword(null);
		LoginDAO loginDAO = new LoginDAO();
		assertFalse(loginDAO.deleteLogin(login));
	}
	@Test
	public void deleteLoginTest_5() {
		Login login = new Login("root", "root");
		login.setUserName(null);
		LoginDAO loginDAO = new LoginDAO();
		assertFalse(loginDAO.deleteLogin(login));
	}
}