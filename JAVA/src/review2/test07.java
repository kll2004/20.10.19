package review2;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Iterator;

public class test07 {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String, String>();
		Scanner scan = new Scanner(System.in);
//		map.put("2020160001", "홍길동");
//		map.put("2020160002", "임꺽정");
//		Iterator<String> it = map.keySet().iterator();
//		while(it.hasNext()) {
//			String key = it.next();
//			String value = map.get(key);
//			System.out.println("학번 : " + key + ", 이름 : " + value);
//		}
		System.out.print("단어 갯수 : ");
		int size =scan.nextInt();
		while(map.size()<size) {
			System.out.print("단어 : ");
			String word = scan.next();
			System.out.print("의미 : ");
			String mean = scan.next();
			map.put(word, mean);
		}
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String word = it.next();
			String mean = map.get(word);
			System.out.println("단어 : " + word + ", 뜻 : " + mean);
		}
	}

}
