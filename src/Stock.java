import java.util.ArrayList;
import java.util.Map;

public class Stock {
	private Map<String,Product> productMap;
	private ArrayList<Product> products;

	/***
	 * Loads the products from the CSV and assigns them to the Map
	 * 
	 * @param map Implementation to use for the Map
	 */
	public Stock(Map<String, Product> map) {
		productMap = map;
		this.products = new CSVReader().getProducts();
		for (Product product : products) {
			map.put(product.getName(),product);
		}
		
	}

	public Map<String, Product> getProductMap() {
		return productMap;
	}
	
	public String getCategoryOfProduct(String product) {
		return productMap.get(product).getCategory();
	}

}
