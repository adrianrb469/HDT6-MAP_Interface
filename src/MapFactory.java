import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapFactory {

	public MapFactory() {
		 
	}

	/***
	 * This method returns a specific Map implementation
	 * 0 = Hashmap 1 = LinkedHashMap 2 = TreeMap
	 * @param map
	 * @return selected Map implementation
	 */
	public Map<String, String[]> getMap(int map){
		switch (map) {
			case 0:
				return new HashMap<String, String[]>();
			case 1:
				return new LinkedHashMap<String, String[]>();
			case 2:
				return new TreeMap<String, String[]>();
		}
		return null;
	}
}
