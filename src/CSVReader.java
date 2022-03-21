import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {

	private final static String PATH = "src/ListadoProducto.csv";
	
	/***
	 * Returns an ArrayList of products given by the CSV file in the src folder
	 * @return products
	 */
	public ArrayList<Product> getProducts() {
		
		ArrayList<Product> products = new ArrayList<>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(PATH));
			String line = "";
			
			// Reads csv file line by line until it finds a blank line
			while ((line = br.readLine()) != null) {
				// Adds the product to the ArrayList
				products.add(new Product(line.split(",")[0], line.split(",")[1], 0)); 
				
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return products;
	}
}
