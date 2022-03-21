
public class Product {
	private String category;
	private String name;
	private int quantity;
	
	public Product(String category, String name, int quantity) {
		this.category = category;
		this.name = name;
		this.quantity = quantity;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
