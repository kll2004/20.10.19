package Day16;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("11");
		set.add("22");
		set.add("33");
		set.add("44");
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String tmp = it.next();
			System.out.println(tmp);
		}
	}

}
