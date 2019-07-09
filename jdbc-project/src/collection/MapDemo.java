package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> aMap = new HashMap<Integer, String>();
		aMap.put(100, "wuqihui100");
		aMap.put(200, "wuqihui200");
		aMap.put(300, "wuqihui300");
		System.out.println(aMap.size());
		System.out.println(aMap.entrySet());

		Set<Entry<Integer, String>> entries = aMap.entrySet();
		for (Entry<Integer, String> string : entries) {
			System.out.println("String is :" + string);
		}

		Set<Integer> keySet = aMap.keySet();
		for (Integer integer : keySet) {
			System.out.println(integer);
		}
	}
}
