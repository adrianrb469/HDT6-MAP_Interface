
public class Product {
	private String category;
	private String name;
	private int quantity;

	/***
	 * Creates a new product
	 * 
	 * @param category
	 * @param name
	 * @param quantity
	 */
	public Product(String category, String name, int quantity) {
		this.category = category;
		this.name = name;
		this.quantity = quantity;
	}

	/***
	 * Returns a string with the category
	 * 
	 * @return category
	 */
	public String getCategory() {
		return category;
	}

	/***
	 * Sets the new category
	 * 
	 * @param category
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/***
	 * Returns a string with the product name
	 * 
	 * @return category
	 */
	public String getName() {
		return name;
	}

	/***
	 * Sets the new product name
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/***
	 * Returns an integer with the current quantity
	 * 
	 * @return category
	 */
	public int getQuantity() {
		return quantity;
	}

	/***
	 * Sets the new quantity
	 * 
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
