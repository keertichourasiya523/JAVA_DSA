package Hashing;
import java.util.HashSet;
import java.util.Iterator;
public class Hashing {

	public static void main(String[] args) {

		// Hashset
		HashSet<Integer> set = new HashSet<>();
		
		//add
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
//		
//		//search
//		if(set.contains(2)) {
//			System.out.println("2 exist...");
//		}
//		
//		if(!set.contains(7)) {
//			System.out.println("Doesn't contain...");
//		}
//		
//		//delete
//		set.remove(1);
//		if(!set.contains(1)) {
//			System.out.println("Doesn't contain 1 - or we delete 1");
//		}
//		
//		//size
//		System.out.println(set.size());
//		
//		// get all elements
//		System.out.println("All elements of set is..."+set);
//		
		//Iterator
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}

}
