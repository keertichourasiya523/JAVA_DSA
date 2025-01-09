package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapDemo {

	public static void main(String[] args) {
		//country(key) population(value)
		HashMap<String,Integer> map = new HashMap<>();
//		
//		//Insert
		map.put("India", 120);
		map.put("China", 150);
		map.put("US", 30);
//		
//		System.out.println(map);//hashmap will print in unordered way or unsortedly
//		
//		map.put("China", 180);// map.put() will update value if key is already exist
//		System.out.println(map);
//		
//		
//		//Search
//		if(map.containsKey("Indonesia")) {
//			System.out.println("Key is present in the map");
//		}else {
//			System.out.println("Key is not present in the map");
//		}
//		
//		
//		//get the value
//		System.out.println(map.get("China"));
//		System.out.println(map.get("Indonesia"));
//
//		
		
		
//		int arr[]= {12,15,50,30};
//		
//		for(int i=0;i<4;i++) {
//			System.out.println(arr[i]);
//		}
//		
//		System.out.println();
//		
//		for(int x:arr){
//			System.out.println(x);
//		}
//		
//		for(Map.Entry<String, Integer> e : map.entrySet()) {
//			
//			System.out.print(e.getKey() +" ");
//			System.out.println(e.getValue());
//			
//		}
//		
//		Set<String> keys = map.keySet();
//		for(String key:keys) {
//			System.out.println(key +" " +map.get(key));
//		}
//		
		//remove
		map.remove("China");
		System.out.println(map);
		
		
		
	}

}
