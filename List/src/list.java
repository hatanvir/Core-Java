import java.util.ArrayList;
import java.util.HashSet;


public class list {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Man");
		list.add("Cow");
		list.add("Ant");
		
		System.out.println(list);
		HashSet<String> set = new HashSet<String>();
		
		set.add("Man");
		set.add("Man");
		set.add("Cow");
		
		System.out.println(set);
	}

}
