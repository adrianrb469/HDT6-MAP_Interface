import java.util.ArrayList;
import java.util.Map;

public class User {
	private Map<String,Product> cart;

	/***
	 * Initializes a User with an empty cart
	 * 
	 * @param map Implementation to use for the Map
	 */
	public User(Map<String, Product> map) {
		cart = map;

	}
	
	/***
	 * Adds a product to the user's cart
	 * @param product
	 */
	public void addProduct(Product product) {
		cart.put(product.getName(), product);
	}
	
	/***
	 * Returns a Map<String, Product> with the user's cart
	 * @return cart
	 */
	public Map<String, Product> getCart() {
		return cart;
	}
	
}
