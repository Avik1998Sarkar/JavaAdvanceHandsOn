import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {
	@Test
	public void addProductTest() {
		Product login = new Product("root", "root", 95.99);
		ProductDAO productDAO = new ProductDAO();
		assertTrue(productDAO.addProduct(login));
	}
	@Test
	public void addProductTest_2() {
		ProductDAO productDAO = new ProductDAO();
		assertFalse(productDAO.addProduct(null));
	}
	@Test
	public void addProductTest_3() {
		Product login = new Product();
		ProductDAO productDAO = new ProductDAO();
		assertTrue(productDAO.addProduct(login));
	}
	@Test
	public void deleteProductTest() {
		Product login = new Product("root", "root", 95.99);
		ProductDAO productDAO = new ProductDAO();
		productDAO.addProduct(login);
		assertTrue(productDAO.deleteProduct(login));
	}
	@Test
	public void deleteProductTest_2() {
		ProductDAO productDAO = new ProductDAO();
		assertFalse(productDAO.deleteProduct(null));
	}
	@Test
	public void deleteProductTest_3() {
		Product login = new Product("root", "root", 95.99);
		ProductDAO productDAO = new ProductDAO();
		assertFalse(productDAO.deleteProduct(login));
	}
	@Test
	public void deleteProductTest_4() {
		Product login = new Product();
		ProductDAO productDAO = new ProductDAO();
		assertFalse(productDAO.deleteProduct(login));
	}
	@Test
	public void deleteProductTest_5() {
		Product login = new Product("root", "root", 95.99);
		login.setProductName(null);
		ProductDAO productDAO = new ProductDAO();
		assertFalse(productDAO.deleteProduct(login));
	}
	@Test
	public void deleteProductTest_6() {
		Product login = new Product("root", "root", 95.99);
		login.setProductId(null);
		ProductDAO productDAO = new ProductDAO();
		assertFalse(productDAO.deleteProduct(login));
	}
	@Test
	public void deleteProductTest_7() {
		Product login = new Product("root", "root", 95.99);
		login.setProductName(null);
		login.setProductId(null);
		ProductDAO productDAO = new ProductDAO();
		assertFalse(productDAO.deleteProduct(login));
	}
}