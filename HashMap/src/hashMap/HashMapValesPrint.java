package hashMap;

import java.util.HashMap;

public class HashMapValesPrint {
	
	public static void main (String []args) {
		
		HashMap<String, String>  empMap=  new HashMap<String, String>();	
		empMap.put("Davis", "Dairy");
		empMap.put("Anton", "Clothing");
		empMap.put("Glen", "Frozen");
		empMap.put("Thing", "Claims");
		
		for(String name :empMap.values())
		{
			System.out.println(" Departments : "+ name);
		}
	}

}
