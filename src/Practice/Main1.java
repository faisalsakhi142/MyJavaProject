package Practice;


import java.util.LinkedHashMap;
import java.util.Map;

public class Main1 {

	public static void main(String[] args) {
		Map<String, String>name=new LinkedHashMap<>();
		name.put("Street", "Patrick ST");
		name.put("Suite", "265");
		name.put("City", "Vienna");
		name.put("Zip", "22180");
		name.put("Country", "United State");
		
		for(String keys:name.keySet()) {
			System.out.println(name.get(keys));
		}
		
		
	}

}
