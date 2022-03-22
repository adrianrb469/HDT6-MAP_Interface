import java.util.ArrayList;
import java.util.Map;

public class Stock {
	private Map<String, Product> productMap;
	private ArrayList<Product> products;

	/***
	 * Creates a new Stock object Loads the products from the CSV file and assigns
	 * them to the inner Map
	 * 
	 * @param map Implementation to use for the Map
	 */
	public Stock(Map<String, Product> map) {
		productMap = map;
		this.products = new CSVReader().getProducts();
		for (Product product : products) {
			map.put(product.getName(), product);
		}

	}

	/***
	 * Returns a Map<String,Product> with all the available products
	 * 
	 * @return productMap
	 */
	public Map<String, Product> getProductMap() {
		return productMap;
	}

	/***
	 * Returns a string with the category of the product
	 * 
	 * @param product
	 * @return category
	 */
	public String getCategoryOfProduct(String product) {
		return productMap.get(product).getCategory();
	}

}
