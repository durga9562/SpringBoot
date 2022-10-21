package collections;

import java.util.*;
import java.util.Map.Entry;
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,Integer> map=new HashMap<>();

map.put("a", 1);
map.put("b", 2);
map.put("c", 3);

System.out.println("Size of map is: " + map.size());
System.out.println(map);

if(map.containsKey("a")){
	Integer a=map.get("a");
	System.out.println("Value for key" + " \"a\" is:- " + a);
}

for(String key:map.keySet()){
	System.out.println("key: "+ key+", value: " + map.get(key));
}

for(Entry<String, Integer> entry: map.entrySet()){
	System.out.println("key" + entry.getKey() + ", value: " + entry.getValue());
}
	}

}
