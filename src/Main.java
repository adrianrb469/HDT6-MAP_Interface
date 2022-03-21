import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Menu variables
		Scanner input = new Scanner(System.in);
		boolean quit = false;
		
		String option = "";
		String option2 = "";
		
		int map = 0;
		MapFactory mapFactory = new MapFactory();

		System.out.println("1.HashMap 2.TreeMap 3.LinkedHashMap");
		map = Integer.valueOf(input.nextLine());

		Stock stock = new Stock(mapFactory.getMap(map));
		User user = new User(mapFactory.getMap(map));

		while (!quit) {

			System.out.println("1.Agregar producto a coleccion de usuario" + "\n2.Mostrar categoria de producto"
					+ "\n3.Mostrar coleccion de usuario" + "\n4.Mostrar inventario" + "\n5.Salir");

			option = input.nextLine();

			switch (option) {
			case "1":
				// Add product to user cart
				for (Entry<String, Product> entry : stock.getProductMap().entrySet()) {
					String key = entry.getKey();
					Product value = entry.getValue();
					System.out.println(value.getCategory() + " | " + key);
				}
				System.out.println("Ingrese el nombre del producto a agregar");
				option2 = input.nextLine();
				Product product = stock.getProductMap().get(option2);
				System.out.println("Ingrese la cantidad que desea agregar");
				option2 = input.nextLine();
				product.setQuantity(product.getQuantity() + Integer.valueOf(option2));
				user.addProduct(product);
				break;
			case "2":
				// Gets category of specified product
				System.out.println("Ingrese el nombre del producto");
				option2 = input.nextLine();
				System.out.println(stock.getCategoryOfProduct(option2));
				break;
			case "3":
				// Prints user cart unsorted or sorted
				System.out.println("1.Sin ordernar 2.Ordenados por categoria");
				option2 = input.nextLine();
				Map<String, Product> mapPrinted;
				if (option2.equals("1")) {
					mapPrinted = user.getCart();
				} else {
					mapPrinted = sortByCategory(user.getCart(), mapFactory.getMap(map));
				}
				for (Entry<String, Product> entry : mapPrinted.entrySet()) {
					String key = entry.getKey();
					Product value = entry.getValue();
					System.out.println(value.getCategory() + " | " + key + "| X" + value.getQuantity());
				}

				break;
			case "4":
				// Prints stock items unsorted or sorted
				System.out.println("1.Sin ordernar 2.Ordenados por categoria");
				option2 = input.nextLine();
				
				if (option2.equals("1")) {
					mapPrinted = stock.getProductMap();
				} else {
					mapPrinted = sortByCategory(stock.getProductMap(), mapFactory.getMap(map));
				}
				for (Entry<String, Product> entry : mapPrinted.entrySet()) {
					String key = entry.getKey();
					Product value = entry.getValue();
					System.out.println(value.getCategory() + " | " + key);
				}
				break;
			case "5":
				quit = true;
				break;
			default:
				System.out.println("Opcion incorrecta");

			}

		}

	}

	/***
	 * This function returns a sorted Map<String, Product> in alphabetical order using the
	 * category from the Product or value
	 * @param mapToSort
	 * @param mapImplemented
	 * @return sorted Map<String, Product>
	 */
	public static Map<String, Product> sortByCategory(Map<String, Product> mapToSort,
			Map<String, Product> mapImplemented) {
		// Converts Map into a list
		List<Entry<String, Product>> list = new LinkedList<Entry<String, Product>>(mapToSort.entrySet());

		// Sorts the list using a comparator object.
		// The values to be compared are the categories in the values of the Map
		Collections.sort(list, new Comparator<Entry<String, Product>>() {
			@Override
			public int compare(Entry<String, Product> o1, Entry<String, Product> o2) {
				// compare the two categories
				return o1.getValue().getCategory().compareTo(o2.getValue().getCategory());
			}

		});
		Map<String, Product> sortedMap = mapImplemented;
		for (Entry<String, Product> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;

	}

}
