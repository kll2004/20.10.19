package Day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEX1 {

//	public static void main(String[] args) {
//		HashMap<String, String> map = new HashMap<String,String>();
//		map.put("abc123","abcdefg1234567");
//		map.put("abc123","abc1234");//key 중복
//		map.put("qwe123","qwe123");
//		map.put("asd123","qwe123");//value 중복
		
//		Set<Map.Entry<A, B>> set = map.entrySet();
//		Iterator<Map.Entrty<String, String>> it = set.iterator();
//		while(it.hasNext()) {
//			Map.Entry<String, String> tmp = it.next();
//			System.out.println("ID : " tmp.getkey() + "PW : " + tmp.getValue());
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String,String>();
		map.put("abc123","abcdefg1234567");
		map.put("abc123","abc1234");//key 중복
		map.put("qwe123","qwe123");
		map.put("asd123","qwe123");//value 중복
		
		Set<Map.Entry<String, String>> set = map.entrySet();
		Iterator<Map.Entry<String, String>> it = set.iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> tmp = it.next();
			System.out.println("ID : " + tmp.getKey() + "PW : " + tmp.getValue());
		}
	}
}