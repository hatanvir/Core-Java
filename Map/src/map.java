import java.util.HashMap;


public class map {

	public static void main(String[] args) {
		
		HashMap<Integer, String> MyHashMap = new HashMap<Integer,String>();
		MyHashMap.put(161, "Man");
		MyHashMap.put(162,"Cow");
		
		System.out.println(MyHashMap);
		
		//nested map
		HashMap<Integer, HashMap<Integer, String>> NestedMap = new HashMap<Integer,HashMap<Integer,String>>();
		
		NestedMap.put(111, MyHashMap);
		
		System.out.println(NestedMap);
	}

}
