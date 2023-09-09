package practice.javaprograms1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class LearnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = new TreeMap<Integer, String>();

		map.put(2616, "Arief");
		map.put(2617, "Load Nattu");
		map.put(2618, "Pulser Petchi");
		map.put(2512, "Navas");
		map.put(2412, "Rohit");
		map.put(2129, "Siva");
		map.put(2012, "Pandi");
		map.put(2013, "Pandi");

		System.out.println(map);

		System.out.println("Size:  " + map.size());

		map.put(2512, "Natpu Navas");
		map.put(2412, "Rohit");
	

		System.out.println(map);

		System.out.println("Size:  " + map.size());

		map.replace(2617, "N Nattu");

		System.out.println(map);

		System.out.println("Size:  " + map.size());
		map.remove(2618);

		System.out.println(map);

		System.out.println("Size:  " + map.size());

		boolean containsKey = map.containsKey(2129);
		System.out.println("containsKey  :" + containsKey);

		boolean containsValue = map.containsValue("Rohit");
		System.out.println("containsValue  :" + containsValue);
		System.out.println("==================================================================");

		Set<Entry<Integer, String>> entrySet = map.entrySet();

		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}

		System.out.println("==================================================================");

		Set<Entry<Integer, String>> entrySet1 = map.entrySet();

		for (Entry<Integer, String> entry : entrySet1) {
			System.out.println(entry.getKey() + "-->" + entry.getValue());
		}

		System.out.println("==================================================================");

		Set<Integer> keySet = map.keySet();
		for (Integer integer : keySet) {
			System.out.println(integer + "-->" + map.get(integer));
		}

	}
}